package com.example.rober.provasubstitutiva.Modelo;

import retrofit2.http.GET;

public interface Chamadas {



        @Get("/lista_de_alunos")
        Call<List<Aluno>> ListaAluno();

