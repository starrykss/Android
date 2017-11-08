package org.androidtown.javaandandroidchap7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
                EditText editText;
                EditText editText2;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    editText = (EditText) findViewById(R.id.editText);
                    editText2 = (EditText) findViewById(R.id.editText2);

                    FrameLayout layout1 = (FrameLayout) findViewById(R.id.layout1);

                    layout1.setOnTouchListener(new View.OnTouchListener() {
                        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {      // 손가락을 눌렀을 때
                    float x = event.getX();
                    float y = event.getY();

                    editText.setText(String.valueOf(x));
                    editText2.setText(String.valueOf(y));
                }

                return true;
            }

            /*
            @Override
             public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();

                editText.setText(String.valueOf(x));
                editText2.setText(String.valueOf(y));

                return true;
             */
        });

    }
}
