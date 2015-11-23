package de.ostbot.sensi.model;

public class Pflanze {

    String sorte, herkunftsland, substrat;
    int indica, sativa;
    double topfgroesse;

    //Getter-Sorte
    public String getSorte() {
        return sorte;
    }

    //Getter-Herkunftsland
    public String getHerkunftsland() {
        return herkunftsland;
    }

    //Getter-Substrat
    public String getSubstrat() {
        return substrat;
    }

    //Getter-Indica
    public int getIndica() {
        return indica;
    }

    //Getter-Sativa
    public int getSativa() {
        return sativa;
    }

    //Getter-Topf
    public double getTopfgroesse() {
        return topfgroesse;
    }

    //Setter-Sorte
    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    //Setter-Herkunftsland
    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    //Setter-Substrat
    public void setSubstrat(String substrat) {
        this.substrat = substrat;
    }

    //Setter-Indica
    public void setIndica(int indica) {
        this.indica = indica;
    }

    //Setter-Sativa
    public void setSativa(int sativa) {
        this.sativa = sativa;
    }

    //Setter-Topfgroesse
    public void setTopfgroesse(double topfgroesse) {
        this.topfgroesse = topfgroesse;
    }

    //Konstruktor-Pflanze
    public Pflanze(String sorte, String herkunftsland, int indica, int sativa, String substrat, double topfgroesse) {
        this.sorte = sorte;
        this.herkunftsland = herkunftsland;
        this.substrat = substrat;
        this.indica = indica;
        this.sativa = sativa;
        this.topfgroesse = topfgroesse;
    }
}