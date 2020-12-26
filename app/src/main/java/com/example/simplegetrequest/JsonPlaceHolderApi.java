package com.example.simplegetrequest;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlaceHolderApi {

    @GET("Posts")
    Call<List<Post>> getPosts();
}
