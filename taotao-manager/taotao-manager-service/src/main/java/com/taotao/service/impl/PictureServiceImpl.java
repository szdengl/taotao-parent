package com.taotao.service.impl;

import com.taotao.common.util.FtpUtil;
import com.taotao.common.util.IDUtils;
import com.taotao.service.PictureService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 10:21
 **/
@Service
public class PictureServiceImpl implements PictureService {

    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;
    @Value("${FTP_PORT}")
    private Integer FTP_PORT;
    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;
    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;
    @Value("${FTP_BASE_PATH}")
    private String FTP_BASE_PATH;
    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;

    @Override
    public Map uploadPicture(MultipartFile uploadFile) {
        Map resultMap = new HashMap<>();
        try {
            String oldName = uploadFile.getOriginalFilename();

            String newName = IDUtils.genImageName();
            newName = newName + oldName.substring(oldName.lastIndexOf("."));
            String imagePath=  new DateTime().toString("/yyyy/MM/dd");
            boolean result= FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH,
                    imagePath , newName, uploadFile.getInputStream());

            if(!result){
                resultMap.put("error", 1);
                resultMap.put("message", "文件上传失败");
                return resultMap;
            }else {
                resultMap.put("error",0);
                resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
                return resultMap;
            }

        } catch (Exception ex) {
            resultMap.put("error", 1);
            resultMap.put("message", "文件上传失败");
            return resultMap;
        }
    }
}
