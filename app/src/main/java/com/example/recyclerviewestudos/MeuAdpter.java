package com.example.recyclerviewestudos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdpter extends RecyclerView.Adapter<MinhaListaRecycler> {

    Context context;
    List<Itens> itens;

    public MeuAdpter(Context context, List<Itens> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public MinhaListaRecycler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflar nosso layout da lista aqui no adapter
        return new MinhaListaRecycler(LayoutInflater.from(context).inflate(R.layout.itens_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MinhaListaRecycler holder, int position) {
        // Retornamos o item e sua posição da classe dos Intens da lista que criamos
        holder.txtNome.setText(itens.get(position).getNome());
        holder.txtEmail.setText(itens.get(position).getEmail());
        holder.imgView.setImageResource(itens.get(position).getImagem());
    }


    @Override
    public int getItemCount() {
        // Aqui retornamos o tamanho da nossa lista
        return itens.size();
    }

    /*
     Passos
     I - Extender a classe para recycler.Adapter<Passamos a classe que criamos MINHALISTARECYCLER>
     II - Gerar os tres construtores  da classe
     III - Criar os hooks de contexto e chamar nossa classe de lista
     IV - Gerar os contrutores dos hooks criados
    *  */
}
