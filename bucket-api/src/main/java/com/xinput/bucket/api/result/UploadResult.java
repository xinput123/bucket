package com.xinput.bucket.api.result;

/**
 * 上传单个文件结果
 *
 * @Author: xinput
 */
public class UploadResult {
    private String eTag;

    private String key;

    private String location;

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
