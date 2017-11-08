package org.androidtown.javaandandroidchap14;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter {

    public String[] names = {"Kim", "Park", "John", "Carl", "Tim"};
    public String[] ages = {"26", "23", "24", "27", "30"};

    Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layout = new LinearLayout(mContext);
        layout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        TextView nameView = new TextView(mContext);
        nameView.setText(names[position]);
        nameView.setTextColor(Color.BLUE);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);

        layout.addView(nameView, params);

        TextView ageView = new TextView(mContext);
        ageView.setText(ages[position]);
        ageView.setTextColor(Color.RED);
        ageView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);

        layout.addView(ageView, params);

        return layout;
        /*
        TextView view = new TextView(mContext);
        view.setText(names[position]);
        view.setTextColor(Color.BLUE);
        //view.setTextSize(30.0f);
        view.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);

        return view;
        */
    }
}