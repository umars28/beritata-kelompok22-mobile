package com.example.kelompok22.beritata.API;

public class Server {
    public static final String URL_API = "https://newsapi.org/";

    public static ApiService getApiService(){
        return RetrofitApi.getClient(URL_API).create(ApiService.class);
    }
}
