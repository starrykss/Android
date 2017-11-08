package org.androidtown.javaandandroidchap13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);

        calculator = new MyCalculator();

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clearHistory();
                editText4.setText("");
            }
        });


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aStr = editText.getText().toString();
                String bStr = editText2.getText().toString();

                int a = 0;
                int b = 0;
                try {
                    a = Integer.parseInt(aStr);
                    b = Integer.parseInt(bStr);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }


                //MyCalculator calculator = new MyCalculator();
                Calculator calculator = new MyCalculator();
                int result = calculator.add(a, b);

                calculator = new FriendCalculator(getApplicationContext());
                result = calculator.add(a,b);

                editText3.setText(String.valueOf(result));

                ArrayList<CalcData> history = calculator.getHistory();
                String outStr = "";
                for (int i = 0; i < history.size(); i++) {
                    CalcData curData = history.get(i);
                    outStr += "\n#" + i + " : " + curData.getA() + ", " + curData.getB() + ", " + curData.getType() + ", " + curData.getResult();
                }

                editText4.setText(outStr);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aStr = editText.getText().toString();
                String bStr = editText2.getText().toString();

                int a = 0;
                int b = 0;
                try {
                    a = Integer.parseInt(aStr);
                    b = Integer.parseInt(bStr);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }

                Calculator calculator = new MyCalculator();
                int result = 0;
                try {
                    result = calculator.subtract(a, b);
                } catch (UnImplementedException e) {
                    Toast.makeText(getApplicationContext(), "빼기는 안됩니다.", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }

                editText3.setText(String.valueOf(result));
            }
        });
    }
}
