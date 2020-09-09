package com.xinput.bucket.api.result;

import java.util.List;

/**
 * bucket 指定前缀路径
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-07-10 15:23
 */
public class BucketObjectResult {

    /**
     * 共享公共前缀的其他对象键
     */
    private List<String> commonPrefixes;

    /**
     * 匹配的对象元信息列表
     */
    private List<BucketObjectKeyModel> keyModels;

    /**
     * 如果请求中指定了 prefix 参数 , 则响应中包含该元素
     */
    private String prefix;

    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

    public List<BucketObjectKeyModel> getKeyModels() {
        return keyModels;
    }

    public void setKeyModels(List<BucketObjectKeyModel> keyModels) {
        this.keyModels = keyModels;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
