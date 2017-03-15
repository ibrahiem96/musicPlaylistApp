package com.example.rashid.project2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.InstrumentationInfo;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * This code was originally taken from Professor Ugo Buy's UIGridLayout Project available to
 * students on BlackBoard. Modified by Ibrahiem for Project 2
 */

public class AlbumImageAdapter extends BaseAdapter{

    private static final int PADDING = 8;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    private Context context;
    private List<Integer> thumbnails;
    int[] selected = new int[5];

    public AlbumImageAdapter(Context context, List<Integer> thumbnails){

        this.context = context;
        this.thumbnails = thumbnails;

    }

    public void setData(int data[]){
        this.selected = data;
    }

    public int getCount() {return thumbnails.size();}

    public Object getItem(int pos) {return thumbnails.get(pos);}

    public long getItemId(int pos) {return thumbnails.get(pos);}

    public View getView(int pos, View newView, ViewGroup parent){
        ImageView iv = (ImageView) newView;

        if (iv == null){
            iv = new ImageView(this.context);
            iv.setLayoutParams(new GridView.LayoutParams(WIDTH, HEIGHT));
            iv.setPadding(PADDING, PADDING, PADDING, PADDING);
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }


        iv.setImageResource(thumbnails.get(pos));

        return iv;
    }




}
