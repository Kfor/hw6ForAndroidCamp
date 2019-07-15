package com.example.mytodolist;

public final class TodoContract {
    public static final String SQL_CREATE_NOTES =
            "CREATE TABLE " + TodoNote.TABLE_NAME
            + "(" + TodoNote._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TodoNote.COLUMN_DATE + " INTEGER, "
            + TodoNote.COLUMN_STATE + " INTEGER, "
            + TodoNote.COLUMN_CONTENT + " TEXT, "
            + TodoNote.COLUMN_PRIORITY + " INTEGER)";
    public static final String SQL_ADD_PRIORITY_COLUMN =
            "ALTER TABLE "+ TodoNote.TABLE_NAME + " ADD " + TodoNote.COLUMN_PRIORITY + " INTEGER";
    private TodoContract(){

    }
}
