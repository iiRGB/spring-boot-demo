package com.rgb.tools.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rgb.tools.dao.mapper.ErCategoryMapper;
import com.rgb.tools.dao.model.erm.ERCategory;
import com.rgb.tools.service.ErCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ER分类 服务实现类
 * </p>
 *
 */
@Service
public class ErCategoryServiceImpl extends ServiceImpl<ErCategoryMapper, ERCategory> implements ErCategoryService {

}
