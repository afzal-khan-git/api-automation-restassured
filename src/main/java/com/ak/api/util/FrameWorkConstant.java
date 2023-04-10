package com.ak.api.util;

public class FrameWorkConstant {


    public static String getResourceFolderLocation(String fileName){
        return System.getProperty("user.dir")+"/src/main/resources/"+fileName;
    }

}
