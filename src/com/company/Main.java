package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Pracownicy pracownicy = new Pracownicy("","",UUID.randomUUID());

        System.out.print("Podaj imię: ");
        pracownicy.setImie(OdczytywanieDanych.odczyt.nextLine());

        System.out.print("Podaj nazwisko: ");
        pracownicy.setNazwisko(OdczytywanieDanych.odczyt.nextLine());

        System.out.println(pracownicy.getImie()+" "+ pracownicy.getNazwisko()+" "+ pracownicy.getUuid().toString());
    }
}