package com.example.raulluispamiiapiibimii.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.raulluispamiiapiibimii.R;
import com.example.raulluispamiiapiibimii.controller.Clientecontroller;
import com.example.raulluispamiiapiibimii.model.Cliente;

public class AlterarClienteActivity extends AppCompatActivity {

    EditText editNome, editEmail, editTelefone;

    Button btnSalvar, btnVoltar;

    Cliente cliente;

    Clientecontroller clientecontroller;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_cliente);

        editNome = findViewById(R.id.edtNome);
        editEmail = findViewById(R.id.edtEmail);
        editTelefone = findViewById(R.id.edtTelefone);
        btnSalvar = findViewById(R.id.btnSalvar);

        clientecontroller = new Clientecontroller(this);

        cliente = (Cliente) getIntent(). getSerializableExtra("cliente");

        if(cliente != null){
            editNome.setText(cliente.getNome());
            editEmail.setText(cliente.getEmail());
            editTelefone.setText(cliente.getTelefone());
        }
    }
}
