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
import javax.swing.JOptionPane;

public class HttpExemplo {

   
    public static void main(String[] args) throws Exception {

        String origem = JOptionPane.showInputDialog("Digite a origem: ");
        String destino = JOptionPane.showInputDialog("Digite o destino: ");
        
        String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + origem +"&destinations=" + destino + "&key=AIzaSyDxSPaFPYw4VHoODgbDcoRWjj68zeUkEu8";
        
        Acesso http = new Acesso();
        String json = http.sendGet(url);

        Gson g = new Gson();
        Localization l = new Localization();
        Type modelo = new TypeToken<Localization>() {}.getType();
        
        l = g.fromJson(json, modelo);
        JOptionPane.showMessageDialog(null, "Resultados: \nOrigem: " + l.getOrigin_addresses()[0]
                + "\nDestino: " + l.getDestination_addresses()[0] + "\nDistância: " + l.getRows()[0].getElements()[0].getDistance().getText()
                + "\nDuração da viagem: " + l.getRows()[0].getElements()[0].getDuration().getText());


    }

}
