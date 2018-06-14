package com.example.chanakya.charterrtask.Ui.presenter;

import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.List;

/**
 * Created by chanakya on 6/13/2018.
 */

public interface IMainPresenter {

    void getDetails();

    void loadDataInDetails(ClientAccount clientAccount);

}
