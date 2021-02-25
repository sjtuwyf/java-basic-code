package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
//        return true;

        if(pathname.isDirectory()){
            return true;
        }else if (pathname.getPath().toLowerCase().endsWith(".java")==true){
            return true;
        }else {
            return false;
        }

//        return false;
    }
}
