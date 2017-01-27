package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.WrapperListAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Black", "lutti"));
        words.add(new Word("Blue", "otiiko"));
        words.add(new Word("Green", "tolookosu"));
        words.add(new Word("Yellow", "oyyisa"));
        words.add(new Word("Red", "massokka"));
        words.add(new Word("Purple", "temmokka"));
        words.add(new Word("Maroon", "kenekaku"));
        words.add(new Word("Crimson", "kawinta"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

    }
}
