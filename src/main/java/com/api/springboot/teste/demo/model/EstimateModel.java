package com.api.springboot.teste.demo.model;

public class EstimateModel {
    private int primeiroNumero;
    private int segundoNumero;
    private int numeroFinal;

    public EstimateModel(int primeiroNumero, int segundoNumero){
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public int soma() {
        return numeroFinal = primeiroNumero + segundoNumero;
    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(int numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

}
