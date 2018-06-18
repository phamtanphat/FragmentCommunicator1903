package com.ptp.phamtanphat.fragmentcommunicator1903;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentAndroid extends Fragment{

    TextView txtTitleAndroid;
    Button btnAndroid;
    EditText edtAndroid;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android,container,false);

        txtTitleAndroid = view.findViewById(R.id.textviewTitleFragmentAndroid);
        btnAndroid = view.findViewById(R.id.buttonFragmentAndroid);
        edtAndroid = view.findViewById(R.id.edittextFragmentAndroid);

//        Bundle bundle = getArguments();
//        String chuoi = bundle.getString("chuoi");
//
//        Toast.makeText(getActivity(), chuoi, Toast.LENGTH_SHORT).show();

        return view;
    }
}
