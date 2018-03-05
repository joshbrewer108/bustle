package com.example.joshbrewer108.bustle.db;


import android.provider.BaseColumns;


/**
 * Created by joshbrewer108 on 1/30/18.
 */

public class Task {

    public static final String DB_NAME = "com.example.joshbrewer108.bustle;";
    public static final int DB_VERSION = 1;


    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }

}