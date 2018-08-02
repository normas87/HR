package com.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.UUID;

public class Main implements Narzedzia {
    public static void main(String[] args) {

        System.out.println("Witamy w bardzo prestiżowym i drogim programie do zarządzania kapitalem ludzkim w Twojej firmie");
        System.out.println("Menu: ");
        System.out.println("1 = Dodaj nowego pracownika");
        System.out.println("2 = Usun pracownika");
        System.out.println("3 = Wyszukaj pracownika po ID");
        System.out.println("4 = Wyświetl liste wszystkich pracownikow");
        System.out.println("5 = Wyświetl pracowników tylko danego typu");
        System.out.println("0 = Exit");

        Scanner odczyt = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
            System.out.print("");
        boolean exit = false;
        int wyborMenu;
        do {
            System.out.print("Wpisz z klawiatury co robimy i zatwierdź enterem: ");
            wyborMenu = odczyt.nextInt();
            switch (wyborMenu) {
                case 1:
                    System.out.println("Wybrano 1   Dodajemy nowego pracownika...");

                    System.out.print("Podaj imię nowego pracownika: ");
                    pracownik.setImie(Narzedzia.odczyt.nextLine());

                    System.out.print("Podaj jego nazwisko: ");
                    pracownik.setNazwisko(Narzedzia.odczyt.nextLine());

                    System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getUuid().toString());

                    pracownikAdd.dodajPracownika(pracownik);

                    break;
                case 2:
                    System.out.println("Wybrano 2");
                    break;

                case 3:
                    System.out.println("Wybrano 3");
                    break;

                case 4:
                    System.out.println("Wybrano 4   Wyświetlam liste wszystkich pracownikow...");
                    System.out.println("Ilość pracowników: " + pracownikAdd.listaPracownikow.size());
                    break;

                case 5:
                    System.out.println("Wybrano 5");
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Spalisz komputer jak będziesz tak źle klikał, error.");
                    System.out.println("Wybież cyfre z dostępnych w menu, czyli od 0 do 5");
            }

        } while (!exit);
        System.out.println("Wybrano: Exit");
    }
}