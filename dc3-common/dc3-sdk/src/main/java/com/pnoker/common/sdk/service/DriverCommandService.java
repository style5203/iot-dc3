package com.pnoker.common.sdk.service;

/**
 * @author pnoker
 */
public interface DriverCommandService {

    /**
     * 读操作
     *
     * @param deviceId
     * @param pointId
     * @return
     */
    String read(Long deviceId, Long pointId);

    /**
     * 写操作
     *
     * @param deviceId
     * @param pointId
     * @param value
     * @return
     */
    Boolean write(Long deviceId, Long pointId, String value);

}
