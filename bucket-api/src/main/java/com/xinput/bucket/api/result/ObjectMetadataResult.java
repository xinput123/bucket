package com.xinput.bucket.api.result;

/**
 * 对象元信息(封装后，只需要部分信息即可)
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-07-08 19:42
 */
public class ObjectMetadataResult {

    private Long contentLength;

    /**
     * 文件类型
     */
    private String contentType;

    /**
     * 最后修改时间
     */
    private Long lastModified;

    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }
}
