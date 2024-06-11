public class Mitarbeiter extends Person {

    private String arbeitsvertrag;
    private String arbeitsbeginn;
    private String arbeitsende;
    private Unternehmen unternehmen;

    public Mitarbeiter() {
        super();
        this.arbeitsvertrag = "";
        this.arbeitsbeginn = "";
        this.arbeitsende = "";
    }
    
    public Mitarbeiter(String name, String adresse) {
        super(name, adresse);
        this.arbeitsvertrag = "";
        this.arbeitsbeginn = "";
        this.arbeitsende = "";
    }

    public String getArbeitsvertrag() {
        return arbeitsvertrag;
    }
    public String getArbeitsbeginn() {
        return arbeitsbeginn;
    }
    public String getArbeitsende() {
        return arbeitsende;
    }
    public Unternehmen getUnternehmen() {
        return unternehmen;
    }
    public void setArbeitsvertrag(String arbeitsvertrag) {
            this.arbeitsvertrag = arbeitsvertrag;
    }
    public void setArbeitsbeginn(String arbeitsbeginn) {
            this.arbeitsbeginn = arbeitsbeginn;
    }
    public void setArbeitsende(String arbeitsende) {
            this.arbeitsende = arbeitsende;
    }
    public void setUnternehmen(Unternehmen unternehmen) {
            this.unternehmen = unternehmen;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "arbeitsvertrag='" + arbeitsvertrag + '\'' +
                ", arbeitsbeginn='" + arbeitsbeginn + '\'' +
                ", arbeitsende='" + arbeitsende + '\'' +
                ", unternehmen=" + unternehmen +
                '}';
    }

}