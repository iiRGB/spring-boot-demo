package com.rgb.tools.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tis.tools.model.po.ac.AcOperatorIdentity;
import org.tis.tools.rservice.ac.capable.IAuthenticationRService;

import java.util.List;

/**
 * <p>
 * ER分类 前端控制器
 * </p>
 *
 */
@Controller
@RequestMapping("/erCategory")
public class ErCategoryController {

    @Autowired
    IAuthenticationRService authenticationRService;

    @ResponseBody
    @RequestMapping("/aaa")
    public Object aaa() {
        List<AcOperatorIdentity> admin = authenticationRService.userStatusCheck("admin");
        return "aaaaaa";
    }

}

