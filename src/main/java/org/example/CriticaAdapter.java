package org.example;

public class CriticaAdapter extends CriticaNota {

    private ICritica criticaConceito;

    public CriticaAdapter(ICritica avaliacaoConceito) {
        this.criticaConceito = avaliacaoConceito;
    }

    public String recuperarCritica() {
        if (this.getNota() >= 9.0f)
            criticaConceito.setCritica("A");
        else
        if (this.getNota() >= 8.0f)
            criticaConceito.setCritica("B");
        else
        if (this.getNota() >= 7.0f)
            criticaConceito.setCritica("C");
        else
            criticaConceito.setCritica("D");
        return criticaConceito.getCritica();
    }

    public void salvarCritica() {
        if (criticaConceito.getCritica().equals("A"))
            this.setNota(9.0f);
        else
        if (criticaConceito.getCritica().equals("B"))
            this.setNota(8.0f);
        else
        if (criticaConceito.getCritica().equals("C"))
            this.setNota(7.0f);
        else
            this.setNota(0.0f);
    }
}