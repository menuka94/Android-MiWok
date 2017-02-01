package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.WrapperListAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Black", "lutti", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("Brown", "otiiko", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("Green", "tolookosu", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("Dusty Yellow", "oyyisa", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "oyyisa", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("Red", "massokka", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("Gray", "massokka", R.drawable.color_gray, R.raw.color_gray));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);

                releaseMediaPlayer();

                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });

            }
        });

    }

    private void releaseMediaPlayer(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
