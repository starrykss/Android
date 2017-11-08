package org.androidtown.javaandandroidchap14;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        /*
        String[] names = {"Kim", "Park", "Carl", "Team"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);
        */

        MyAdapter adapter = new MyAdapter(this);
        listView.setAdapter(adapter);

    }
}
