public class Quadrat {
    private double seitenlaenge;

    public Quadrat(double seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    public double getSeitenlaenge() {
        return seitenlaenge;
    }

    public void setSeitenlaenge(double seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    public double berechneFlaeche() {
        return seitenlaenge * seitenlaenge;
    }

    public double berechneUmfang() {
        return seitenlaenge * 4;
    }

    public double berechneDiagonale() {
        return seitenlaenge * Math.sqrt(2);
    }

    public double berechneWinkel() {
        return Math.PI / 4;
    }

    public void print() {
        System.out.println("Quadrat mit Seitenlänge " + seitenlaenge);
        System.out.println("Flaeche: " + berechneFlaeche());
        System.out.println("Umfang: " + berechneUmfang());
        System.out.println("Diagonale: " + berechneDiagonale());
        System.out.println("Winkel: " + berechneWinkel());
    }
    
}
