package com.cad.carlink.data.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static Pattern p = Pattern.compile ( "\t|\r|\n|\n\r|\r\n" );

    public static String replaceBlank(String str) {
        String dest = "";
        if ( str != null ) {
            Matcher m = p.matcher ( str );
            dest = m.replaceAll ( "" ).replace ( "\"", "" ).replace ( "\'", "" );
        }
        return dest;
    }

    public static String replacefieldDelimiter(String str) {

        if ( str != null ) {
            str = str.replace ( "|", "/" );
        }
        return str;
    }
}
