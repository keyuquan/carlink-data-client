package com.cad.carlink.data.client;

import com.cad.carlink.data.constants.Constants;
import com.cad.carlink.data.bean.ImpTiOwnerBean;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.util.List;

/**
 * 业主信息表同步
 */
public class ImpTiOwnerClient {


    public static void main(String[] args) {

        String markId = args[0].replace ( "-", "" ) + "000000000";

        HttpClientResult result;

        try {
            int pageIndex = 1;
            do {
                result = ClientUtils.getHttpClientResult ( Constants.TABLE_IMP_TI_OWNER, 0, pageIndex );
                List<ImpTiOwnerBean> stus = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<ImpTiOwnerBean>> () {
                }.getType () );
                File file = FileUtils.createNewFile ( Constants.LOG_IMP_TI_OWNER + pageIndex + ".log" );

                for (ImpTiOwnerBean bean : stus) {
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
