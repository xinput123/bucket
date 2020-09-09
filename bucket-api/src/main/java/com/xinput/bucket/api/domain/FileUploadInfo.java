package com.xinput.bucket.api.domain;

/**
 * @Author: xinput
 * @Date: 2020-06-24 11:48
 */
public class FileUploadInfo {

    /**
     * 上传的文件名称
     */
    private String name;

    /**
     * 上传的文件大小，单位 KB
     */
    private long size;

    /**
     * 文件md5值
     */
    private String md5;

    /**
     * 文件类型
     */
    private String contentType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
