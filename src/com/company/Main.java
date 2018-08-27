package com.company;

import java.util.UUID;

public class Main extends Menu implements Narzedzia {
    private static PracownikProcesing pracownikProcesing = new PracownikProcesing();


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
                            pracownikProcesing.dodajPracownikaProdukcji(konstruktorPracownika);
                            break;
                        case 2:
                            System.out.println("Pracownik biura: ");
                      pracownikProcesing.dodajPracownikaBiurowego(konstruktorPracownika);
                            break;
                        case 3:
                            System.out.println("Pracownik sekretariatu: ");
                            pracownikProcesing.dodajPracownikaSekretariatu(konstruktorPracownika);
                            break;
                        case 4:
                            System.out.println("Pracownik Księgowości: " );
                            pracownikProcesing.dodajPracownikaKsiegowosci(konstruktorPracownika);
                            break;
                        case 5:
                            System.out.println("Nowy zastępca Prezesa: ");
                            pracownikProcesing.dodajZastepcePrezesa(konstruktorPracownika);
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
                    PracownikProcesing.usunPracownika();
                    break;
                case 3:
                    System.out.println("Wybrano 3");
                    break;
                case 4:
                    System.out.println("Wybrano 4   Wyświetlam liste wszystkich pracownikow...");
                    PracownikProcesing.wyswietlListePracownikow(konstruktorPracownika);

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