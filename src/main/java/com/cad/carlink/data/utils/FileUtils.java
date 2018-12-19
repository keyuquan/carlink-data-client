package com.cad.carlink.data.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static BufferedWriter writer = null;

    /**
     * 创建一个文件
     * @param fileName
     * @return
     * @throws IOException
     */
    public static File createNewFile(String fileName) throws IOException {
        File file = new File ( fileName );
        if ( file.exists () ) {
            file.delete ();
        }
        file.createNewFile ();
        return file;
    }

    /**
     * 把数据追加到某个文件
     *
     * @param file
     * @param msg
     * @throws Exception
     */
    public static void appendTofile(File file, String msg) throws Exception {

        if ( writer == null ) {
            writer = new BufferedWriter ( new FileWriter ( file, true ) );
        }

        writer.append ( msg );
        writer.newLine ();
        writer.flush ();
    }

    /**
     * 关闭流
     * @throws IOException
     */
    public static void closeWriter() throws IOException {
        if ( writer != null ) {
            writer.close ();
            writer = null;
        }
    }
}


