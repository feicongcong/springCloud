package com.SpringCloudAll.feign.common.tool;

import com.SpringCloudAll.feign.common.component.SpringComponent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by jw on 2017/3/15.
 */
public class JsonTools {

    public static String encode(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = SpringComponent.getBean(ObjectMapper.class);
        return objectMapper.writeValueAsString(obj);
    }

    public static <T> T decode(String json, Class<T> classOfT) throws IOException {
        ObjectMapper objectMapper = SpringComponent.getBean(ObjectMapper.class);
        return objectMapper.readValue(json, classOfT);
    }



}
