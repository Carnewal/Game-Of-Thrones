package com.carnewal.gameofthrones.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carnewal.gameofthrones.R;
import com.carnewal.gameofthrones.activity.CharacterDetailActivity;
import com.carnewal.gameofthrones.model.GOTCharacter;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Brecht on 7/01/2016.
 */
public class CharacterDetailFragment extends Fragment {


    @Bind(R.id.char_name)
    public TextView tvName;

    @Bind(R.id.char_description)
    public TextView tvDescription;

    @Bind(R.id.char_image)
    public ImageView ivCharacter;




    public CharacterDetailFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_character_detail, container, false);
        ButterKnife.bind(this, view);

        GOTCharacter c = (GOTCharacter) getActivity().getIntent().getExtras().getSerializable(CharacterDetailActivity.CHARACTER_OBJECT);

        tvName.setText(c.name);
        tvDescription.setText(c.description);
        Picasso.with(this.getContext())
                .load(c.imageUrl)
                .placeholder(R.drawable.error)
                .error(R.drawable.error)
                .resize(512, 512).centerCrop()
                .into(ivCharacter);

        return view;

    }
}
