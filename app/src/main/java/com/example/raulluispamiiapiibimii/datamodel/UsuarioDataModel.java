package com.example.raulluispamiiapiibimii.datamodel;

public class UsuarioDataModel {

    public static final String TABELA = "Usuario";

    public static final String ID = "id";

    public static final String EMAIL = "email";

    public static final String SENHA = "senha";

    public static String queryCriarTabela = "";

    public static String criarTabela() {
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA + "(";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += EMAIL + " TEXT, ";
        queryCriarTabela += SENHA + " TEXT, ";
        queryCriarTabela += ");";

        return queryCriarTabela;
    }
}
