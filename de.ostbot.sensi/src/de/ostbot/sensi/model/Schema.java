package de.ostbot.sensi.model;

public class Schema {
    
    String sorte, substrat, phase, duenger, milliliter;
    int leistung, woche, luftfeuchtigkeitAmTag, luftfeuchtigkeitInDerNacht;
    double topfgroesse, flaeche, pHWert, literProTag;
    double temperaturAmTag, temperaturInderNacht;
    boolean montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag;
    
    public String getSorte() {
        return sorte;
    }
    public String getSubstrat() {
        return substrat;
    }
    public String getPhase() {
        return phase;
    }
    public String getDuenger() {
        return duenger;
    }
    public String getMilliliter() {
        return milliliter;
    }
    public int getWoche() {
        return woche;
    }
    public double getTopfgroesse() {
        return topfgroesse;
    }
    public int getLeistung() {
        return leistung;
    }
    public double getFlaeche() {
        return flaeche;
    }
    public double getpHWert() {
        return pHWert;
    }
    public double getLiterProTag() {
        return literProTag;
    }
    public double getTemperaturAmTag() {
        return temperaturAmTag;
    }
    public double getTemperaturInderNacht() {
        return temperaturInderNacht;
    }
    public int getLuftfeuchtigkeitAmTag() {
        return luftfeuchtigkeitAmTag;
    }
    public int getLuftfeuchtigkeitInDerNacht() {
        return luftfeuchtigkeitInDerNacht;
    }
    public boolean isMontag() {
        return montag;
    }
    public boolean isDienstag() {
        return dienstag;
    }
    public boolean isMittwoch() {
        return mittwoch;
    }
    public boolean isDonnerstag() {
        return donnerstag;
    }
    public boolean isFreitag() {
        return freitag;
    }
    public boolean isSamstag() {
        return samstag;
    }
    public boolean isSonntag() {
        return sonntag;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }
    public void setSubstrat(String substrat) {
        this.substrat = substrat;
    }
    public void setPhase(String phase) {
        this.phase = phase;
    }
    public void setDuenger(String duenger) {
        this.duenger = duenger;
    }
    public void setMilliliter(String milliliter) {
        this.milliliter = milliliter;
    }
    public void setWoche(int woche) {
        this.woche = woche;
    }
    public void setTopfgroesse(double topfgroesse) {
        this.topfgroesse = topfgroesse;
    }
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }
    public void setpHWert(double pHWert) {
        this.pHWert = pHWert;
    }
    public void setLiterProTag(double literProTag) {
        this.literProTag = literProTag;
    }
    public void setTemperaturAmTag(double temperaturAmTag) {
        this.temperaturAmTag = temperaturAmTag;
    }
    public void setTemperaturInderNacht(double temperaturInderNacht) {
        this.temperaturInderNacht = temperaturInderNacht;
    }
    public void setLuftfeuchtigkeitAmTag(int luftfeuchtigkeitAmTag) {
        this.luftfeuchtigkeitAmTag = luftfeuchtigkeitAmTag;
    }
    public void setLuftfeuchtigkeitInDerNacht(int luftfeuchtigkeitInDerNacht) {
        this.luftfeuchtigkeitInDerNacht = luftfeuchtigkeitInDerNacht;
    }
    public void setMontag(boolean montag) {
        this.montag = montag;
    }
    public void setDienstag(boolean dienstag) {
        this.dienstag = dienstag;
    }
    public void setMittwoch(boolean mittwoch) {
        this.mittwoch = mittwoch;
    }
    public void setDonnerstag(boolean donnerstag) {
        this.donnerstag = donnerstag;
    }
    public void setFreitag(boolean freitag) {
        this.freitag = freitag;
    }
    public void setSamstag(boolean samstag) {
        this.samstag = samstag;
    }
    public void setSonntag(boolean sonntag) {
        this.sonntag = sonntag;
    }

    public Schema(String sorte, String substrat, String phase, String duenger, String milliliter, int woche, double topfgroesse, int leistung, double flaeche, double pHWert, double literProTag, double temperaturAmTag, double temperaturInderNacht, int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht, boolean montag, boolean dienstag, boolean mittwoch, boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        this.sorte = sorte;
        this.substrat = substrat;
        this.phase = phase;
        this.duenger = duenger;
        this.milliliter = milliliter;
        this.woche = woche;
        this.topfgroesse = topfgroesse;
        this.leistung = leistung;
        this.flaeche = flaeche;
        this.pHWert = pHWert;
        this.literProTag = literProTag;
        this.temperaturAmTag = temperaturAmTag;
        this.temperaturInderNacht = temperaturInderNacht;
        this.luftfeuchtigkeitAmTag = luftfeuchtigkeitAmTag;
        this.luftfeuchtigkeitInDerNacht = luftfeuchtigkeitInDerNacht;
        this.montag = montag;
        this.dienstag = dienstag;
        this.mittwoch = mittwoch;
        this.donnerstag = donnerstag;
        this.freitag = freitag;
        this.samstag = samstag;
        this.sonntag = sonntag;
    }
    
    
    
    
    
    
}
