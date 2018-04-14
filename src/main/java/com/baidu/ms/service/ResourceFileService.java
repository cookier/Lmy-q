package com.baidu.ms.service;

import com.baidu.ms.pojo.ResourceFile;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface ResourceFileService {
    public boolean createResourceFile(ResourceFile resourceFile) throws Exception;

    public ResourceFile getResourceFile(Integer id) throws Exception;
}
