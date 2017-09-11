package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     * @param mMiwokTranslation is the word in the Miwok language
     * @param mDefaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     */
    public Word (String mDefaultTranslation, String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    /**
     * Create a new Word object.
     * @param mMiwokTranslation is the word in the Miwok language
     * @param mDefaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param mImageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word (String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
