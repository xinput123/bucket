package com.xinput.bucket.api.domain;

/**
 * @Author: xinput
 * @Date: 2020-05-25 14:37
 */
public class BucketDetailInfo {

    /**
     * bucket名称
     */
    private String bucketName;

    /**
     * bucket的区域，现在只支持在同一个区域，也是 Region
     */
    private String bucketZone;

    /**
     * 对外服务的访问域名
     * 七牛云的域名比较恶心，需要自己绑定一个域名，否则会在30天后回收，虽然可以用S3协议去做，
     * 但是嫌弃麻烦，也会放弃七牛云的api，请绑定https域名
     * BucketAuthInfo 也有一个域名，不冲突
     */
    private String endPoint;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketZone() {
        return bucketZone;
    }

    public void setBucketZone(String bucketZone) {
        this.bucketZone = bucketZone;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
