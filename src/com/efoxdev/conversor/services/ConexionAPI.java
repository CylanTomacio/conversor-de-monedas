package com.efoxdev.conversor.services;

import com.efoxdev.conversor.models.Conversor;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {

    public Conversor obtenerDatos(String monedaBase, String monedaSecundaria, double cantidad) {
        final String API_KEY = "ef29840d5ce147c54652bf8b";
        final URI URL_BASE = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaBase + "/" + monedaSecundaria + "/" + cantidad);

        try {
            HttpResponse<String> response;
            try (HttpClient client = HttpClient.newHttpClient()) {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URL_BASE)
                        .build();
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            }
            return new Gson().fromJson( response.body(), Conversor.class );
        } catch (Exception e) {
            throw new RuntimeException("Problemas en la conexión con la API");
        }
    }

}
