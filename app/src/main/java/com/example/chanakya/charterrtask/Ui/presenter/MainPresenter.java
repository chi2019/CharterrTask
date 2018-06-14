package com.example.chanakya.charterrtask.Ui.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.chanakya.charterrtask.R;
import com.example.chanakya.charterrtask.Ui.view.DetailsFragment;
import com.example.chanakya.charterrtask.Ui.view.IMain;
import com.example.chanakya.charterrtask.Ui.view.MainActivity;
import com.example.chanakya.charterrtask.model.ClientAccount;
import com.example.chanakya.charterrtask.network.NetworkInstance;
import com.example.chanakya.charterrtask.network.NetworkService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by chanakya on 6/13/2018.
 */

public class MainPresenter implements IMainPresenter {

    List<ClientAccount> list;
    IMain iMain;
    Context context;
    View v;

    public MainPresenter(IMain iMain) {
        this.iMain = iMain;
    }

    public MainPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void getDetails() {
     //   NetworkService service = NetworkInstance.getNetworkInstance().create(NetworkService.class);

        //list = new ArrayList<>();

      // NetworkService networkService = NetworkInstance.getNetworkInstance().create(NetworkService.class);

    //   Observable<List<ClientAccount>> call   = networkService.getClientAccountDetails();




                              //    service.getClientAccountDetails();
          NetworkInstance.getNetworkInstance().create(NetworkService.class)
                 .getClientAccountDetails()
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(this::handleResult,this::handleError);



    }

    @Override
    public void loadDataInDetails(ClientAccount clientAccount) {
      //  Log.e("dataToDetails",clientAccount.getName());

        DetailsFragment detailsFragment = new DetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("accountSelected",clientAccount);
        detailsFragment.setArguments(bundle);

        ((AppCompatActivity)context).getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, detailsFragment)
                .addToBackStack(null)
                .commit();

    }

    private void handleError(Throwable throwable) {

       // Log.e("result",throwable.getMessage() + " ");


    }

    private void handleResult(List<ClientAccount> clientAccounts) {

      //Log.e("result",clientAccounts + " ");
     // list.addAll(clientAccounts);

    //  Log.e("list",list.get(0) + " ");

    // IMain  iMain = (IMain) view;
            iMain.populateUI(clientAccounts);


    }


}
