package com.agileprocrm.pages;

import java.io.File;

public class DownloadApp extends BasePage{

    public boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        File dir = new File("C:\\Users\\ihc\\Downloads");
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }

        return flag;
    }
}
