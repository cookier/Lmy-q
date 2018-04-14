package com.baidu.ms.service;

import com.baidu.ms.mapper.ResourceFileMapper;
import com.baidu.ms.pojo.ResourceFile;
import com.baidu.ms.util.UrlKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class ResourceFileServiceImpl implements ResourceFileService {
    @Autowired(required = false)
    ResourceFileMapper resourceFileMapper;

    @Override
    public boolean createResourceFile(ResourceFile resourceFile) throws Exception {
        boolean flag = resourceFileMapper.insert(resourceFile) > 0;

        if (flag) {
            resourceFile.setUrl(UrlKit.getResourceFileUrl(resourceFile));
            flag = resourceFileMapper.updateByPrimaryKey(resourceFile) > 0;
        }

        return flag;
    }

    @Override
    public ResourceFile getResourceFile(Integer id) throws Exception {
        return resourceFileMapper.selectByPrimaryKey(id);
    }
}
