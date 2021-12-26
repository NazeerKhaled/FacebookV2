package com.example.facebookv2.data;

import com.example.facebookv2.Pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Postinterface {
    @GET("posts")
    public Call<List<PostModel>>getPosts();
}
