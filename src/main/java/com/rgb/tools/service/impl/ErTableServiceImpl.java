package com.rgb.tools.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rgb.tools.dao.mapper.ErTableMapper;
import com.rgb.tools.dao.model.erm.ERTable;
import com.rgb.tools.service.ErTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ER表 服务实现类
 * </p>
 *
 */
@Service
public class ErTableServiceImpl extends ServiceImpl<ErTableMapper, ERTable> implements ErTableService {

    @Autowired
    private ErTableMapper tableMapper;
}
