package org.androidtown.javaandandroidchap11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();

                Intent intent = new Intent();
                intent.putExtra("name", "mike");

                // setResult(RESULT_OK, intent);
                setResult(User.RES_CODE_SUCCESS, intent);

                finish();
            }
        });
        /*
        Intent passedIntent = getIntent();
        if (passedIntent != null) {
            String loginName = passedIntent.getStringExtra("loginName");
            Toast.makeText(getApplicationContext(), "새로운 화면에서 받은 loginName : " + loginName, Toast.LENGTH_LONG).show();
        }
        */

        String loginName = User.loginName;
        Toast.makeText(getApplicationContext(), "새로운 화면에서 받은 loginName : " + loginName, Toast.LENGTH_LONG).show();
    }
}
