package com.taotao.portal.pojo;

import com.taotao.pojo.TbItem;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 9:47
 **/
public class ItemInfo extends TbItem {

    public String[] getImages() {
        String image = getImage();
        if (image != null) {
            String[] images = image.split(",");
            return images;
        }
        return null;
    }
}