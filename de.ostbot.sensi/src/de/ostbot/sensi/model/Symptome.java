package de.ostbot.sensi.model;

public class Symptome {
    
    boolean unterwaessert, ueberwaessert, waermeSymptome, kaelteSymptome;

    public Symptome(boolean unterwaessert, boolean ueberwaessert, boolean waermeSymptome, boolean kaelteSymptome) {
        this.unterwaessert = unterwaessert;
        this.ueberwaessert = ueberwaessert;
        this.waermeSymptome = waermeSymptome;
        this.kaelteSymptome = kaelteSymptome;
    }

    public boolean isUnterwaessert() {
        return unterwaessert;
    }
    public boolean isUeberwaessert() {
        return ueberwaessert;
    }
    public boolean isWaermeSymptome() {
        return waermeSymptome;
    }
    public boolean isKaelteSymptome() {
        return kaelteSymptome;
    }

    public void setUnterwaessert(boolean unterwaessert) {
        this.unterwaessert = unterwaessert;
    }
    public void setUeberwaessert(boolean ueberwaessert) {
        this.ueberwaessert = ueberwaessert;
    }
    public void setWaermeSymptome(boolean waermeSymptome) {
        this.waermeSymptome = waermeSymptome;
    }
    public void setKaelteSymptome(boolean kaelteSymptome) {
        this.kaelteSymptome = kaelteSymptome;
    }
}
