package com.example.recyclerviewestudos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gerar o Hooks da nossa lista
        RecyclerView recyclerView = findViewById(R.id.recyclerView);



        // Aqui instanciamos a nossa lista retornado a classe com os intens da nossa lista criada
        List<Itens> itens = new ArrayList<Itens>();

        // Aqui add e nomeamos cada item da nossa lista, junto com sua imagens ou items que tiver
        itens.add(new Itens("Naruto Uzumaki","naruto.uzumaki@email.com",R.drawable.a));
        itens.add(new Itens("Sasuke Uchiha","sasuke.uchiha@email.com",R.drawable.b));
        itens.add(new Itens("Sakura Haruno","sakura.haruno@email.com",R.drawable.c));
        itens.add(new Itens("Kakashi Hatake","kakashi.hatake@email.com",R.drawable.d));
        itens.add(new Itens("Hinata Hyuga","hinata.hyuga@email.com",R.drawable.e));
        itens.add(new Itens("Kiba Aburame","kiba.aburame@email.com",R.drawable.f));
        itens.add(new Itens("Rock Lee","rock.lee@email.com",R.drawable.g));
        itens.add(new Itens("Neji Hyuga","neji.hyuga@email.com",R.drawable.g));
        itens.add(new Itens("Chouji","chouji@email.com",R.drawable.a));
        itens.add(new Itens("Ino","ino@email.com",R.drawable.b));
        itens.add(new Itens("Shikamaru","shikamaru@email.com",R.drawable.c));
        itens.add(new Itens("Asuma Sarutobi","asuma.sarutobi@email.com",R.drawable.d));
        itens.add(new Itens("Ten Ten","ten.ten@email.com",R.drawable.e));
        itens.add(new Itens("Konohamaru","konohamaru@email.com",R.drawable.f));
        itens.add(new Itens("Gai","gai@email.com",R.drawable.g));
        itens.add(new Itens("Kurenai","kurenai@email.com",R.drawable.g));


        // Retornar para a nossa lista recycler o layoyt manager e setar nosso adapter com nossos itens de lista
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MeuAdpter(getApplicationContext(),itens));
    }

    // Antes de Iniciar, implemente a dependencia de recyclerview no gradle
    // Criar uma classe para os itens e a lista
    // Criar um layout para os itens - Aqui é criado o modelo da nossa recyclerView em layoyt
    // Criar uma classe para receber o holder e gerar a lista
    // Criar uma classe Adpter
    // Depois retornamos o nosso adpter e a lista na classe que vamos mostrar a lista


}