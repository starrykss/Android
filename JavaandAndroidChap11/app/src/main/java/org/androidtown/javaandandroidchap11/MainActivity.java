package org.androidtown.javaandandroidchap11;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == User.REQ_CODE_PHONEBOOK) {
            if (resultCode == User.RES_CODE_SUCCESS) {
                String outName = data.getStringExtra("name");
                Toast.makeText(getApplicationContext(), "전달받은 name 속성의 값 : " + outName, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "실패하였습니다.", Toast.LENGTH_LONG).show();
            }
        }
        /*
        String outName = data.getStringExtra("name");
        Toast.makeText(getApplicationContext(), "전달받은 name 속성의 값 : " + outName, Toast.LENGTH_LONG).show();
        */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01010001000"));
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.loginName = "소녀시대";
                Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
                //startActivity(myIntent);
                // myIntent.putExtra("logninName", "소녀시대");
                // startActivityForResult(myIntent, 1);

                startActivityForResult(myIntent, User.REQ_CODE_PHONEBOOK);
            }
        });
    }
}
