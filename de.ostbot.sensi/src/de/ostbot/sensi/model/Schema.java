package de.ostbot.sensi.model;

public class Schema {
    
    String sorte, substrat, phase;
    int leistung, woche, luftfeuchtigkeitAmTag, luftfeuchtigkeitInDerNacht;
    double topfgroesse, beleuchtungsflaeche, pHWert, literProTag;
    double terraVega_ml_woche, terra_flores_ml_woche, mono_tracemix_ml_woche, mono_stickstoff_ml_woche,
           mono_phosphor_ml_woche, mono_kalium_ml_woche, mono_magnesium_ml_woche, mono_kalizum_ml_woche,
           mono_eisen_ml_woche, start_ml_woche, flush_ml_woche, accelerator_ml_woche, pk_ml_woche,
           rhizotonic_ml_woche, cannazym_ml_woche;
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
    public double getTerraVega_ml_woche() {
        return terraVega_ml_woche;
    }
    public double getTerra_flores_ml_woche() {
        return terra_flores_ml_woche;
    }
    public double getMono_tracemix_ml_woche() {
        return mono_tracemix_ml_woche;
    }
    public double getMono_stickstoff_ml_woche() {
        return mono_stickstoff_ml_woche;
    }
    public double getMono_phosphor_ml_woche() {
        return mono_phosphor_ml_woche;
    }
    public double getMono_kalium_ml_woche() {
        return mono_kalium_ml_woche;
    }
    public double getMono_magnesium_ml_woche() {
        return mono_magnesium_ml_woche;
    }
    public double getMono_kalizum_ml_woche() {
        return mono_kalizum_ml_woche;
    }
    public double getMono_eisen_ml_woche() {
        return mono_eisen_ml_woche;
    }
    public double getStart_ml_woche() {
        return start_ml_woche;
    }
    public double getFlush_ml_woche() {
        return flush_ml_woche;
    }
    public double getAccelerator_ml_woche() {
        return accelerator_ml_woche;
    }
    public double getPk_ml_woche() {
        return pk_ml_woche;
    }
    public double getRhizotonic_ml_woche() {
        return rhizotonic_ml_woche;
    }
    public double getCannazym_ml_woche() {
        return cannazym_ml_woche;
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
    public void setTerraVega_ml_woche(double terraVega_ml_woche) {
        this.terraVega_ml_woche = terraVega_ml_woche;
    }
    public void setTerra_flores_ml_woche(double terra_flores_ml_woche) {
        this.terra_flores_ml_woche = terra_flores_ml_woche;
    }
    public void setMono_tracemix_ml_woche(double mono_tracemix_ml_woche) {
        this.mono_tracemix_ml_woche = mono_tracemix_ml_woche;
    }
    public void setMono_stickstoff_ml_woche(double mono_stickstoff_ml_woche) {
        this.mono_stickstoff_ml_woche = mono_stickstoff_ml_woche;
    }
    public void setMono_phosphor_ml_woche(double mono_phosphor_ml_woche) {
        this.mono_phosphor_ml_woche = mono_phosphor_ml_woche;
    }
    public void setMono_kalium_ml_woche(double mono_kalium_ml_woche) {
        this.mono_kalium_ml_woche = mono_kalium_ml_woche;
    }
    public void setMono_magnesium_ml_woche(double mono_magnesium_ml_woche) {
        this.mono_magnesium_ml_woche = mono_magnesium_ml_woche;
    }
    public void setMono_kalizum_ml_woche(double mono_kalizum_ml_woche) {
        this.mono_kalizum_ml_woche = mono_kalizum_ml_woche;
    }
    public void setMono_eisen_ml_woche(double mono_eisen_ml_woche) {
        this.mono_eisen_ml_woche = mono_eisen_ml_woche;
    }
    public void setStart_ml_woche(double start_ml_woche) {
        this.start_ml_woche = start_ml_woche;
    }
    public void setFlush_ml_woche(double flush_ml_woche) {
        this.flush_ml_woche = flush_ml_woche;
    }
    public void setAccelerator_ml_woche(double accelerator_ml_woche) {
        this.accelerator_ml_woche = accelerator_ml_woche;
    }
    public void setPk_ml_woche(double pk_ml_woche) {
        this.pk_ml_woche = pk_ml_woche;
    }
    public void setRhizotonic_ml_woche(double rhizotonic_ml_woche) {
        this.rhizotonic_ml_woche = rhizotonic_ml_woche;
    }
    public void setCannazym_ml_woche(double cannazym_ml_woche) {
        this.cannazym_ml_woche = cannazym_ml_woche;
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

    public Schema(String sorte, String substrat, String phase, 
                  int leistung, int woche, int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht, 
                  double topfgroesse, double beleuchtungsflaeche, double pHWert, double literProTag,
                  double terraVega_ml_woche, double terra_flores_ml_woche, double mono_tracemix_ml_woche, 
                  double mono_stickstoff_ml_woche, double mono_phosphor_ml_woche, double mono_kalium_ml_woche, 
                  double mono_magnesium_ml_woche, double mono_kalizum_ml_woche, double mono_eisen_ml_woche, 
                  double start_ml_woche, double flush_ml_woche, double accelerator_ml_woche, double pk_ml_woche, 
                  double rhizotonic_ml_woche, double cannazym_ml_woche, double temperaturAmTag, 
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
        this.terraVega_ml_woche = terraVega_ml_woche;
        this.terra_flores_ml_woche = terra_flores_ml_woche;
        this.mono_tracemix_ml_woche = mono_tracemix_ml_woche;
        this.mono_stickstoff_ml_woche = mono_stickstoff_ml_woche;
        this.mono_phosphor_ml_woche = mono_phosphor_ml_woche;
        this.mono_kalium_ml_woche = mono_kalium_ml_woche;
        this.mono_magnesium_ml_woche = mono_magnesium_ml_woche;
        this.mono_kalizum_ml_woche = mono_kalizum_ml_woche;
        this.mono_eisen_ml_woche = mono_eisen_ml_woche;
        this.start_ml_woche = start_ml_woche;
        this.flush_ml_woche = flush_ml_woche;
        this.accelerator_ml_woche = accelerator_ml_woche;
        this.pk_ml_woche = pk_ml_woche;
        this.rhizotonic_ml_woche = rhizotonic_ml_woche;
        this.cannazym_ml_woche = cannazym_ml_woche;
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
}