package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mWordsBackgroundColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int resId) {
        super(context, 0, words);
        mWordsBackgroundColorResourceId = resId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        LinearLayout view = (LinearLayout) listItemView.findViewById(R.id.word_layout);
        view.setBackgroundResource(mWordsBackgroundColorResourceId);

        Word currentWord = getItem(position);

        TextView defaultView = (TextView) listItemView.findViewById(R.id.english_word);
        defaultView.setText(currentWord.getDefaultTranslation());

        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_image);
        if (currentWord.getImageResourceId() == Word.NO_IMAGE_RESOURCE) {
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
