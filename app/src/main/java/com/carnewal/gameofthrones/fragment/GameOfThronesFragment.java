package com.carnewal.gameofthrones.fragment;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carnewal.gameofthrones.R;
import com.carnewal.gameofthrones.adapter.GameOfThronesAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class GameOfThronesFragment extends Fragment {

    @Bind(R.id.recyclerview_gameofthrones)
    public RecyclerView mRecyclerView;

    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public GameOfThronesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game_of_thrones, container, false);

        ButterKnife.bind(this, view);

        //Meerdere kolommen in landscape mode
        if(getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            mRecyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 1));
        }
        else{
            mRecyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        }


        mAdapter = new GameOfThronesAdapter();
        mRecyclerView.setAdapter(mAdapter);
        return view;



    }
}
