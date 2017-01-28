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
        words.add(new Word("Black", "lutti", R.drawable.color_black));
        words.add(new Word("Brown", "otiiko", R.drawable.color_brown));
        words.add(new Word("Green", "tolookosu", R.drawable.color_green));
        words.add(new Word("Dusty Yellow", "oyyisa", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "oyyisa", R.drawable.color_mustard_yellow));
        words.add(new Word("Red", "massokka", R.drawable.color_red));
        words.add(new Word("Gray", "massokka", R.drawable.color_gray));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

    }
}
