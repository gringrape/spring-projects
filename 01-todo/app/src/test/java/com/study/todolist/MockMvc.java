package com.study.todolist;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class MockMvc {
    private HttpClient client;

    public MockMvc() {
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> get(String path) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
