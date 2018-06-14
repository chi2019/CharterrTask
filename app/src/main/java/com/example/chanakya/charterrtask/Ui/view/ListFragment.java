package com.example.chanakya.charterrtask.Ui.view;


import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chanakya.charterrtask.R;
import com.example.chanakya.charterrtask.Ui.presenter.IMainPresenter;
import com.example.chanakya.charterrtask.Ui.presenter.MainPresenter;
import com.example.chanakya.charterrtask.adapter.Adapter;
import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements IMain{


    IMainPresenter iMainPresenter;
    View v;
    Adapter adapter;

    RecyclerView recyclerViewList;

    public ListFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerViewList  = v.findViewById(R.id.recyclerViewList);



       iMainPresenter = new MainPresenter(this);

       iMainPresenter.getDetails();


        return v;
    }

    @Override
    public void populateUI(List<ClientAccount> list) {


      //  Log.e("data",list + "");

        adapter = new Adapter(getContext(),list);

        recyclerViewList.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewList.setAdapter(adapter);



    }
}
