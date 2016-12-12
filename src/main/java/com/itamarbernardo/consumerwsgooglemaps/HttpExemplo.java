/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itamarbernardo.consumerwsgooglemaps;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpExemplo {

   
    public static void main(String[] args) throws Exception {

        Acesso http = new Acesso();
        String destino = "Garanhuns,PE";
        String origem = "BomConselho,PE";
        String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + origem +"&destinations=" + destino + "&key=AIzaSyDxSPaFPYw4VHoODgbDcoRWjj68zeUkEu8";
        
        String json = http.sendGet(url);

        Gson g = new Gson();
        Localization l = new Localization();
        Type modelo = new TypeToken<Localization>() {}.getType();
        
        l = g.fromJson(json, modelo);
        System.out.println("Status: " + l.getStatus());
        System.out.println("Destino: " + l.getDestination_addresses()[0]);
        System.out.println("Origem: " + l.getOrigin_addresses()[0]);
        System.out.println("Distância: " + l.getRows()[0].getElements()[0].getDistance().getText());
        System.out.println("Duração: " + l.getRows()[0].getElements()[0].getDuration().getText());


    }

}
