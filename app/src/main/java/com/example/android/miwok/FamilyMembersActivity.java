package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Mother", "lutti", R.drawable.family_father, R.raw.family_mother));
        words.add(new Word("Father", "otiiko", R.drawable.family_mother, R.raw.family_father));
        words.add(new Word(" Older Brother", "tolookosu", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("Younger Brother", "tolookosu", R.drawable.family_younger_brother, R.raw.family_older_brother));
        words.add(new Word("Older Sister", "oyyisa", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("Younger Sister", "oyyisa", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("Grandfather", "grandpa", R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new Word("Grandmother", "grandma", R.drawable.family_grandmother, R.raw.family_grandmother));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);

                mediaPlayer = MediaPlayer.create(FamilyMembersActivity.this, word.getAudioResourceId());

                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }else{
                    mediaPlayer.start();
                }
            }
        });

    }
}
