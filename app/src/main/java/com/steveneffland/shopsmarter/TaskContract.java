package com.steveneffland.shopsmarter;

import android.provider.BaseColumns;

/**
 * Created by seffl_000 on 11/26/2014.
 */
public class TaskContract {
    public static final String DB_NAME = "com.steveneffland.shopsmarter.db.items";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "items";


    public class Columns {
        public static final String ITEM = "item";
        public static final String _ID = BaseColumns._ID;
    }
}
