package br.com.di.mode;

import java.util.Objects;

public class gat {
    private string nome;
    private string nome;
    private string nome;

    public gat() {}

    public gat(string nome, string cor, string idade) {
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCor() {
        return cor;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public string getIdade() {
        return idade;
    }

    public void setIdade(string idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "gat{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        gat gat = (gat) o;
        return Objects.equals(nome, gat.nome) && Objects.equals(cor, gat.cor) && Objects.equals(idade, gat.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);



    }
}
