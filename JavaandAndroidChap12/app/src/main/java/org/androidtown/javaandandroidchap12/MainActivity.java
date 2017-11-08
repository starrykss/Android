package org.androidtown.javaandandroidchap12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;

    int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // XML 레이아웃에 정의된 뷰들을 메모리에 객체화하는 역할을 함.

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                    imageView3.setVisibility(View.GONE);
                } else if (index == 1) {
                    imageView.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.GONE);
                } else if (index == 2) {
                    imageView.setVisibility(View.GONE);
                    imageView2.setVisibility(View.GONE);
                    imageView3.setVisibility(View.VISIBLE);
                }

                index++;
                if (index > 2) {
                    index = 0;
                }
            }
        });
    }
}
