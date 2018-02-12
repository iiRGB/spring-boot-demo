package com.rgb.tools.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.rgb.tools.dao.model.erm.ERTable;
import com.rgb.tools.service.ErTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * ER表 前端控制器
 * </p>
 *
 */
@Controller
@RequestMapping("/erTable")
public class ErTableController {

    @Autowired
    ErTableService tableService;

    @ResponseBody
    @PostMapping("/add")
    public Object add(@RequestBody ERTable erTable) {
        tableService.insert(erTable);
        Page<ERTable> erTablePage = tableService.selectPage(new Page<>(1, 10));
        return erTablePage;
    }

}

