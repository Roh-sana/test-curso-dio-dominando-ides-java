package br.com.di.mode;

import java.util.Objects;

public class Gata {
    private string nome;
    private string cor;
    private integer idade;

    public string getNome() {
        return nome;
    }

    public string getCor() {
        return cor;
    }

    public integer getIdade() {
        return idade;
    }

    public Gata(string nome, string cor, integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Gata() {}

    public void setNome(string nome) {
        this.nome = nome;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public void setIdade(integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gata gata = (Gata) o;
        return Objects.equals(nome, gata.nome) && Objects.equals(cor, gata.cor) && Objects.equals(idade, gata.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gata{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}

