package com.example.boardgame;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class Settings extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_for_hangover);

        Resources res= getResources();
        String setting_items[]= res.getStringArray(R.array.setting_items);
        final ArrayList<SettingItem> list = new ArrayList<SettingItem>();
        for (int i = 0; i < setting_items.length; ++i) {
            SettingItem item= new SettingItem(setting_items[i],true);
            list.add(item);
        }
        SettingListAdapter listViewAdapter= new SettingListAdapter(this,R.layout.setting_item,list);
        ListView lV= findViewById(R.id.setting_list);
        lV.setAdapter(listViewAdapter);





        populatesetting();
    }

    //TODO list adapter, boolean value handler

    //get screen size and shrink the size

    public void populatesetting(){
        //get screensize and shrink the page
        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width= dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.7));
        //set offset for the page
        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y=-20;
        getWindow().setAttributes(params);

    }
}
