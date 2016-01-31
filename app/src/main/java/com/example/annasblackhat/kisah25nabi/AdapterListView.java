package com.example.annasblackhat.kisah25nabi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ANNAS BlackHat on 30/12/2015.
 */
public class AdapterListView extends BaseAdapter {

    private Context context;
    private String[][] data;

    public AdapterListView(Context context, String[][] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data[0].length;
    }

    @Override
    public Object getItem(int position) {
        return data[0][position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.list_item, null);

        TextView txt = (TextView)v.findViewById(R.id.txt_list_item);
        txt.setText(data[0][position]);
        return v;
    }
}
