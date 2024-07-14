package org.example;

public class Restaurante {

    ICritica critica;
    CriticaAdapter persistencia;

    public Restaurante() {
        critica = new CriticaConceito();
        persistencia = new CriticaAdapter(critica);
    }

    public void setCritica(String conceito) {
        critica.setCritica(conceito);
        persistencia.salvarCritica();
    }

    public String getCritica() {
        return persistencia.recuperarCritica();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }

}