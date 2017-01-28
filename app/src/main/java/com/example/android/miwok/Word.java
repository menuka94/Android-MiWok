package com.example.android.miwok;

/**
 * Created by menuka on 1/27/17.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE_ID;
    private static final int NO_IMAGE_ID = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    /*
     ** Returns whether or not there is an image for this word
     */
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_ID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
