package com.example.assignment1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {

    @GET("posts")
    Call<List<Post>> getPosts();
}
