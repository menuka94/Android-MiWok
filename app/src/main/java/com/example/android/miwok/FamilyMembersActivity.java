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
        words.add(new Word("Mother", "lutti", R.drawable.family_father));
        words.add(new Word("Father", "otiiko", R.drawable.family_mother));
        words.add(new Word(" Older Brother", "tolookosu", R.drawable.family_older_brother));
        words.add(new Word("Younger Brother", "tolookosu", R.drawable.family_younger_brother));
        words.add(new Word("Older Sister", "oyyisa", R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "oyyisa", R.drawable.family_younger_sister));
        words.add(new Word("Younger Sister", "oyyisa", R.drawable.family_younger_sister));
        words.add(new Word("Grandfather", "grandpa", R.drawable.family_grandfather));
        words.add(new Word("Grandmother", "grandma", R.drawable.family_grandmother));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

    }
}
