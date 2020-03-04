package com.example.boardgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SettingListAdapter extends ArrayAdapter<SettingItem> {
    private int itemview;
    private ArrayList<SettingItem> SettingItem;
    private Context context;
    public SettingListAdapter(Context context, int itemview, ArrayList<SettingItem>  SettingItem){
        super(context,itemview, SettingItem);
        this.context=context;
        this.SettingItem= SettingItem;
        this.itemview=itemview;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v=convertView;
        try {
            if (v == null) {
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = layoutInflater.inflate(itemview,parent,false);

            }
            //bind each element in the constructor to the view
            TextView setting_item= v.findViewById(R.id.setting_item);
            CheckBox checkBox= v.findViewById(R.id.checkbox);

            setting_item.setText( SettingItem.get(position).getSettings());
            checkBox.setChecked(true);

        }catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return v;
    }
}


