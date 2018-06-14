package com.example.chanakya.charterrtask.network;



import com.example.chanakya.charterrtask.model.ClientAccount;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by chanakya on 6/13/2018.
 */

public interface NetworkService {


    @GET("listAccounts")
    Observable<List<ClientAccount>> getClientAccountDetails();


}
