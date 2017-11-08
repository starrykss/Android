package org.androidtown.mydata;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name01 = "철수";
    String name02 = "영희";
    String name03 = "민희";
    String name04 = "수지";
    String name05 = "지민";

    String[] names = {"철수", "영희", "민희", "수지", "지민"};
    // String[] names = new String[5];

    Person [] persons = new Person [5];

    int count = 0;

    Person person01;

    TextView textView;

    ScrollView scrollView;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        scrollView = (ScrollView) findViewById(R.id.scrollView);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);



        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*if (count == 0) {
                    person01 = new Person(name01);
                    Toast.makeText(getApplicationContext(), "사람 " + name01 + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                } else if (count == 1) {
                    person01 = new Person(name02);
                    Toast.makeText(getApplicationContext(), "사람 " + name02 + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                } else if (count == 2) {
                    person01 = new Person(name03);
                    Toast.makeText(getApplicationContext(), "사람 " + name03 + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                } else if (count == 3) {
                    person01 = new Person(name04);
                    Toast.makeText(getApplicationContext(), "사람 " + name04 + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                } else if (count == 4) {
                    person01 = new Person(name05);
                    Toast.makeText(getApplicationContext(), "사람 " + name05 + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                }
                */
                /*
                if(count < names.length) {              // ArrayIndexOutOfBoundsException 오류를 없애기 위해 if~else문을 사용함.
                    person01 = new Person(names[count]);
                    Toast.makeText(getApplicationContext(), "사람 " + names[count] + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "사람 이름이 없습니다.", Toast.LENGTH_LONG).show();
                }

                count++;

                for (int i = 0; i < names.length; i++) {
                    System.out.println(i + " : " + names[i]);
                }
                */
                /*
                if (count <names.length) {
                    persons[count] = new Person(names[count]);
                }
                */
                if (count >= persons.length) {
                    Person[] tempPersons = new Person[persons.length + 5];
                    System.arraycopy(persons, 0, tempPersons, 0, persons.length);
                    persons = tempPersons;
                }

                int nameIndex = count % 5;
                persons[count] = new Person(names[nameIndex]);
                Toast.makeText(getApplicationContext(), "사람 " + names[nameIndex] + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();

                String curName = persons[count].getName();
                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(curName);
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                nameTextView.setTextColor(Color.BLUE);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                linearLayout.addView(nameTextView, params);


                count++;

                textView.setText(count + " 명");

            }

        });
    }
}
