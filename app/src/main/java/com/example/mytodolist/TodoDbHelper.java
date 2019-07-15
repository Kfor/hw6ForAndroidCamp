package com.example.mytodolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoDbHelper extends SQLiteOpenHelper{//需要完成3个函数，构造函数、创建时操作、升级时操作

    public TodoDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TodoContract.SQL_CREATE_NOTES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        for(int j=i;j<i1;j++){
            switch (j){
                case 1://这里是如果是第一版本就更新。实际应该是每一个版本都覆盖更新（可能需要清空本地储存的操作）
                    sqLiteDatabase.execSQL(TodoContract.SQL_ADD_PRIORITY_COLUMN);
                    break;
            }
        }
    }
}
