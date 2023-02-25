package com.example.gmzucolo.teste;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("Smartcities").createEntityManager();
    }
}
