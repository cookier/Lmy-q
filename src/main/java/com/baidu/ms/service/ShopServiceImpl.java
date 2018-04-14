package com.baidu.ms.service;

import com.baidu.ms.mapper.ShopMapper;
import com.baidu.ms.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lmy on 2017/2/21.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired(required = false)
    ShopMapper shopMapper;


    @Override
    public Shop getLatestShopByUser(Integer userId) throws Exception {
        return shopMapper.getLatestShopByUser(userId);
    }

    @Override
    public void testReft() {
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
        System.out.println("diaodiaodiaodsljkfasdljkfdsjkl;fjlk");
    }
}
