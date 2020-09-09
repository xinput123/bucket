package com.xinput.bucket.api.domain;

import java.util.List;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-07-16 12:18
 */
public class BucketAuthInfo {

    private String accessKey;

    private String accessSecret;

    /**
     * 对外服务的访问域名
     */
    private String endPoint;

    /**
     * 区域
     */
    private String zone;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    private List<BucketDetailInfo> bucketDetailInfos;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public List<BucketDetailInfo> getBucketDetailInfos() {
        return bucketDetailInfos;
    }

    public void setBucketDetailInfos(List<BucketDetailInfo> bucketDetailInfos) {
        this.bucketDetailInfos = bucketDetailInfos;
    }
}
