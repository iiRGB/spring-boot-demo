package com.rgb.tools.controller;

import com.rgb.tools.rservice.InitService;
import com.rgb.tools.web.vo.ResultVO;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/init")
public class InitController {

    @Autowired
    InitService initService;

    /**
     * 文件上传（单文件上传）
     *
     * @param file
     * @return
     *
     */
    @PostMapping(value = "/upload")
    @ResponseBody
    public ResultVO upload(@RequestParam("file") MultipartFile file) {
        String xmlStr;
        if (!file.isEmpty()) {
            try {
                xmlStr = XML.toJSONObject(new String(file.getBytes())).toString();
            } catch (Exception e) {
                return ResultVO.error("文件解析失败.");
            }
        } else {
            return ResultVO.error("上传失败，文件不能为空.");
        }
        initService.parseErm(xmlStr);
        return ResultVO.success("上传成功！");
    }
}
