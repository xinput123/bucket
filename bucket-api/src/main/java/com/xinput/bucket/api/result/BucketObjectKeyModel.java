package com.xinput.bucket.api.result;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-07-10 18:08
 */
public class BucketObjectKeyModel {

    /**
     * 对象内容的唯一标示 (该值会使用双引号括起来)
     */
    private String etag;

    /**
     * 对象名称
     */
    private String key;

    /**
     * 对象修改时间
     */
    private Long modified;

    /**
     * 对象大小
     */
    private Long size;

    public BucketObjectKeyModel() {
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getModified() {
        return modified;
    }

    public void setModified(Long modified) {
        this.modified = modified;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

}
