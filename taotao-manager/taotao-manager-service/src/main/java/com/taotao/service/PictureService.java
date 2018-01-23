package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 10:20
 **/
public interface PictureService {

    Map uploadPicture(MultipartFile uploadFile);
}
