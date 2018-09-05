package com.company;
import java.util.UUID;

public class Pracownicy {

    private String imie;
    private String nazwisko;
    private UUID uuid = UUID.randomUUID();
    private Stanowisko stanowisko;

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setStanowiska(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Pracownicy(String imie, String nazwisko, UUID uuid, Stanowisko stanowisko) {  //konstruktor pracownika
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.uuid = uuid;
        this.stanowisko=stanowisko;
    }
    public Pracownicy(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    @Override
    public String toString() {
        return " {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", uuid=" + uuid +
                ", stanowisko=" + stanowisko +
                '}';
    }
}



