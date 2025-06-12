package com.matheus.record.model;

import java.util.Objects;

public class Funcionario {
    private final String nome;
    private final int id;
    private final String dataNacimento;

    public Funcionario(String nome, int id, String dataNacimento) {
        this.nome = nome;
        this.id = id;
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    //Core Class


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(dataNacimento, that.dataNacimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id, dataNacimento);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", dataNacimento='" + dataNacimento + '\'' +
                '}';
    }
}
