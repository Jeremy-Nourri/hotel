package org.example.models;

public class Chambre {
    int numero;
    boolean occupe;
    double tarif;
    int capacite;

    public Chambre(int numero, double tarif, int capacite) {
        this.numero = numero;
        this.occupe = false;
        this.tarif = tarif;
        this.capacite = capacite;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isOccupe() {
        return occupe;
    }
    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
    public double getTarif() {
        return tarif;
    }
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
