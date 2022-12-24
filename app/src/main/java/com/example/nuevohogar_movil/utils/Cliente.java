package com.example.nuevohogar_movil.utils;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class Cliente {
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://127.0.0.1:8080/")
            .addConverterFactory(MoshiConverterFactory.create()).build();

    private static final Cliente instanciaPropia = new Cliente();

    public static Cliente getInstancia(){
        return instanciaPropia;
    }

    private Cliente(){

    }
}
