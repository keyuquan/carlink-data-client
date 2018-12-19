package com.cad.carlink.data.client;

import com.cad.carlink.data.constants.Constants;
import com.cad.carlink.data.bean.KlNewTfBsJurctcWXxjyBean;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;

/**
 * 机动车维修企业信息
 */
public class KlNewTfBsJurctcWXxjyClient {

    public static void main(String[] args) {
        HttpClientResult result ;

        try {
            int pageIndex = 1;
            do {
                result =  ClientUtils.getHttpClientResult ( Constants.TABLE_KL_NEW_TF_BS_JURCTC_WXJY,0,pageIndex );
                List<KlNewTfBsJurctcWXxjyBean> stus = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<KlNewTfBsJurctcWXxjyBean>> () { }.getType () );
                File file = FileUtils.createNewFile ( Constants.LOG_KL_NEW_TF_BS_JURCTC_WXJY + pageIndex + ".log" );

                for (KlNewTfBsJurctcWXxjyBean bean : stus) {
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
