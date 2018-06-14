package com.example.chanakya.charterrtask.Ui.view;


import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chanakya.charterrtask.R;
import com.example.chanakya.charterrtask.adapter.Adapter;
import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    View v;
    TextView nameOfAccount,roi;
    ConstraintLayout displayContainer;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_details, container, false);

        ClientAccount clientAccount = getArguments().getParcelable("accountSelected");

      //  Log.e("accountSelected",clientAccount.getROI() + "");
       // Log.e("accountSelected",clientAccount.getAmount() + "");
       // Log.e("accountSelected",clientAccount.getId() + "");

        displayContainer = v.findViewById(R.id.diaplayContainer);

        nameOfAccount = v.findViewById(R.id.textViewNameOfAccount);
        roi = v.findViewById(R.id.textViewROI);

        nameOfAccount.setText(clientAccount.getName());
        roi.setText(String.valueOf(clientAccount.getROI()));

        if(clientAccount.getROI() > 0){
            displayContainer.setBackgroundColor(Color.parseColor("#0039e6"));
        }
        else  displayContainer.setBackgroundColor(Color.parseColor("#ff0000"));




        return v;
    }

}
