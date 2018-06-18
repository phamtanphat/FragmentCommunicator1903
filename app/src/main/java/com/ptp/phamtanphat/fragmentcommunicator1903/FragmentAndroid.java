package com.ptp.phamtanphat.fragmentcommunicator1903;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
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
    String[] mang;
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
        //Chi cap nhat view cho activity

//              btnAndroid.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mang!= null){
                    Toast.makeText(getActivity(), mang.length + "", Toast.LENGTH_SHORT).show();
                    handler.removeCallbacks(this);
                }else {
                    handler.postDelayed(this,100);
                }
            }
        },100);

        return view;
    }
    public void GanDulieuTuFragmentChoActivity(){
        String chuoi = "Chao activity";
        Button btnMain = getActivity().findViewById(R.id.buttonMain);
        btnMain.setText(chuoi);
    }
    public void NhanArray(String[] array){
        mang = array;
    }
}
