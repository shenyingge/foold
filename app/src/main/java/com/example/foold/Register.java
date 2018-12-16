package com.example.foold;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import cn.edu.pku.zhanghan.fooldzh.R;
import com.example.foold.Bean.User;
import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;


public class Register extends Activity {

    private Button mregister_go;
    private EditText muserid;
    private EditText mpwd;
    private EditText mpwd2;
    private MyDatabaseHelper myDatabaseHelper;
    private Button mbackbBtn;


    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.regist);

        mregister_go = (Button)findViewById(R.id.regist_reg);
        muserid = (EditText)findViewById(R.id.username_reg);
        mpwd = (EditText)findViewById(R.id.password_reg);
        mpwd2 = (EditText)findViewById(R.id.confirm1_reg);
        mbackbBtn = (Button)findViewById(R.id.back_reg);

        mbackbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
        mregister_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterSave();
            }
        });
    }

    private void RegisterSave(){

        String userId = muserid.getText().toString();
        String password1 = mpwd.getText().toString();
        String password2 = mpwd2.getText().toString();

        boolean creatUser = true;
        if( userId.equals("") || password1.equals("") || password2.equals("")){
            Toast.makeText(this,"请输入完整的注册内容",Toast.LENGTH_SHORT).show();
        }else if (!password1.equals(password2)){
            Toast.makeText(this,"两次密码不一致",Toast.LENGTH_SHORT).show();
        }else if (password1.length()<6){
            Toast.makeText(this,"密码小于六位数",Toast.LENGTH_SHORT).show();
        }else{
            myDatabaseHelper = new MyDatabaseHelper(Register.this,"foold.db",null,2);
            SQLiteDatabase db = myDatabaseHelper.getWritableDatabase();
            Cursor cursor = db.query("user",new String[]{"id"},null,null,null,null,null);
//            Connector.getDatabase();
//            List<User> users= LitePal.findAll(User.class);
//            for(User user: users){
//                if(userId.equals(user.getId())){
//                    Toast.makeText(this,"该用户已存在",Toast.LENGTH_SHORT).show();
//                    creatUser = false;
//                }
//            }

            while (cursor.moveToNext()){
                if(userId.equals(cursor.getString(cursor.getColumnIndex("id")))){
                    Toast.makeText(this,"该用户已存在",Toast.LENGTH_SHORT).show();
                    creatUser = false;
                }
            }

            if (creatUser){

//                User user=new User();
//                user.setId(userId);
//                user.setPassword(password1);
//                user.save();


                ContentValues values = new ContentValues();
                values.put("id",userId);
                values.put("password",password1);
                db.insert("user",null,values);

                AlertDialog.Builder dialog = new AlertDialog.Builder(Register.this);
                dialog.setTitle("注册成功");
                dialog.setMessage("您已成功注册，请返回登录界面");
                dialog.setPositiveButton("返回登陆界面", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.setNegativeButton("留在注册界面", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        }
    }
}
