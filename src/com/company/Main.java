package com.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.UUID;

public class Main extends Menu implements Narzedzia {
    public static void main(String[] args) {


        Menu.wyswietlMenuGlowne();
        int wyborMenu =Narzedzia.odczytCyfr.nextInt();
        switch(wyborMenu){
            case 1:
                System.out.println("Liczba to 1");
                break;
            case 2:
                System.out.println("Liczba to 2");
                break;
            default:
                System.out.println("Liczba to ani 1, ani 2");
        }
    }



























        Menu.wyswietlMenuGlowne();

        Scanner odczytMenuGlowne = new Scanner(System.in);

        int wyborMenu;
        do {
            System.out.print("Wpisz z klawiatury co robimy i zatwierdź enterem: ");
            Narzedzia.odczytajCyfreZKlawiatury();
            switch (wyborMenu) {
                case 1:
                    System.out.println("Wybrano 1 Dodajemy nowego pracownika...");

                    Menu.wyswietlPodMenu1();
                    Narzedzia.odczytajCyfreZKlawiatury();

                    switch (wyborMenu) {
                        case 1:
                            System.out.println("wybrano 1 Pracownik Produkcji");
                            break;
                        case 2:
                            System.out.println("2 Pracownik Biurowy");
                            break;
                        case 3:
                            System.out.println("3 Pracownik księgowości");
                            break;
                        case 4:
                            System.out.println("4 Pracownik księgowości");
                            break;
                        case 5:
                            System.out.println("5 Pracownik sekretariatu");
                            break;
                        case 6:
                            System.out.println("5 Zastępca Prezesa");
                            break;
                        case 7:
                            System.out.println("5 Pracownik sekretariatu");
                            break;
                    }

            }

            System.out.println("Wybrano: Exit");

            System.out.print("Podaj imię nowego pracownika: ");
            pracownik.setImie(odczytMenuGlowne.nextLine());

            System.out.print("Podaj jego nazwisko: ");
            pracownik.setNazwisko(odczytMenuGlowne.nextLine());

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
    }
}