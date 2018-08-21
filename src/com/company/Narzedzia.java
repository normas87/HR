package com.company;
import java.util.Scanner;
import java.util.UUID;

public interface Narzedzia {

Scanner odczytCyfr = new Scanner(System.in); //pobieranie cyferek z klawiatury
Scanner odczytPodMenu01 = new Scanner(System.in); //pobierania danych z klawiatury

PracownikAdd pracownikAdd = new PracownikAdd(); //inicjalizacja zawartosci klasy PracownikAdd bo tam jest metoda dodająca usera
}
