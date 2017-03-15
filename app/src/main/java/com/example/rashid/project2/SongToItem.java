package com.example.rashid.project2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ibrahiem on 2/21/2017.
 */

public class SongToItem extends ArrayAdapter<Song> {

    // empty list of songs
    Song songs[] = null;
    Context context;

    // custom constructor
    public SongToItem(Context context, Song songs[]){
        super(context, R.layout.checkbox_item, songs);
        this.context = context;
        this.songs = songs;
    }

    @Override
    public View getView(int pos, View newView, ViewGroup parent) {
        LayoutInflater li = ((Activity)context).getLayoutInflater();
        newView = li.inflate(R.layout.checkbox_item, parent, false);

        TextView info = (TextView) newView.findViewById(R.id.text_content);
        CheckBox song = (CheckBox) newView.findViewById((R.id.checkbox1));
        info.setText(songs[pos].getInfo());

        if (songs[pos].isEnabled) song.setChecked(true);
        else song.setChecked(false);

        return newView;
    }
}
