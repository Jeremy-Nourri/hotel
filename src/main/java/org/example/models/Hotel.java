package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String nom;
    private Chambre[] chambres;
    private List<Reservation> reservations;
    private List<Client> client;

    public Hotel(String nom, int nombreChambre) {
        this.nom = nom;
        this.chambres = new Chambre[nombreChambre];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chambre[] getChambres() {
        return chambres;
    }
    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }
}

