package com.cad.carlink.data.utils;

import com.cad.carlink.data.constants.Constants;

import java.util.HashMap;
import java.util.Map;

public class ClientUtils {

    public static HttpClientResult getHttpClientResult(String tableCode, String markId, int pageIndex) throws Exception {

        Map<String, String> params = new HashMap ();
        params.put ( "markId", markId );
        params.put ( "apiCatId", Constants.apiCatId );
        params.put ( "tableCode", tableCode );
        params.put ( "pageIndex", pageIndex + "" );
        HttpClientResult result = HttpClientUtils.doGet ( Constants.url, params );
        return result;
    }

}
