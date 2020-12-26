package com.example.simplegetrequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

import java.util.List;
import java.util.Map;

public interface JsonPlaceHolderApi {

    @GET("Posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer userId,
            @Query("_sort") String sort,
            @Query("_order") String order
            );

    @GET("Posts")
    Call<List<Post>> getPosts(
            @QueryMap Map<String, String> parameters
    );

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int PostId);

    @GET
    Call<List<Comment>> getComments(@Url String url);
}
