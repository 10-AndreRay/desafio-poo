package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(){};

    public double calcularXp() {
        return XP_PADRAO * 3d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                ", data=" + data +
                ", XP_PADRAO=" + XP_PADRAO +
                '}';
    }
}
