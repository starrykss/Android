package org.androidtown.mystack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    Button button2;

    Stack<Integer> stack = new Stack<Integer>();
    int count = 0;

    EditText editText2;
    Button button3;
    Button button4;

    ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
    int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stack.push(count);
                editText.setText("\n스택에 추가함: " + count);

                count++;

                editText.append("\n스택 : " + stack);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int outValue = stack.pop();
                editText.setText("\n스택에서 가져옴 : " + outValue);

                editText.append("\n스택 : " + stack);
            }
        });

        editText2 = (EditText) findViewById(R.id.editText2);

        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queue.offer(count2);
                editText2.setText("\n큐에 추가함 : " + count2);

                count2++;

                editText2.append("\n큐 : " + queue);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int outValue = queue.poll();
                editText2.setText("\n큐에서 가져옴 : " + outValue);

                editText2.append("\n큐 : " + queue);
            }
        });
    }
}
