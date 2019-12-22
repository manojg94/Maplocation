package com.manoj.maplocation.api;


import com.manoj.maplocation.api.pojo.uploadData;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface api {
    String baseurl = "https://96gw5cphgi.execute-api.ap-south-1.amazonaws.com/";
    String weatherurl = "https://96gw5cphgi.execute-api.ap-south-1.amazonaws.com/";

    @Headers("Content-Type: application/json")
    @POST("latest")
    Call<uploadData> postlocation(@Body String body);
}
