package com.example.simplegetrequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface JsonPlaceHolderApi {

    @GET("Posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer userId,
            @Query("_sort") String sort,
            @Query("_order") String order
            );

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int PostId);
}
