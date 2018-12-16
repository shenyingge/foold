package com.example.foold;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String user="create table user("
            + "id text primary key,"
            +"password text)";
    public static final String tuijiancai="create table tuijiancai("
            + "id text primary key,"
            + "suan int,"
            + "tian int,"
            + "la int,"
            + "dan int)";


    private Context mcontext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mcontext=context;
    }

    @Override
    //执行数据库的操作
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(user);
        db.execSQL(tuijiancai);

        Toast.makeText(mcontext,"create succeeded",Toast.LENGTH_SHORT).show();

    }



    @Override
    //更新数据库
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {




    }
}
