package com.xinput.bucket.api;

import com.xinput.bucket.api.domain.BucketAuthInfo;
import com.xinput.bucket.api.domain.BucketException;
import com.xinput.bucket.api.domain.FileUploadInfo;
import com.xinput.bucket.api.result.BucketObjectResult;
import com.xinput.bucket.api.result.CopyResult;
import com.xinput.bucket.api.result.ObjectMetadataResult;
import com.xinput.bucket.api.result.UploadResult;

import java.io.File;
import java.io.InputStream;

/**
 * @Author: xinput
 * @Date: 2020-05-19 15:59
 */
public interface BucketApi {

    /**
     * 初始化对象存储信息，验证账号
     *
     * @param bucketAuthInfo 验证所需要基本信息，ak，sk
     * @throws BucketException
     */
    void initBucket(BucketAuthInfo bucketAuthInfo) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param file       上传的文件
     * @param objectKey  上传的文件的key
     * @return
     * @throws Throwable
     */
    UploadResult uploadFile(String bucketName, File file, String objectKey) throws Throwable;

    /**
     * @param bucketName     bucket名称
     * @param inputStream
     * @param fileUploadInfo
     * @param objectKey
     * @return
     * @throws Throwable
     */
    UploadResult uploadFile(String bucketName, InputStream inputStream, FileUploadInfo fileUploadInfo, String objectKey) throws Throwable;

    /**
     * @param bucketName bucket名称
     * @param filePath
     * @param objectKey
     * @throws Throwable
     */
    void uploadPathFiles(String bucketName, String filePath, String objectKey) throws Throwable;

    /**
     * @param bucketName bucket名称
     * @param prefix
     * @return
     * @throws BucketException
     */
    BucketObjectResult listObjects(String bucketName, String prefix) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param prefix
     * @param delimiter
     * @return
     * @throws BucketException
     */
    BucketObjectResult listObjects(String bucketName, String prefix, String delimiter) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param objectKey
     * @return
     * @throws BucketException
     */
    InputStream getObjectInputStream(String bucketName, String objectKey) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param objectKey
     * @return
     * @throws BucketException
     */
    String getObjectContent(String bucketName, String objectKey) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param objectKey
     * @param expire
     * @return
     * @throws BucketException
     */
    String getObjectShareUrl(String bucketName, String objectKey, int expire) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param objectKey
     * @param expire
     * @param fileName
     * @return
     * @throws BucketException
     */
    String getObjectShareUrl(String bucketName, String objectKey, int expire, String fileName) throws BucketException;

    /**
     * @param bucketName      bucket名称
     * @param sourceObjectKey
     * @param targetObjectKey
     * @return
     * @throws BucketException
     */
    CopyResult copy(String bucketName, String sourceObjectKey, String targetObjectKey) throws BucketException;

    /**
     * @param fromBucket
     * @param sourceObjectKey
     * @param targetBucket
     * @param targetObjectKey
     * @return
     * @throws BucketException
     */
    CopyResult copy(String fromBucket, String sourceObjectKey, String targetBucket, String targetObjectKey) throws BucketException;

    /**
     * @param bucketName bucket名称
     * @param objectKey
     * @return
     * @throws BucketException
     */
    ObjectMetadataResult getHeadObject(String bucketName, String objectKey) throws BucketException;

    /**
     * 删除对象对象存储文件
     *
     * @param bucketName bucket名称
     * @param objectKey
     * @throws BucketException
     */
    void deleteObject(String bucketName, String objectKey) throws BucketException;

}
