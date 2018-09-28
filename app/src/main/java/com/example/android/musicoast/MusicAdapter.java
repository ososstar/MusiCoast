package com.example.android.musicoast;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Activity context, ArrayList<Music> musics) {
        super(context, 0, musics);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Music currentMusicAdapter = getItem(position);

        TextView musicNameAdapter = listItemView.findViewById(R.id.musicTitle);
        musicNameAdapter.setText(currentMusicAdapter.getMusicName());

        TextView albumNameAdapter = listItemView.findViewById(R.id.albumName);
        albumNameAdapter.setText(currentMusicAdapter.getAlbumName());

        ImageView albumCoverAdapter = listItemView.findViewById(R.id.albumCover);
        albumCoverAdapter.setImageResource(currentMusicAdapter.getAlbumCoverId());

        return listItemView;

    }
}
