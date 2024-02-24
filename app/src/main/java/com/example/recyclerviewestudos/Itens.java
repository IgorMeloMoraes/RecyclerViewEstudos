package com.example.recyclerviewestudos;

public class Itens {

    // Aqui passamos os itens da nossa lista que iremos recuperar posteriormente na recycler

    String nome;
    String email;
    int imagem;

    // Construtor Criado
    public Itens(String nome, String email, int imagem) {
        this.nome = nome;
        this.email = email;
        this.imagem = imagem;
    }


    // Getter e Setter dos itens criados acima
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
