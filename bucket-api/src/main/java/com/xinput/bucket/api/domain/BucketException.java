package com.xinput.bucket.api.domain;

/**
 * @Author: xinput
 * @Date: 2020-05-22 16:57
 */
public class BucketException extends Exception {

    private static final long serialVersionUID = -7461674590109678090L;

    public BucketException() {
        super();
    }

    public BucketException(String message) {
        super(message);
    }

    public BucketException(String message, Throwable cause) {
        super(message, cause);
    }

    public BucketException(Throwable cause) {
        super(cause);
    }

    public BucketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
