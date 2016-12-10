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

    private String destination_addresses[][] = new String[3][3];
    private String origin_addresses;
    private Rows rows[][] = new Rows[10][10];
    private String status;

    public Localization() {
        
    }

    public String getOrigin_addresses() {
        return origin_addresses;
    }

    public void setOrigin_addresses(String origin_addresses) {
        this.origin_addresses = origin_addresses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[][] getDestination_addresses() {
        return destination_addresses;
    }

    public void setDestination_addresses(String[][] destination_addresses) {
        this.destination_addresses = destination_addresses;
    }

}
