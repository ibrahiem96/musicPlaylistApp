package com.example.rashid.project2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.GridLayoutAnimationController;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ibrahiem on 2/22/2017.
 */

public class PlaylistActivity extends Activity {

    protected static final String EXTRA_RES_ID = "POS";

    private ArrayList<Integer> thumbnails_preset = new ArrayList<Integer>
            (Arrays.asList(R.drawable.maneater, R.drawable.siatitanium, R.drawable.kabira, R.drawable.logic, R.drawable.empireofsun,
            R.drawable.eminem));
    private ArrayList<Integer> thumbnails = new ArrayList<Integer>(6);
    ArrayList<String> selectedPlay_preset = new ArrayList<String>(Arrays.asList("https://www.youtube.com/watch?v=M2NIMHVmGwk", "https://www.youtube.com/watch?v=eimgRedLkkU", "https://www.youtube.com/watch?v=jHNNMj5bNQw",
            "https://www.youtube.com/watch?v=PLolag3YSYU", "https://www.youtube.com/watch?v=S9bCLPwzSC0", "https://www.youtube.com/watch?v=JRfuAukYTKg"));
    ArrayList<String> selectedPlay;


//    List<String> songURIs = new ArrayList<String>(Arrays.asList("https://www.youtube.com/watch?v=PLolag3YSYU", "https://www.youtube.com/watch?v=S9bCLPwzSC0"
//            , "https://www.youtube.com/watch?v=jHNNMj5bNQw", "https://www.youtube.com/watch?v=eimgRedLkkU", "https://www.youtube.com/watch?v=JRfuAukYTKg",
//            "https://www.youtube.com/watch?v=M2NIMHVmGwk"));

    public String songSelector(String s){

        //if (s == "nelly") return

        return null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        //int selected[] = new int[5];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();

        ArrayList<Integer> selected = (ArrayList<Integer>) getIntent().getSerializableExtra("checked items");
            final ArrayList<String> selectedSongs = (ArrayList<String>) getIntent().getSerializableExtra("checked songs");
        selectedPlay = (ArrayList<String>)selectedSongs.clone();

        // add thumbnails for gridview
        for (int i = 0; i < selected.size(); i++){
            if (selected.get(i) == 1){
                thumbnails.add(thumbnails_preset.get(i));
            }
        }


        GridView gv = (GridView)findViewById(R.id.gridview);
        AlbumImageAdapter gridItems = new AlbumImageAdapter(this, thumbnails);
        gv.setAdapter(gridItems);
        registerForContextMenu(gv);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nelly = "nelly";
                String sia = "sia";
                String arjit = "arjit";
                String logic = "logic";
                String empire = "empire";
                String eminem = "eminem";

                switch (position){
                    case 0:
                        // logic - flexicution
                        //System.out.println(selectedSongs.get(0));
                        if (selectedSongs.get(0).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(0).equals(sia)) {
                                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                                i.putExtra(EXTRA_RES_ID, (int) id);
                                startActivity(i);
                        }
                        else if (selectedSongs.get(0).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(0).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(0).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(0).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        break;
                    case 1:
                        if (selectedSongs.get(1).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(1).equals(sia)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(1).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(1).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(1).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(1).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }break;
                    case 2:
                        if (selectedSongs.get(2).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(2).equals(sia)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(2).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(2).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(2).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(2).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }break;
                    case 3:
                        if (selectedSongs.get(3).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(3).equals(sia)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(3).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(3).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(3).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(3).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }break;
                    case 4:
                        if (selectedSongs.get(4).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(4).equals(sia)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(4).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(4).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(4).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(4).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }break;
                    case 5:
                        if (selectedSongs.get(5).equals(nelly)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(5).equals(sia)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(5).equals(arjit)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }else if (selectedSongs.get(5).equals(logic)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(5).equals(empire)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else if (selectedSongs.get(5).equals(eminem)) {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                            i.putExtra(EXTRA_RES_ID, (int) id);
                            startActivity(i);
                        }break;
                    default:
                        break;
                }


            }
        });


    }



    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo info){
        super.onCreateContextMenu(menu, view, info);
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.context_menu, menu);


    }

    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();


        String nelly = "nelly";
        String sia = "sia";
        String arjit = "arjit";
        String logic = "logic";
        String empire = "empire";
        String eminem = "eminem";


        switch(item.getItemId()){
            case R.id.open_info_page:
                for (int i = 0; i < selectedPlay.size(); i++){
                    if (selectedPlay.get(i).equals(nelly)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Maneater_(Nelly_Furtado_song)"));
                        startActivity(songInfo);
                    }
                    else if (selectedPlay.get(i).equals(sia)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Titanium_(song)"));
                        startActivity(songInfo);
                    }else if (selectedPlay.get(i).equals(arjit)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Kabira_(song)"));
                        startActivity(songInfo);
                    }else if (selectedPlay.get(i).equals(logic)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Flexicution"));
                        startActivity(songInfo);
                    }else if (selectedPlay.get(i).equals(empire)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Walking_on_a_Dream"));
                        startActivity(songInfo);
                    }else if (selectedPlay.get(i).equals(eminem)){
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mockingbird_(Eminem_song)"));
                        startActivity(songInfo);
                    }else{
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                        startActivity(songInfo);
                    }
                }
                return true;
            case R.id.open_artist_page:
                for (int i = 0; i < selectedPlay.size(); i++) {
                    if (selectedPlay.get(i).equals(nelly)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Nelly_Furtado"));
                        startActivity(songInfo);
                    } else if (selectedPlay.get(i).equals(sia)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Sia_Furler"));
                        startActivity(songInfo);
                    } else if (selectedPlay.get(i).equals(arjit)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Arijit_Singh"));
                        startActivity(songInfo);
                    } else if (selectedPlay.get(i).equals(logic)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Logic_(musician)"));
                        startActivity(songInfo);
                    } else if (selectedPlay.get(i).equals(empire)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Empire_of_the_Sun_(band)"));
                        startActivity(songInfo);
                    } else if (selectedPlay.get(i).equals(eminem)) {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Eminem"));
                        startActivity(songInfo);
                    } else {
                        Intent songInfo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                        startActivity(songInfo);
                    }
                }
                return true;
            case R.id.play:
            for (int i = 0; i < selectedPlay.size(); i++){
                if (selectedPlay.get(i).equals(nelly)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PLolag3YSYU"));
                    startActivity(play);
                }
                else if (selectedPlay.get(i).equals(sia)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JRfuAukYTKg"));
                    startActivity(play);
                }
                else if (selectedPlay.get(i).equals(arjit)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jHNNMj5bNQw"));
                    startActivity(play);
                }else if (selectedPlay.get(i).equals(logic)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=M2NIMHVmGwk"));
                    startActivity(play);
                }
                else if (selectedPlay.get(i).equals(empire)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eimgRedLkkU"));
                    startActivity(play);
                }
                else if (selectedPlay.get(i).equals(eminem)) {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9bCLPwzSC0"));
                    startActivity(play);
                }
                else {
                    Intent play = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/404"));
                    startActivity(play);
                }
            }
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }


}
