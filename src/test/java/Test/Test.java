package Test;


import com.cad.carlink.data.bean.KlTfPtCmpsnBean;
import com.cad.carlink.data.utils.*;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static String url = "http://220.174.236.211:8091/DataPub/rest/api/findByPage?";
    private static Logger logger_imp_ti_owner = LoggerFactory.getLogger ( "imp_ti_owner" );
    private static Logger logger_imp_ti_owner_json = LoggerFactory.getLogger ( "imp_ti_owner_json" );

    public static void main(String[] args) {
        System.out.println (StringUtils.replaceBlank ("2018-03-09   \n" +
                "19:19:13") );

        HttpClientResult result = null;
        try {

            Map<String, String> params = new HashMap<String, String> ();
            params.put ( "markId", "0" );
            params.put ( "apiCatId", "21" );
            params.put ( "tableCode", "KL_TF_PT_CMPSN" );
            params.put ( "pageIndex", 194 + "" );

            result = HttpClientUtils.doGet ( url, params );

            System.out.println ( result.toString () );
            List<KlTfPtCmpsnBean> stus = JsonUtils.fromJson ( result.getContent (), new TypeToken<List<KlTfPtCmpsnBean>> () { }.getType () );



            for (KlTfPtCmpsnBean bean : stus) {

            }





//            List<ImpTiOwnerBean> stus = JsonUtils.fromJson(result.getContent (),new TypeToken<List<ImpTiOwnerBean>>(){}.getType());
//
//            for (ImpTiOwnerBean bean : stus) {
//                logger_imp_ti_owner.info ( bean.toString2 () );
//                logger_imp_ti_owner_json.info ( bean.toString () );
//            }

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }


}
