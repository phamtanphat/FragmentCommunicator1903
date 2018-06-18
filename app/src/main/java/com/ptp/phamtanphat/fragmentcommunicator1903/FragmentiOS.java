package com.ptp.phamtanphat.fragmentcommunicator1903;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class FragmentiOS extends Fragment {

    TextView txtiOS;
    RatingBar ratingBariOS;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_ios,container,false);

        txtiOS = view.findViewById(R.id.textviewTitleFragmentiOS);
        ratingBariOS = view.findViewById(R.id.ratingbarFragmentios);

        return view;
    }
}
