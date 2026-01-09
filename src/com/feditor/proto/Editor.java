package com.feditor.proto;

import java.io.File;
import java.io.FilenameFilter;

public class Editor implements FilenameFilter{

    public Editor(){
        //muista try with
    }
    //https://www.geeksforgeeks.org/java/java-program-to-search-for-a-file-in-a-directory/

    @Override
    public boolean accept(File dir, String name) {
        // TODO: Keksi joku erittely
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }
}
