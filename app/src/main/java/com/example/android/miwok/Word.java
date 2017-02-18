package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation and an image for that word.
 */
public class Word {

    public static final int NO_IMAGE_RESOURCE = -1;

    /** Miwok translation for the word */
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId;
    /** Audio resource ID for the word */
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = NO_IMAGE_RESOURCE;
        mAudioResourceId = audioResId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
