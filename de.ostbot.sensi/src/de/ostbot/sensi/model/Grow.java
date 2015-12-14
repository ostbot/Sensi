package de.ostbot.sensi.model;

public class Grow {
    
    boolean unterwaessert, ueberwaessert, waermeSymptome, kaelteSymptome;
    int statusID, umgebungID, makroelementID, mikroelementID;

    public Grow(boolean unterwaessert, boolean ueberwaessert, boolean waermeSymptome, boolean kaelteSymptome, int statusID, int umgebungID, int makroelementID, int mikroelementID) {
        this.unterwaessert = unterwaessert;
        this.ueberwaessert = ueberwaessert;
        this.waermeSymptome = waermeSymptome;
        this.kaelteSymptome = kaelteSymptome;
        this.statusID = statusID;
        this.umgebungID = umgebungID;
        this.makroelementID = makroelementID;
        this.mikroelementID = mikroelementID;
        this.timestamp = timestamp;
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
    public int getStatusID() {
        return statusID;
    }
    public int getUmgebungID() {
        return umgebungID;
    }
    public int getMakroelementID() {
        return makroelementID;
    }
    public int getMikroelementID() {
        return mikroelementID;
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
    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }
    public void setUmgebungID(int umgebungID) {
        this.umgebungID = umgebungID;
    }
    public void setMakroelementID(int makroelementID) {
        this.makroelementID = makroelementID;
    }
    public void setMikroelementID(int mikroelementID) {
        this.mikroelementID = mikroelementID;
    }
}