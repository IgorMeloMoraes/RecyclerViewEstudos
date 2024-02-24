package com.example.recyclerviewestudos;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MinhaListaRecycler extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView txtNome, txtEmail;

    public MinhaListaRecycler(@NonNull View itemView) {
        super(itemView);

        // Retorno dos objetos da lista hooks
        imgView = itemView.findViewById(R.id.img_view);
        txtNome = itemView.findViewById(R.id.txt_nome);
        txtEmail = itemView.findViewById(R.id.txt_email);
    }

    /*
     Passos
     I - Extender a classe para recycler.viewHolder
     II - Gerar o construtor publico da classe
     III - Criar os hooks com os intens da lista que estão no layout da lista
    *  */
}
