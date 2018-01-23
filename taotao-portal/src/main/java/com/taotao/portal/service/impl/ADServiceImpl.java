package com.taotao.portal.service.impl;

import com.taotao.common.util.HttpClientUtil;
import com.taotao.common.util.JsonUtils;
import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.portal.pojo.ADItem;
import com.taotao.portal.service.AdService;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 13:37
 **/
public class ADServiceImpl  implements AdService {

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${INDEX_AD1_URL}")
    private String INDEX_AD1_URL;

    @Override
    public String getAdItemList() throws Exception {
        //调用服务层的服务查询打广告位的数据
        String result = HttpClientUtil.doGet(REST_BASE_URL + INDEX_AD1_URL);
        //把json数据转换成对象
        TaotaoResult taotaoResult = TaotaoResult.formatToList(result, TbContent.class);
        List<ADItem> itemList = new ArrayList<>();
        if (taotaoResult.getStatus() == 200 ) {
            List<TbContent> contentList = (List<TbContent>) taotaoResult.getData();
            for (TbContent tbContent : contentList) {
                ADItem item = new ADItem();
                item.setHeight(240);
                item.setWidth(670);
                item.setSrc(tbContent.getPic());
                item.setHeightB(240);
                item.setWidth(550);
                item.setSrcB(tbContent.getPic2());
                item.setAlt(tbContent.getTitleDesc());
                item.setHref(tbContent.getUrl());
                itemList.add(item);
            }

        }
        return JsonUtils.objectToJson(itemList);
    }
}
