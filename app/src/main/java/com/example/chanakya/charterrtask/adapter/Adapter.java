package com.example.chanakya.charterrtask.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chanakya.charterrtask.R;
import com.example.chanakya.charterrtask.Ui.presenter.IMainPresenter;
import com.example.chanakya.charterrtask.Ui.presenter.MainPresenter;
import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.List;

/**
 * Created by chanakya on 6/14/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder>{


    Context context;
    List<ClientAccount> list;



    public Adapter(Context context, List<ClientAccount> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);



        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        ClientAccount clientAccount = list.get(position);

        holder.accountName.setText(clientAccount.getName());
        holder.amount.setText( String.valueOf(clientAccount.getAmount()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IMainPresenter iMainPresenter = new MainPresenter(context);
                iMainPresenter.loadDataInDetails(clientAccount);


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }






    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView accountName,amount;


        public ListViewHolder(View itemView) {
            super(itemView);


            accountName = itemView.findViewById(R.id.textViewAccountName);
            amount = itemView.findViewById(R.id.textViewAmount);



        }


    }

}
