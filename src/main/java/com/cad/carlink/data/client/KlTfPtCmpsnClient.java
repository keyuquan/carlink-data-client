package com.cad.carlink.data.client;

import com.cad.carlink.data.constants.Constants;
import com.cad.carlink.data.bean.KlTfPtCmpsnBean;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.util.List;

/**
 * 道路运输从业人员信息
 */
public class KlTfPtCmpsnClient {

    public static void main(String[] args) {
        HttpClientResult result ;

        try {
            int pageIndex = 1;
            do {
                result =  ClientUtils.getHttpClientResult ( Constants.TABLE_KL_TF_PT_CMPSN,0,pageIndex );
                List<KlTfPtCmpsnBean> stus = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<KlTfPtCmpsnBean>> () { }.getType () );
                File file = FileUtils.createNewFile ( Constants.LOG_PATH_KL_TF_PT_CMPSN + pageIndex + ".log" );
                for (KlTfPtCmpsnBean bean : stus) {
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
