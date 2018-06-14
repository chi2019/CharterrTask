package com.example.chanakya.charterrtask.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chanakya on 6/13/2018.
 */

public class NetworkInstance {

  //  https://glacial-bayou-77287.herokuapp.com/listAccounts

    public  static String BASE_URL = " https://glacial-bayou-77287.herokuapp.com" ;

    static Retrofit retrofit=null;


    public static Retrofit getNetworkInstance(){

        retrofit = new retrofit2.Retrofit.Builder()
                      .baseUrl(BASE_URL)
                      .addConverterFactory(GsonConverterFactory.create())
                      .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                      .build();

        return retrofit;
    }


}
