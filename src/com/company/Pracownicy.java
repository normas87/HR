package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Pracownicy {

    private String imie;
    private String nazwisko;
    private UUID uuid = UUID.randomUUID();

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

    public Pracownicy(String imie, String nazwisko, UUID uuid) {  //konstruktor pracownika
        this.imie = getImie();
        this.nazwisko = getNazwisko();
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}



