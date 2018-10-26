package edu.upc.eetac.dsa;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TracksAPI {
    String BASE_URL = "http://147.83.7.155:8080/dsaApp/";

    @GET("tracks")
    Call<List<Tracks>> getTracks();

    @DELETE("tracks/{id}")
    Call<Void> deleteTrack(@Path("id") int id);
}
