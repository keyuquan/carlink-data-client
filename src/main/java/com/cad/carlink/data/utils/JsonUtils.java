package com.cad.carlink.data.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonUtils {
    public static  Gson gson =null ;
    public static <T> T fromJson(String json, Type listType){
        if(gson==null){
            gson = new Gson();
        }
        T t = gson.fromJson(json,listType);
        return t;
    }
}
