/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.study.todolist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @BeforeAll
    static void setUp() throws IOException {
        App.startServer();
    }

    @Test
    void testHelloWorld() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(response.statusCode(), 200);
        assertEquals(response.body(), "Hello, world!");
    }

    @Test
    void testGetTodos() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/tasks"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(response.statusCode(), 200);
        assertEquals(
                response.body(),
                "[{\"id\":1,\"title\":\"밥 먹기\",\"completed\":false,\"date\":\"2021/09/04\"}]"
        );
    }
}
