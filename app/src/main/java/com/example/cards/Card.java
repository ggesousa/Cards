package com.example.cards;

public class Card {
    private String textOcorrencia;
    private String textTipo;
    private String textStatus;
    private String Tipo;
    private String Status;

    public Card() {
    }

    public String getTextOcorrencia() {
        return textOcorrencia;
    }

    public void setTextOcorrencia(String textOcorrencia) {
        this.textOcorrencia = textOcorrencia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTextTipo() {
        return textTipo;
    }

    public void setTextTipo(String textTipo) {
        this.textTipo = textTipo;
    }

    public String getTextStatus() {
        return textStatus;
    }

    public void setTextStatus(String textStatus) {
        this.textStatus = textStatus;
    }
}
