package com.example.gmzucolo.teste;

import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("smartcities").createEntityManager();
    }
}
