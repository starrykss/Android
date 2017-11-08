package org.androidtown.androidmakingbookinoneday;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplication(), "버튼이 눌러졌습니다.", Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.WEB1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daum.net"));
                startActivity(myIntent);
            }
        });

        Button button3 = (Button) findViewById(R.id.WEB2);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(myIntent);
            }
        });

        Button button4 = (Button) findViewById(R.id.WEB3);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nate.com"));
                startActivity(myIntent);
            }
        });

        Button button5 = (Button) findViewById(R.id.buttonone);
            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivit.this, OneActivity.class);
                    startActivity(intent);
                }
            });

        Button button6 = (Button) findViewById(R.id.buttontwo);
            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivit.this, TwoActivity.class);
                    startActivity(intent);
                }
            });



    }
}
