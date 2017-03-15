package com.example.rashid.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView songList;
    Song songs[];
    SongToItem adapter;

    int checkAll = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.song_playlist);

        songs = new Song[6];
        songs[0] = new Song("Maneater", "Nelly Furtado", "2006", false);
        songs[1] = new Song("Titanium", "Sia", "2011", false);
        songs[2] = new Song("Kabira", "Arjit Singh, Harshdeep Kaur", "2013", false);
        songs[3] = new Song("Flexicution", "Logic", "2016", false);
        songs[4] = new Song("Walking On A Dream", "Empire Of The Sun", "2016", false);
        songs[5] = new Song("Mockingbird", "Eminem", "2004", false);

        adapter = new SongToItem(this, songs);
        songList.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //int selected[] = new int[5];
        ArrayList<Integer> selected = new ArrayList<Integer>(7);
        ArrayList<String> selectedSong = new ArrayList<String>(7);

        switch(item.getItemId()){
            case R.id.createplaylist_menu:
                // call new activity to create playlist
                // make sure at least two are selected
                int checkCounter = 0;
                //System.out.println(songs.length-1);
                for (int i = 0; i < songs.length; i++){
                    CheckBox b = (CheckBox)songList.getChildAt(i).findViewById(R.id.checkbox1);
                    if (b.isChecked()){
                        selected.add(i,1);
                        if (i == 0) selectedSong.add("nelly");
                        else if (i == 1) selectedSong.add("sia");
                        else if (i == 2) selectedSong.add("arjit");
                        else if (i == 3) selectedSong.add("logic");
                        else if (i == 4) selectedSong.add("empire");
                        else if (i == 5) selectedSong.add("eminem");
                        checkCounter++;
                    }
                    else {
                        selected.add(i,0);
                    }
                }

                if (checkCounter == 0 ) {
                    System.out.println("No Song Selected!");
                    Toast.makeText(this, "No Song Selected!", Toast.LENGTH_SHORT).show();
                    return false;
                }

                Intent intent = new Intent(this, PlaylistActivity.class);
                intent.putExtra("checked items", selected);
                intent.putExtra("checked songs", selectedSong);
                startActivity(intent);

                return true;
            case R.id.checkall_menu:
                // check all items in list
                // System.out.println("check all is being pressed");
                // System.out.println(songs.length);
                for (int i = 0; i < songs.length; i++){
                    CheckBox b = (CheckBox)songList.getChildAt(i).findViewById(R.id.checkbox1);
                    b.setChecked(true);
                }
                return true;
            case R.id.clearall_menu:
                // clear all items in list
                for (int i = 0; i < songs.length; i++){
                    CheckBox b = (CheckBox)songList.getChildAt(i).findViewById(R.id.checkbox1);
                    b.setChecked(false);
                }
                return true;
            case R.id.invert_menu:
                // invert all items in menu
                for (int i = 0; i < songs.length; i++) {
                    CheckBox b = (CheckBox) songList.getChildAt(i).findViewById(R.id.checkbox1);
                    if (b.isChecked()) b.setChecked(false);
                    else if (!b.isChecked()) b.setChecked(true);
                }
                return true;
//            case R.id.refresh:
//                for (int i = 0; i < selected.size(); i++){
//                    selected.clear();
//                }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
