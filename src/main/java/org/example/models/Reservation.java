package org.example.models;

import java.time.LocalDate;

public class Reservation {
    int numero;
    boolean valide;
    Client client;
    Chambre chambre;
    LocalDate date;
    public Reservation(int numero, boolean valide, Client client, Chambre chambre, LocalDate date) {
        this.numero = numero;
        this.valide = valide;
        this.client = client;
        this.chambre = chambre;
        this.date = date;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isValide() {
        return valide;
    }
    public void setValide(boolean valide) {
        this.valide = valide;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
