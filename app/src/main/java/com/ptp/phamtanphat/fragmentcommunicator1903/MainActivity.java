package com.ptp.phamtanphat.fragmentcommunicator1903;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMain;
    FragmentManager fragmentManager;
    String[] mangchuoi = {"Quan 1" , "Quan 2" , "Quan 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();

        btnMain = findViewById(R.id.buttonMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAndroid fragmentAndroid = (FragmentAndroid) fragmentManager.findFragmentById(R.id.fragmentAndroid);
                fragmentAndroid.NhanArray(mangchuoi);
            }
        });
    }
    public void ActivitySendToFragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();

        //Chuyen du lieu tu activity qua cho fragment Android thong qua bundle
        Bundle bundle = new Bundle();
        bundle.putString("chuoi","Text from Main");
        fragmentAndroid.setArguments(bundle);

        fragmentTransaction.add(R.id.linearlayout,fragmentAndroid);
        fragmentTransaction.commit();
    }
    public void CapnhatviewtuActivitychoFragment(){
        //Chi cap nhat view cho fragment
        String dataupdate = "Chao Android";

        FragmentAndroid fragmentAndroid =
                (FragmentAndroid) fragmentManager.findFragmentById(R.id.fragmentAndroid);

        if (fragmentAndroid != null){
            fragmentAndroid.txtTitleAndroid.setText(dataupdate);
        }
    }
}
