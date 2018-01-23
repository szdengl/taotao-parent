package com.taotao.controller;

import com.taotao.common.util.JsonUtils;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 10:48
 **/
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String  pictureUpload(MultipartFile uploadFile){
        Map result=pictureService.uploadPicture(uploadFile);
        return JsonUtils.objectToJson(result);
    }

}
