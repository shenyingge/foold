package com.example.foold;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.foold.Bean.User;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class Login extends Activity {


    private TextView mnewuser;
    private Button mlogin_log;
    private EditText musername_log;
    private EditText mpassword_log;
    private SQLiteDatabase db;
    private User user;
    private MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.login);

        musername_log = (EditText)findViewById(R.id.username_log);
        mpassword_log = (EditText)findViewById(R.id.password_log);

        mnewuser = (TextView)findViewById(R.id.newUser);
        mlogin_log = (Button)findViewById(R.id.login_log);

        mlogin_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId=musername_log.getText().toString();
                String password=mpassword_log.getText().toString();
                if(userId.equals("")||password.equals("")){
                    Toast.makeText(Login.this,"请输入账号和密码",Toast.LENGTH_SHORT).show();
                }else {
//                    Connector.getDatabase();
//                    List<User> users = LitePal.findAll(User.class);
//                    boolean login = false;
//                    for (User user : users) {
//                        if (userId.equals(user.getId()) && password.equals(user.getPassword())) {
//                            login = true;
//                            break;
//                        }
                    db = new MyDatabaseHelper(Login.this, "foold.db", null, 2).getReadableDatabase();
                    Cursor cursor=db.query("user",new String[]{"id","password"},null,null,null,null,null);
                    boolean login=false;
                    //从数据库中匹配学号和密码
                    while(cursor.moveToNext()){
                        if(userId.equals(cursor.getString(cursor.getColumnIndex("id")))&&
                                password.equals(cursor.getString(cursor.getColumnIndex("password")))){
                            login=true;
                            break;
                        }
                    }
                    if (login) {


                        myDatabaseHelper=new MyDatabaseHelper(Login.this,"foold.db",null,2);
                        SQLiteDatabase db=myDatabaseHelper.getWritableDatabase();
                        ContentValues value=new ContentValues();
                        value.put("id","1");
                        value.put("suan","1");
                        value.put("tian","1");
                        value.put("la","1");
                        value.put("dan","1");
                        db.insert("tuijiancai",null,value);
                        value.clear();

                        value.put("id","2");
                        value.put("suan","2");
                        value.put("tian","2");
                        value.put("la","2");
                        value.put("dan","2");
                        db.insert("tuijiancai",null,value);


                        Toast.makeText(Login.this, "jianbiao成功", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, WenjuanActivity.class);

                        startActivity(intent);

                    } else {
                        Toast.makeText(Login.this, "学号或密码错误", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        mnewuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });






    }




}
