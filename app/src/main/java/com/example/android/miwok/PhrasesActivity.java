package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("How are you feeling?", "lutti", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("Come Here", "otiiko", R.raw.phrase_come_here));
        words.add(new Word("Are you coming?", "tolookosu", R.raw.phrase_are_you_coming));
        words.add(new Word("I'm coming", "oyyisa", R.raw.phrase_im_coming));
        words.add(new Word("Let's go", "oyyisa", R.raw.phrase_lets_go));
        words.add(new Word("My name is", "oyyisa", R.raw.phrase_my_name_is));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);

                releaseMediaPlayer();

                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());

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
