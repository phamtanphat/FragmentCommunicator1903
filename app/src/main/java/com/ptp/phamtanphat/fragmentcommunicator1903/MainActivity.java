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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();

        btnMain = findViewById(R.id.buttonMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ActivitySendToFragment();
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
}
