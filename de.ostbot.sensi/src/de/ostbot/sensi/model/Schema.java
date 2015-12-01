package de.ostbot.sensi.model;

public class Schema {
    
    String sorte, substrat, phase;
    int leistung, woche, luftfeuchtigkeitAmTag, luftfeuchtigkeitInDerNacht;
    double topfgroesse, beleuchtungsflaeche, pHWert, literProTag, temperaturAmTag, temperaturInderNacht,
           terraVegaMilliliter, terraFloresMilliliter, monoTracemixMilliliter, monoStickstoffMilliliter,
           monoPhosphorMilliliter, monoKaliumMilliliter, monoMagnesiumMilliliter, monoKalziumMilliliter,
           monoEisenMilliliter, startMilliliter, flushMilliliter, acceleratorMilliliter, pkMilliliter,
           rhizotonicMilliliter, cannazymMilliliter;
    boolean montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag;
    
    public Schema(String sorte, String substrat, String phase, 
                  int leistung, int woche, int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht, 
                  double topfgroesse, double beleuchtungsflaeche, double pHWert, double literProTag,
                  double terraVegaMilliliter, double terraFloresMilliliter, double monoTracemixMilliliter, 
                  double monoStickstoffMilliliter, double monoPhosphorMilliliter, double monoKaliumMilliliter, 
                  double monoMagnesiumMilliliter, double monoKalziumMilliliter, double monoEisenMilliliter, 
                  double startMilliliter, double flushMilliliter, double acceleratorMilliliter, double pkMilliliter, 
                  double rhizotonicMilliliter, double cannazymMilliliter, double temperaturAmTag, 
                  double temperaturInderNacht, boolean montag, boolean dienstag, boolean mittwoch, 
                  boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        this.sorte = sorte;
        this.substrat = substrat;
        this.phase = phase;
        this.leistung = leistung;
        this.woche = woche;
        this.luftfeuchtigkeitAmTag = luftfeuchtigkeitAmTag;
        this.luftfeuchtigkeitInDerNacht = luftfeuchtigkeitInDerNacht;
        this.topfgroesse = topfgroesse;
        this.beleuchtungsflaeche = beleuchtungsflaeche;
        this.pHWert = pHWert;
        this.literProTag = literProTag;
        this.terraVegaMilliliter = terraVegaMilliliter;
        this.terraFloresMilliliter = terraFloresMilliliter;
        this.monoTracemixMilliliter = monoTracemixMilliliter;
        this.monoStickstoffMilliliter = monoStickstoffMilliliter;
        this.monoPhosphorMilliliter = monoPhosphorMilliliter;
        this.monoKaliumMilliliter = monoKaliumMilliliter;
        this.monoMagnesiumMilliliter = monoMagnesiumMilliliter;
        this.monoKalziumMilliliter = monoKalziumMilliliter;
        this.monoEisenMilliliter = monoEisenMilliliter;
        this.startMilliliter = startMilliliter;
        this.flushMilliliter = flushMilliliter;
        this.acceleratorMilliliter = acceleratorMilliliter;
        this.pkMilliliter = pkMilliliter;
        this.rhizotonicMilliliter = rhizotonicMilliliter;
        this.cannazymMilliliter = cannazymMilliliter;
        this.temperaturAmTag = temperaturAmTag;
        this.temperaturInderNacht = temperaturInderNacht;
        this.montag = montag;
        this.dienstag = dienstag;
        this.mittwoch = mittwoch;
        this.donnerstag = donnerstag;
        this.freitag = freitag;
        this.samstag = samstag;
        this.sonntag = sonntag;
    }
    
    public String getSorte() {
        return sorte;
    }
    public String getSubstrat() {
        return substrat;
    }
    public String getPhase() {
        return phase;
    }
    public double getTerraVegaMilliliter() {
        return terraVegaMilliliter;
    }
    public double getTerraFloresMilliliter() {
        return terraFloresMilliliter;
    }
    public double getMonoTracemixMilliliter() {
        return monoTracemixMilliliter;
    }
    public double getMonoStickstoffMilliliter() {
        return monoStickstoffMilliliter;
    }
    public double getMonoPhosphorMilliliter() {
        return monoPhosphorMilliliter;
    }
    public double getMonoKaliumMilliliter() {
        return monoKaliumMilliliter;
    }
    public double getMonoMagnesiumMilliliter() {
        return monoMagnesiumMilliliter;
    }
    public double getMonoKalziumMilliliter() {
        return monoKalziumMilliliter;
    }
    public double getMonoEisenMilliliter() {
        return monoEisenMilliliter;
    }
    public double getStartMilliliter() {
        return startMilliliter;
    }
    public double getFlushMilliliter() {
        return flushMilliliter;
    }
    public double getAcceleratorMilliliter() {
        return acceleratorMilliliter;
    }
    public double getPkMilliliter() {
        return pkMilliliter;
    }
    public double getRhizotonicMilliliter() {
        return rhizotonicMilliliter;
    }
    public double getCannazymMilliliter() {
        return cannazymMilliliter;
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
    public double getBeleuchtungsflaeche() {
        return beleuchtungsflaeche;
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
    public void setWoche(int woche) {
        this.woche = woche;
    }
    public void setTopfgroesse(double topfgroesse) {
        this.topfgroesse = topfgroesse;
    }
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
    public void setFlaeche(double beleuchtungsflaeche) {
        this.beleuchtungsflaeche = beleuchtungsflaeche;
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
    public void setBeleuchtungsflaeche(double beleuchtungsflaeche) {
        this.beleuchtungsflaeche = beleuchtungsflaeche;
    }
    public void setTerraVegaMilliliter(double terraVegaMilliliter) {
        this.terraVegaMilliliter = terraVegaMilliliter;
    }
    public void setTerraFloresMilliliter(double terraFloresMilliliter) {
        this.terraFloresMilliliter = terraFloresMilliliter;
    }
    public void setMonoTracemixMilliliter(double monoTracemixMilliliter) {
        this.monoTracemixMilliliter = monoTracemixMilliliter;
    }
    public void setMonoStickstoffMilliliter(double monoStickstoffMilliliter) {
        this.monoStickstoffMilliliter = monoStickstoffMilliliter;
    }
    public void setMonoPhosphorMilliliter(double monoPhosphorMilliliter) {
        this.monoPhosphorMilliliter = monoPhosphorMilliliter;
    }
    public void setMonoKaliumMilliliter(double monoKaliumMilliliter) {
        this.monoKaliumMilliliter = monoKaliumMilliliter;
    }
    public void setMonoMagnesiumMilliliter(double monoMagnesiumMilliliter) {
        this.monoMagnesiumMilliliter = monoMagnesiumMilliliter;
    }
    public void setMonoKalziumMilliliter(double monoKalziumMilliliter) {
        this.monoKalziumMilliliter = monoKalziumMilliliter;
    }
    public void setMonoEisenMilliliter(double monoEisenMilliliter) {
        this.monoEisenMilliliter = monoEisenMilliliter;
    }
    public void setStartMilliliter(double startMilliliter) {
        this.startMilliliter = startMilliliter;
    }
    public void setFlushMilliliter(double flushMilliliter) {
        this.flushMilliliter = flushMilliliter;
    }
    public void setAcceleratorMilliliter(double acceleratorMilliliter) {
        this.acceleratorMilliliter = acceleratorMilliliter;
    }
    public void setPkMilliliter(double pkMilliliter) {
        this.pkMilliliter = pkMilliliter;
    }
    public void setRhizotonicMilliliter(double rhizotonicMilliliter) {
        this.rhizotonicMilliliter = rhizotonicMilliliter;
    }
    public void setCannazymMilliliter(double cannazymMilliliter) {
        this.cannazymMilliliter = cannazymMilliliter;
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
}