/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itamarbernardo.consumerwsgooglemaps;

/**
 *
 * @author ANAFLAVIA
 */
class Elementos {

    private String status;
    private Duracao duracao;
    private Distancia distance;
    
    public Elementos(Distancia distance, Duracao duracao) {
        this.distance = distance;
        this.duracao = duracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Distancia getDistance() {
        return distance;
    }

    public void setDistance(Distancia distance) {
        this.distance = distance;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(Duracao duracao) {
        this.duracao = duracao;
    }

}
