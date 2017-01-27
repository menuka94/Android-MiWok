package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Mother", "lutti"));
        words.add(new Word("Father", "otiiko"));
        words.add(new Word("Brother", "tolookosu"));
        words.add(new Word("Sister", "oyyisa"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

    }
}
