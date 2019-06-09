package com.wohhie.www.drinkshop.utils;

import com.wohhie.www.drinkshop.retrofit.IDrinkShopAPI;
import com.wohhie.www.drinkshop.retrofit.RetrofitClient;

import retrofit2.Retrofit;

public class Common {

    private static final String BASE_URL = "http://localhost/webservice/";

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
