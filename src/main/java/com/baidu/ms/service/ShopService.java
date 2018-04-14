package com.baidu.ms.service;

import com.baidu.ms.pojo.Shop;

/**
 * Created by lmy on 2017/2/21.
 */
public interface ShopService {
    public Shop getLatestShopByUser(Integer userId) throws Exception;

    public void testReft();
}
