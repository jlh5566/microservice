package com.kk;

import java.util.concurrent.TimeUnit;

public interface RedisService {

    void set(String key, String value);

    void setWithTime(String key, String value, Long expireTime);

    String get(String key);
    boolean exists(String key);
    void expire(String key, long timeout, TimeUnit unit);
    void delete(String key);
}
