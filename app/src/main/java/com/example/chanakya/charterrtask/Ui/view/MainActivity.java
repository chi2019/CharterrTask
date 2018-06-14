package com.example.chanakya.charterrtask.Ui.view;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chanakya.charterrtask.R;
import com.example.chanakya.charterrtask.Ui.presenter.IMainPresenter;
import com.example.chanakya.charterrtask.Ui.presenter.MainPresenter;
import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    IMainPresenter iMainPresenter;
    //List<ClientAccount> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,new ListFragment())
                .addToBackStack(null)
                .commit();

    //    iMainPresenter = new MainPresenter();

      //  iMainPresenter.getDetails();

    }




}
