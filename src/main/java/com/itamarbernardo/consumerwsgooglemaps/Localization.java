/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itamarbernardo.consumerwsgooglemaps;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANAFLAVIA
 */
public class Localization {
    
    private List<String> enderecoDestino;
    private List<String> enderecoAtual;
    private List<Rows> rows;
    private String status;

    public Localization(List<Rows> rows) {
        this.rows = new ArrayList<Rows>();
        this.enderecoAtual = new ArrayList<>();
        this.enderecoDestino = new ArrayList<>();
        this.rows = rows;
    }

    public List<String> getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(List<String> enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public List<String> getEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(List<String> enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }
    
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
