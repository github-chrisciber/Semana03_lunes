package com.cibertec.semana03_lunes.api;

import com.cibertec.semana03_lunes.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

    // https://jsonplaceholder.typicode.com/users

    @GET("users")
    public abstract Call<List<User>>  listaUsuario();


}
