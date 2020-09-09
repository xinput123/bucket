package com.xinput.bucket.api.result;

/**
 * @Author: xinput
 * @Date: 2020-05-22 18:26
 */
public class CopyResult {

    private boolean success;

    private String etag;

    private Long lastModified;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }
}
