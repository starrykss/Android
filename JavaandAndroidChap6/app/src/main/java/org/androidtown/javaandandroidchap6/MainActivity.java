package org.androidtown.javaandandroidchap6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView textView2;

    int value05 = 100;
    final int value06 = 100;                // final : 상수를 만드는 키워드
    static final int value07 = 100;         // static을 붙이면 클래스 안에 있는 코드에서 뿐만 아니라 클래스 밖에서도 사용할 수 있음. (MainActivity.value07)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void onButton1Clicked(View v) {
        String value01 = editText.getText().toString();
        String value02 = editText2.getText().toString();
        /*
        String value03 = "10";
        textView2.setText(value03);
        */

        int input01 = Integer.parseInt(value01);
        int input02 = Integer.parseInt(value02);

        /*
        int input03 = input01 + input02;
        textView2.setText(String.valueOf(input03));
        */

        // Using Constant
        int value03 = input01 + input02;
        textView2.setText(String.valueOf(value03));

        final int value04 = 100;
        value03 = value03 + value04;

        textView2.setText(String.valueOf(value03));
    }
}
