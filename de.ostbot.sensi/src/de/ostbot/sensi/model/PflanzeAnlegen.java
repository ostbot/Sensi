package de.ostbot.sensi.model;

public class PflanzeAnlegen {
    
    String sorte, herkunftsland, substrat;
    int indica, sativa;
    double topfgroesse;

    //Setter-Sorte
    public String getSorte() {
        return sorte;
    }

    //Setter-Herkunftsland
    public String getHerkunftsland() {
        return herkunftsland;
    }
    
    //Setter-Substrat
    public String getSubstrat() {
        return substrat;
    }

    //Setter-Indica
    public int getIndica() {
        return indica;
    }

    //Setter-Sativa
    public int getSativa() {
        return sativa;
    }

    //Getter-Topf
    public double getTopfgroesse() {
        return topfgroesse;
    }

    //Getter-Sorte
    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    //Getter-Herkunftsland
    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    //Getter-Substrat
    public void setSubstrat(String substrat) {
        this.substrat = substrat;
    }

    //Getter-Indica
    public void setIndica(int indica) {
        this.indica = indica;
    }

    //Getter-Sativa
    public void setSativa(int sativa) {
        this.sativa = sativa;
    }

    //Getter-Topfgroesse
    public void setTopfgroesse(double topfgroesse) {
        this.topfgroesse = topfgroesse;
    }

    //Konstruktor-PflanzeAnlegen
    public PflanzeAnlegen(String sorte, String herkunftsland, String substrat, int indica, int sativa, double topfgroesse) {
        this.sorte = sorte;
        this.herkunftsland = herkunftsland;
        this.substrat = substrat;
        this.indica = indica;
        this.sativa = sativa;
        this.topfgroesse = topfgroesse;
    }
}