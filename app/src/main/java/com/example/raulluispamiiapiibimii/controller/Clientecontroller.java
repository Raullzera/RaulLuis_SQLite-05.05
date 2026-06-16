package com.example.raulluispamiiapiibimii.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.raulluispamiiapiibimii.datamodel.ClienteDataModel;
import com.example.raulluispamiiapiibimii.datasource.AppDataBase;
import com.example.raulluispamiiapiibimii.model.Cliente;
import com.example.raulluispamiiapiibimii.view.MainActivity;

public class Clientecontroller extends AppDataBase implements iCRUD<Cliente> {
        public Clientecontroller(Context context){

            super(context);
        }

        public boolean inserir(Cliente obj){
            dados = new ContentValues();
            dados.put(ClienteDataModel.NOME, obj.getNome());
            dados.put(ClienteDataModel.EMAIL, obj.getEmail());

            String tabela = ClienteDataModel.TABELA;
            return insert(tabela, dados);

        }
}
