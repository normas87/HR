package com.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.UUID;

public class Main extends Menu implements Narzedzia {
    public static void main(String[] args) {
        Pracownicy pracownicy =new Pracownicy("","",UUID.randomUUID());

        boolean exit = false;
        do {
            Menu.wyswietlMenuGlowne();

            int wyborMenu = Narzedzia.odczytCyfr.nextInt();
            switch (wyborMenu) {
                case 1:
                    System.out.println("Wybrano 1 - Dodaj nowego pracownika");
                    Menu.wyswietlPodMenu1();
                    Narzedzia.odczytCyfr.nextInt();

                    System.out.println("Podaj imię nowego pracownika: ");
                    pracownicy.setImie(Narzedzia.odczytPodMenu01.nextLine());
                    //pracownik.setImie(Narzedzia.odczytPodMenu01.nextLine());

                    System.out.println("Podaj jego nazwisko: ");
                    pracownicy.setNazwisko(Narzedzia.odczytPodMenu01.nextLine());
                 //   pracownik.setNazwisko(Narzedzia.odczytPodMenu01.nextLine());

                 //  System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getUuid().toString());
                    System.out.println(pracownicy.getImie()+ " "+ pracownicy.getNazwisko() + " "+pracownicy.getUuid().toString());
                    pracownikAdd.dodajPracownika(pracownicy);

                    switch (wyborMenu) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            System.out.println("Wybrano: Exit");
                            System.exit(0);
                        default:
                            System.out.println("Nieprawidłowa operacja podmenu1");
                    }
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
                    PracownikAdd.wyswietlListePracownikow(pracownicy);
                    break;
                case 5:
                    System.out.println("Wybrano 5");
                    break;
                case 0:
                    System.out.println("Wybrano EXIT");
                    System.exit(0);
                default:
                    System.out.println("Wybrano nieprawidłową wartość");
            }
            Menu.wyswietlMenuGlowne();
        } while (exit = true);
    }
}