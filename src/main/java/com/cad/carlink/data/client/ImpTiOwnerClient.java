package com.cad.carlink.data.client;

import com.cad.carlink.data.bean.ImpTiOwnerBean;
import com.cad.carlink.data.constants.Constants;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.text.ParseException;
import java.util.List;

/**
 * 业主信息表同步
 */
public class ImpTiOwnerClient {

    public   static String markId = "0";
    public static void main(String[] args) throws ParseException {

        if ( args.length >= 1 ) {
            markId = DateUtils.getDaTeMarkIdTime ( args[0] );
            System.out.println ( markId );
        }
        HttpClientResult result;

        try {
            int pageIndex = 1;
            do {
                result = ClientUtils.getHttpClientResult ( Constants.TABLE_IMP_TI_OWNER, markId , pageIndex );
                List<ImpTiOwnerBean> beans = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<ImpTiOwnerBean>> () {}.getType () );
                File file = FileUtils.createNewFile ( Constants.LOG_IMP_TI_OWNER + pageIndex + ".log" );

                for (ImpTiOwnerBean bean : beans) {
                    FileUtils.appendTofile ( file, StringUtils.replaceBlank ( bean.getContext () ) );
                }
                LoggerUtils.info ( "pageIndex :" + pageIndex + " save path :" + file.getPath () );
                FileUtils.closeWriter ();

                pageIndex++;

            } while (!result.getContent ().equals ( "[]" ));

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }


}
