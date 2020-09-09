package com.xinput.bucket.api.consts;

import com.xinput.bleach.util.Logs;
import com.xinput.bleach.util.SimpleProperties;
import org.slf4j.Logger;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @date 2019-07-10 20:00
 */
public class BucketConst {

    private static final Logger logger = Logs.get();

    private static SimpleProperties SP;

    static {
        try {
            SP = SimpleProperties.readConfiguration("system.properties");
        } catch (Exception e) {
            logger.warn("not found system.properties");
            SP = new SimpleProperties();
        }
    }

    public static final int MAX_KEY_SIZE = SP.getIntProperty("bucket.key.size", 100);

    /**
     * 是否是https,用于七牛云
     */
    public static final boolean isHttps = SP.getBooleanProperty("bucket.endpoint.https", Boolean.FALSE);

    /**
     * 默认过期时间，单位秒
     */
    public static final int EXPIRE_TIME = SP.getIntProperty("bucket.key.expire", 300);


}
