package com.company;

public class Main {

    public static void main(String[] args) {

        Pracownicy pracownicy = new Pracownicy("","",0);

        System.out.print("Podaj imię: ");
        pracownicy.setImie(OdczytywanieDanych.odczyt.nextLine());

        System.out.print("Podaj nazwisko: ");
        pracownicy.setNazwisko(OdczytywanieDanych.odczyt.nextLine());

        System.out.print("Podaj swoje id: ");
        pracownicy.setUid(OdczytywanieDanych.odczyt.nextInt());

        System.out.println("Cześć " + pracownicy.getImie() +" "+ pracownicy.getNazwisko() +" "+ "Twoje ID: " + pracownicy.getUid());
    }
}