package de.ostbot.sensi.model;

public class Makroelemente {
    
    int nMangel, pMangel, kMangel, sMangel, caMangel, mgMangel;

    public Makroelemente(int nMangel, int pMangel, int kMangel, int sMangel, int caMangel, int mgMangel) {
        this.nMangel = nMangel;
        this.pMangel = pMangel;
        this.kMangel = kMangel;
        this.sMangel = sMangel;
        this.caMangel = caMangel;
        this.mgMangel = mgMangel;
    }

    public int getNMangel() {
        return nMangel;
    }
    public int getPMangel() {
        return pMangel;
    }
    public int getKMangel() {
        return kMangel;
    }
    public int getSMangel() {
        return sMangel;
    }
    public int getCaMangel() {
        return caMangel;
    }
    public int getMgMangel() {
        return mgMangel;
    }

    public void setNMangel(int nMangel) {
        this.nMangel = nMangel;
    }
    public void setPMangel(int pMangel) {
        this.pMangel = pMangel;
    }
    public void setKMangel(int kMangel) {
        this.kMangel = kMangel;
    }
    public void setSMangel(int sMangel) {
        this.sMangel = sMangel;
    }
    public void setCaMangel(int caMangel) {
        this.caMangel = caMangel;
    }
    public void setMgMangel(int mgMangel) {
        this.mgMangel = mgMangel;
    }
}
