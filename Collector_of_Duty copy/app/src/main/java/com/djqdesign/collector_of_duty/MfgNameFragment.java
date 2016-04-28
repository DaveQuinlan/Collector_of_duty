package com.djqdesign.collector_of_duty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MfgNameFragment extends Fragment {
private long mfgId;
    public MfgNameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mfg_name, container, false);
    }// end onCreateView

    @Override
    public void onStart() {
        super.onStart();

    }
    public void setMfgId(long id) {
        this.mfgId = id;
    }// end setMfgId



}
