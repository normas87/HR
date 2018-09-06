package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Main extends Menu {
    private static PracownikProcessing pracownikProcessing = new PracownikProcessing();

    public static void main(String[] args) {

        boolean exit = false;
        do {
            Pracownicy konstruktorPracownikaProdukcji = new Pracownicy("", "", UUID.randomUUID(), Stanowisko.PRACOWNIK_PRODUKCJI);
            Pracownicy konstruktorPracownikaBiurowego = new Pracownicy("", "", UUID.randomUUID(), Stanowisko.PRACOWNIK_BIUROWY);
            Pracownicy konstruktorPracownikaSekretariatu = new Pracownicy("", "", UUID.randomUUID(), Stanowisko.PRACOWNIK_SEKRETARIATU);
            Pracownicy konstruktorPracownikaKsiegowosci = new Pracownicy("", "", UUID.randomUUID(), Stanowisko.PRACOWNIK_KSIEGOWOSCI);
            Pracownicy konstruktorZastepcyPrezesa = new Pracownicy("", "", UUID.randomUUID(), Stanowisko.ZASTEPCA_PREZESA);
            Pracownicy konstruktorPracownika = new Pracownicy("", "");

            Menu.wyswietlMenuGlowne();
            Scanner odczyt = new Scanner(System.in);
            int wyborMenuGlowne = odczyt.nextInt();
            switch (wyborMenuGlowne) {
                case 1:
                    System.out.println("Wybrano 1 - Dodajemy nowego pracownika");
                    Menu.wyswietlMenuDodawaniaNowegoPracownika();
                    int wyborPodMenu1 = odczyt.nextInt();
                    switch (wyborPodMenu1) {
                        case 1:
                            System.out.println("Pracownik produkcji: ");
                            pracownikProcessing.dodajPracownikaProdukcji(konstruktorPracownikaProdukcji);
                            break;
                        case 2:
                            System.out.println("Pracownik biura: ");
                            pracownikProcessing.dodajPracownikaBiurowego(konstruktorPracownikaBiurowego);
                            break;
                        case 3:
                            System.out.println("Pracownik sekretariatu: ");
                            pracownikProcessing.dodajPracownikaSekretariatu(konstruktorPracownikaSekretariatu);
                            break;
                        case 4:
                            System.out.println("Pracownik Księgowości: ");
                            pracownikProcessing.dodajPracownikaKsiegowosci(konstruktorPracownikaKsiegowosci);
                            break;
                        case 5:
                            System.out.println("Nowy zastępca Prezesa: ");
                            pracownikProcessing.dodajZastepcePrezesa(konstruktorZastepcyPrezesa);
                            break;
                        case 0:
                            System.out.println("Wybrano: Exit");
                            System.exit(0);
                        default:
                            System.out.println("Nieprawidłowa operacja Menu Głównego");
                    }
                    break;
                case 2:
                    System.out.println("Wybrano 2 = Usun pracownika");
                    PracownikProcessing.usunPracownika();
                    break;
                case 3:
                    System.out.println("Wybrano 3 = Wyszukaj pracownika");
                    wyswietlMenuSzukajPracownika();
                    odczyt.nextLine();
                    int wyborMenuSzukaj = odczyt.nextInt();
                    switch (wyborMenuSzukaj) {
                        case 1:
                            System.out.println("Wybrano 1 - szukanie po ID");
                            SzukanieProcessing.znajdzPracownikaPoID();
                            break;
                        case 2:
                            System.out.println("Wybrano 2 - szukanie po imieniu");
                            SzukanieProcessing.znajdzPracownikaPoImieniu();
                            break;
                        case 3:
                            System.out.println("Wybrano 3 - szukanie po nazwisku");
                            break;
                        case 0:
                            System.out.println("Wybrano 0 - wyświetlam poprzednie menu");
                            wyswietlMenuSzukajPracownika();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Wybrano 4 = Wyświetl liste wszystkich pracownikow");
                    PracownikProcessing.wyswietlListePracownikow(konstruktorPracownika);
                    break;
                case 5:
                    System.out.println("Wybrano 5 = Którą liste pracowników wyświetlić?");
                    wyswietlMenuPracownikówDanegoTypu();
                    int wyborOpcji = odczyt.nextInt();
                    switch (wyborOpcji) {
                        case 1:
                            if (PracownikProcessing.listaPracownikowProdukcji.size() >= 1) {
                                System.out.println("=== Lista pracowników produkcji ===");
                                for (Pracownicy x : PracownikProcessing.listaPracownikowProdukcji) {
                                    Pracownicy lista = x;
                                    System.out.println(lista);
                                }break;
                            }
                            System.out.println("=== Lista jest pusta ===");
                            break;
                        case 2:
                            if (PracownikProcessing.listaPracownikowBiura.size() >= 1) {
                                System.out.println("=== Lista pracowników Biura ===");
                                for (Pracownicy x : PracownikProcessing.listaPracownikowBiura) {
                                    Pracownicy lista = x;
                                    System.out.println(x);
                                }break;
                            }
                            System.out.println("=== Lista jest pusta ===");

                            break;
                        case 3:
                            if (PracownikProcessing.listaPracownikowSekretariatu.size() >= 1) {
                                System.out.println("=== Lista pracowników Sekretariatu ===");
                                for (Pracownicy x : PracownikProcessing.listaPracownikowSekretariatu) {
                                    Pracownicy lista = x;
                                    System.out.println(x);
                                }break;
                            }
                            System.out.println("=== Lista jest pusta ===");
                            break;
                        case 4:
                            if (PracownikProcessing.listaPracownikowKsiegowosci.size() >= 1) {
                                System.out.println("=== Lista pracowników Księgowości ===");
                                for (Pracownicy x : PracownikProcessing.listaPracownikowKsiegowosci) {
                                    Pracownicy lista = x;
                                    System.out.println(x);
                                }break;
                            }
                            System.out.println("=== Lista jest pusta ===");
                            break;
                        case 0:
                            System.out.println("Wybrano powrót, wyświetlam główne menu");
                            break;
                    }
            }
        }
        while (exit = true);
    }
}
