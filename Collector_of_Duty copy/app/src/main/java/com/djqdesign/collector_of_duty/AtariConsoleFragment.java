package com.djqdesign.collector_of_duty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.djqdesign.collector_of_duty.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AtariConsoleFragment extends Fragment {


    public AtariConsoleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_atari_console, container, false);
    }

}
