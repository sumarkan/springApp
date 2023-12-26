package com.example.SpringDemo.learning;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    public static void main(String[] args) {
        try {
            // Create an HttpClient instance
            HttpClient client = HttpClient.newHttpClient();

            // Create an HttpRequest instance
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.github.com/"))
                    .GET() // default method, can be omitted
                    .build();

            // Send the request and retrieve the response
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            // Print the response status and body
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
