package com.example.foold;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.foold.R;
import com.example.foold.MyDatabaseHelper;


public class WenjuanActivity extends Activity
{
    private int suanfen=0;
    private int tianfen=0;
    private int lafen=0;
    private int danfen=0;
    private int zongfen=0;

    private Button mhysc;
    private Button mxhsjd;
    private Button msrxl;
    private Button mlbhd;
    private Button mszr;
    private Button mlzj;
    private Button mhgr;
    private Button mslt;
    private Button mtclj;
    private Button mbbz;
    private Button mbbf;
    private Button mkljc;
    private Button mssgy;
    private Button mscy;
    private Button myxrs;
    private Button msltds;
    private Button mmlxg;
    private Button mmpdf;
    private Button mksj;
    private Button mpc;
    private Button mclbc;
    private Button mpjfz;
    private Button mlst;
    private Button msgz;
    private Button mxgyc;
    private Button mgbdj;

    private Button mconfirm;
    private MyDatabaseHelper myDatabaseHelper;




    private int[][] cai={
            {0,0,0,0},
            {0,8,0,0},
            {0,0,0,7},
            {2,0,7,0},
            {0,0,4,0},
            {0,6,0,0},
            {8,2,0,0},
            {0,0,0,8},
            {0,0,7,0},
            {0,0,6,0},
            {0,0,8,0},
            {0,6,0,7},
            {0,0,0,7},
            {0,0,6,0},
            {2,0,0,7},
            {0,0,6,6},
            {0,0,8,0},
            {0,0,8,0},
            {7,0,6,2},
            {7,7,0,0},
            {6,7,0,0},
            {0,0,0,8},
            {0,0,7,0},
            {0,0,0,6},
            {0,6,4,0},
            {0,6,4,0}
    };





    @Override
    protected void onCreate(Bundle saveInatance){
        super.onCreate(saveInatance);
        setContentView(R.layout.wenjuan);

        mhysc = (Button)findViewById(R.id.hysc);
        mxhsjd = (Button)findViewById(R.id.xhsjd);
        msrxl = (Button)findViewById(R.id.srxl);
        mlbhd = (Button)findViewById(R.id.lbhd);
        mszr = (Button)findViewById(R.id.szr);
        mlzj = (Button)findViewById(R.id.lzj);
        mhgr = (Button)findViewById(R.id.hgr);
        mslt = (Button)findViewById(R.id.slt);
        mtclj = (Button)findViewById(R.id.tclj);
        mbbz = (Button)findViewById(R.id.bbz);
        mbbf = (Button)findViewById(R.id.bbf);
        mkljc = (Button)findViewById(R.id.kljc);
        mssgy = (Button)findViewById(R.id.ssgy);
        mscy = (Button)findViewById(R.id.scy);
        myxrs = (Button)findViewById(R.id.yxrs);
        msltds = (Button)findViewById(R.id.sltds);
        mmlxg = (Button)findViewById(R.id.mlxg);
        mmpdf = (Button)findViewById(R.id.mpdf);
        mksj = (Button)findViewById(R.id.ksj);
        mpc = (Button)findViewById(R.id.pc);
        mclbc = (Button)findViewById(R.id.clbc);
        mpjfz = (Button)findViewById(R.id.pjfz);
        mlst = (Button)findViewById(R.id.lst);
        msgz = (Button)findViewById(R.id.sgz);
        mxgyc = (Button)findViewById(R.id.xgyc);
        mgbdj = (Button)findViewById(R.id.gbdj);
        mconfirm = (Button)findViewById(R.id.confirm_wenjuan);

        mhysc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;
            }
        });

        mxhsjd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;suanfen++;
            }
        });
        msrxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;
            }
        });

        mlbhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;suanfen++;
            }
        });

        mszr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mlzj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mhgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mslt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               suanfen++; lafen++;
            }
        });

        mtclj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++; tianfen++;
            }
        });

        mbbz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++; tianfen++;
            }
        });

        mbbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++; tianfen++;
            }
        });

        mkljc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tianfen++;
            }
        });

        mssgy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tianfen++;
            }
        });

        mscy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++; lafen++;
            }
        });

        myxrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tianfen++;
            }
        });

        msltds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++; lafen++;
            }
        });

        mmlxg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mmpdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mksj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lafen++;
            }
        });

        mpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++;tianfen++;
            }
        });

        mclbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++;danfen++;
            }
        });

        mpjfz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++;lafen++;
            }
        });

        mlst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suanfen++;tianfen++;
            }
        });

        msgz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;tianfen++;
            }
        });

        mxgyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;
            }
        });
        mgbdj .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                danfen++;
            }
        });







        mconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int temp;
                temp = 0;
                int max;
                max = 0;
                int i;
                for(i = 0; i<26; ++i){
                    zongfen=suanfen*cai[i][0]+tianfen*cai[i][1]+lafen*cai[i][2]+danfen*cai[i][3];
                    if (zongfen > max) {
                        max = zongfen;
                        temp=i;
                        Toast.makeText(WenjuanActivity.this,"两次密码输入不一致，请重新输入",Toast.LENGTH_SHORT).show();
                    }
                }
                //String xuhao_s =String.valueOf(temp);
                Intent intent=new Intent(WenjuanActivity.this, JieguoActivity.class);
                intent.putExtra("xvhao",temp);
                startActivity(intent);




/*
                myDatabaseHelper=new MyDatabaseHelper(WenjuanActivity.this,"foold.db",null,2);
                SQLiteDatabase db=myDatabaseHelper.getWritableDatabase();
                Cursor cursor=db.query("tuijiancai",new String[]{"id"},null,null,null,null,null);
                int temp;
                int max=0;
                while (cursor.moveToNext()) {
                    zongfen = suanfen * cursor.getInt(cursor.getColumnIndex("suan")) + tianfen * cursor.getInt(cursor.getColumnIndex("tian")) + lafen * cursor.getInt(cursor.getColumnIndex("la")) + danfen * cursor.getInt(cursor.getColumnIndex("dan"));
                    if (zongfen > max) {
                        max = zongfen;
                        temp = cursor.getInt(cursor.getColumnIndex("id"));
                    }


                }

*/
            }
        });



    }

}



