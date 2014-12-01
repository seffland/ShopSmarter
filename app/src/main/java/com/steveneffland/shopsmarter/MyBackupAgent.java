package com.steveneffland.shopsmarter;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FileBackupHelper;

import java.io.File;

/**
 * Created by seffl_000 on 11/26/2014.
 */

//Class to backup the database to Google's servers for restores on other devices
class MyBackupAgent extends BackupAgentHelper {
    private static final String DB_NAME = "com.steveneffland.shopsmarter.db.items";

    @Override
    public void onCreate(){
        FileBackupHelper dbs = new FileBackupHelper(this, DB_NAME);
        addHelper("dbs", dbs);
    }

    @Override
    public File getFilesDir(){
        File path = getDatabasePath(DB_NAME);
        return path.getParentFile();
    }
}