package com.carnewal.gameofthrones.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carnewal.gameofthrones.R;
import com.carnewal.gameofthrones.activity.CharacterDetailActivity;
import com.carnewal.gameofthrones.model.CharacterMockData;
import com.carnewal.gameofthrones.model.GOTCharacter;
import com.squareup.picasso.Picasso;


import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Brecht on 7/01/2016.
 */
public class GameOfThronesAdapter extends RecyclerView.Adapter<GameOfThronesAdapter.CardViewHolder> {


    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_character, parent, false);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        GOTCharacter character = CharacterMockData.characters.get(position);
        holder.setUp(character);
    }

    @Override
    public int getItemCount() {
        return CharacterMockData.characters.size();
    }


    /**
     * CardViewHolder Inner Class.
     */
    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private GOTCharacter character;

        @Bind(R.id.card_image)
        protected ImageView cardImage;

        @Bind(R.id.card_name)
        protected TextView cardName;

        public CardViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ButterKnife.bind(this, itemView);
        }

        public void setUp(GOTCharacter character) {
            this.character = character;
            Picasso.with(this.cardImage.getContext())
                    .load(this.character.imageUrl)
                    .placeholder(R.drawable.error)
                    .error(R.drawable.error)
                    .resize(512, 300).centerCrop()
                    .into(cardImage);
            cardName.setText(this.character.name);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), CharacterDetailActivity.class);
            intent.putExtra(CharacterDetailActivity.CHARACTER_OBJECT, character);
            v.getContext().startActivity(intent);
        }
    }




}
