package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Main extends Menu {
    private static PracownikProcessing pracownikProcessing = new PracownikProcessing();


    public static void main(String[] args) {


        boolean exit = false;
        do {
            Pracownicy konstruktorPracownika = new Pracownicy("", "", UUID.randomUUID());

           Menu.wyswietlMenuGlowne();
            Scanner odczyt = new Scanner(System.in);
            int wyborMenuGlowne = odczyt.nextInt();
            switch (wyborMenuGlowne) {
                case 1:
                    System.out.println("Wybrano 1 - Dodajemy nowego pracownika");
                    Menu.wyswietlPodMenu1();
                    int wyborPodMenu1 = odczyt.nextInt();
                    switch (wyborPodMenu1) {
                        case 1:
                            System.out.println("Pracownik produkcji: ");
                            pracownikProcessing.dodajPracownikaProdukcji(konstruktorPracownika);
                            break;
                        case 2:
                            System.out.println("Pracownik biura: ");
                            pracownikProcessing.dodajPracownikaBiurowego(konstruktorPracownika);
                            break;
                        case 3:
                            System.out.println("Pracownik sekretariatu: ");
                            pracownikProcessing.dodajPracownikaSekretariatu(konstruktorPracownika);
                            break;
                        case 4:
                            System.out.println("Pracownik Księgowości: ");
                            pracownikProcessing.dodajPracownikaKsiegowosci(konstruktorPracownika);
                            break;
                        case 5:
                            System.out.println("Nowy zastępca Prezesa: ");
                            pracownikProcessing.dodajZastepcePrezesa(konstruktorPracownika);
                            break;
                        case 0:
                            System.out.println("Wybrano: Exit");
                            System.exit(0);
                        default:
                            System.out.println("Nieprawidłowa operacja podmenu1");
                    }
                    break;
                case 2:
                    System.out.println("Wybrano 2 = Usun pracownika");
                    PracownikProcessing.usunPracownika();
                    break;
                case 3:
                    System.out.println("Wybrano 3 = Wyszukaj pracownika");
                    Menu.wyswietlPodMenu3();
                    odczyt.nextLine();
                    int wyborPodMenu3 = odczyt.nextInt();
                    switch (wyborPodMenu3) {
                        case 1:
                            SzukanieProcessing.znajdzPracownikaProdukcji();
                            break;
                        case 0:
                            System.out.println("Wybrano EXIT");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Wybrano nieprawidłową wartość");
                    } break;
                case 4:
                    System.out.println("4 = Wyświetl liste wszystkich pracownikow");
                    PracownikProcessing.wyswietlListePracownikow(konstruktorPracownika);
                    break;
            }
        } while (exit = true);
    }
}