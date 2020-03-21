package com.monster.springcloud.alibaba.service;


/**
 * @author lipengfei
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
