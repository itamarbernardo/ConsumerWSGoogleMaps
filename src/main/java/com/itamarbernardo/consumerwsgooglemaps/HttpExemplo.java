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
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpExemplo {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        HttpExemplo http = new HttpExemplo();
        String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Seattle&destinations=San+Francisco&key=AIzaSyDxSPaFPYw4VHoODgbDcoRWjj68zeUkEu8";
        String urllocal = "http://192.168.0.104:8084/VideoAulaWebServices/webresources/aulaws/usuario/get";

        String my = "http://192.168.0.104:8084/TestHome/webresources//sensor?sensorId==1";
        System.out.println("Testing 1 - Send Http GET request");
        String json = http.sendGet(url);

        System.out.println(json);

        Gson g = new Gson();
        Localization l = new Localization();
        java.lang.reflect.Type localiza = new TypeToken<Localization>() {}.getType();
        
        l = g.fromJson(json, localiza);
        System.out.println("Status :" + l.getStatus());
        System.out.println("Destination :" + l.getDestination_addresses());

//        System.out.println("Usuario:" + u.getLogin());
    }

    // HTTP GET request
    private String sendGet(String url) throws Exception {

        //String url = "http://www.nanonull.com/TimeService/TimeService.asmx?op=getUTCTime";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return response.toString();

    }

}
