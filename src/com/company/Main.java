package com.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.UUID;

public class Main extends Menu implements Narzedzia {
    private static PracownikAdd pracownikAdd = new PracownikAdd();


    public static void main(String[] args) {



        boolean exit = false;
        do {
            Pracownicy konstruktorPracownika =new Pracownicy("","",UUID.randomUUID());
            Menu.wyswietlMenuGlowne();

            int wyborMenu = odczyt.nextInt();
            switch (wyborMenu) {
                case 1:
                    System.out.println("Wybrano 1 - Dodajemy nowego pracownika");
                    Menu.wyswietlPodMenu1();
                    int wyborPodMenu = odczyt.nextInt();
                    switch (wyborPodMenu) {
                        case 1:
                            System.out.println("Pracownik produkcji: ");
                            pracownikAdd.dodajPracownikaProdukcji(konstruktorPracownika);
                            break;
                        case 2:
                            System.out.println("Pracownik biura: ");
                            pracownikAdd.dodajPracownikaBiurowego(konstruktorPracownika);
                            break;
                        case 3:
                            System.out.println("Pracownik sekretariatu: ");
                            pracownikAdd.dodajPracownikaSekretariatu(konstruktorPracownika);
                            break;
                        case 4:
                            System.out.println("Pracownik Księgowości: " );
                            pracownikAdd.dodajPracownikaKsiegowosci(konstruktorPracownika);
                            break;
                        case 5:
                            System.out.println("Nowy zastępca Prezesa: ");
                            pracownikAdd.dodajZastepcePrezesa(konstruktorPracownika);
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
                    PracownikAdd.wyswietlListePracownikow(konstruktorPracownika);

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
        } while (exit = true);
    }
}