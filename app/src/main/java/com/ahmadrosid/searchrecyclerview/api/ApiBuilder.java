package com.ahmadrosid.searchrecyclerview.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {

    /**
     * Call API Service
     * @return
     */
    public static ApiService call(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ahmadrosid.com:9000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }

}
