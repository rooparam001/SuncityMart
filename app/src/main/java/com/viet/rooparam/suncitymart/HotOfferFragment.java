package com.viet.rooparam.suncitymart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HotOfferFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater Inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view = Inflater.inflate(R.layout.fragment_hot_offer,container,false);

        return view;
    }

}
