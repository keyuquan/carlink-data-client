package com.cad.carlink.data.client;

import com.cad.carlink.data.constants.Constants;
import com.cad.carlink.data.bean.ImpTiVEcgoodsBean;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.util.List;

/**
 * 车辆基础信息表 同步
 */
public class ImpTiVEcgoodsClient {

    public static void main(String[] args) {
        HttpClientResult result;

        try {
            int pageIndex = 1;
            do {
                result = ClientUtils.getHttpClientResult ( Constants.TABLE_IMP_TI_VECGOODS, 0, pageIndex );
                List<ImpTiVEcgoodsBean> stus = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<ImpTiVEcgoodsBean>> () { }.getType () );
                File file = FileUtils.createNewFile ( Constants.LOG_KL_IMP_TI_VECGOODS + pageIndex + ".log" );

                for (ImpTiVEcgoodsBean bean : stus) {
                    FileUtils.appendTofile ( file, StringUtils.replaceBlank ( bean.getContext () ) );
                }

                FileUtils.closeWriter ();
                pageIndex++;

            } while (!result.getContent ().equals ( "[]" ));

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }




}
