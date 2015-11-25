package de.ostbot.sensi.model;

public class SorteMitTopf {

    String sorte, herkunftsland, substrat;
    int indica, sativa;
    double topfgroesse;

    public String getSorte() {
        return sorte;
    }
    public String getHerkunftsland() {
        return herkunftsland;
    }
    public String getSubstrat() {
        return substrat;
    }
    public int getIndica() {
        return indica;
    }
    public int getSativa() {
        return sativa;
    }
    public double getTopfgroesse() {
        return topfgroesse;
    }
    
    public void setSorte(String sorte) {
        this.sorte = sorte;
    }
    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }
    public void setSubstrat(String substrat) {
        this.substrat = substrat;
    }
    public void setIndica(int indica) {
        this.indica = indica;
    }
    public void setSativa(int sativa) {
        this.sativa = sativa;
    }
    public void setTopfgroesse(double topfgroesse) {
        this.topfgroesse = topfgroesse;
    }
    
    public SorteMitTopf(String sorte, String herkunftsland, int indica, int sativa, String substrat, double topfgroesse) {
        this.sorte = sorte;
        this.herkunftsland = herkunftsland;
        this.substrat = substrat;
        this.indica = indica;
        this.sativa = sativa;
        this.topfgroesse = topfgroesse;
    }
}