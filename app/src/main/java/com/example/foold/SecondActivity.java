package com.example.foold;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.litepal.tablemanager.Connector;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.regist);
        Button back_button = (Button)findViewById(R.id.back_reg);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






//                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
//                startActivity(intent);

            }
        });
    }
}
