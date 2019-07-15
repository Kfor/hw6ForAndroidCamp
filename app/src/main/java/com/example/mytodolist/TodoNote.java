package com.example.mytodolist;

import android.provider.BaseColumns;

class TodoNote implements BaseColumns {
    public static final String TABLE_NAME = "note";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_CONTENT = "content";
    public static final String COLUMN_PRIORITY = "priority";

}
