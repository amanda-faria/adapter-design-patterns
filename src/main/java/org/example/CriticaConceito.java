package org.example;

public class CriticaConceito implements ICritica {
    private String conceito;

    @Override
    public String getCritica() {
        return this.conceito;
    }

    @Override
    public void setCritica(String conceito) {
        this.conceito = conceito;
    }
}