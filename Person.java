public class Person {
    private String name;
    private String adresse;
    private String telefonnummer;
    private String email;
    private String geburtsdatum;
    private String geschlecht;
    private String beschreibung;   

    public Person() {
        this.name = "";
        this.adresse = "";
        this.telefonnummer = "";
        this.email = "";
        this.geburtsdatum = "";
        this.geschlecht = "";
        this.beschreibung = "";
    }

    public Person(String name, String adresse) {
            this.name = name;
            this.adresse = adresse;
    }

    public Person(String name, String adresse, String telefonnummer) {  
            this.name = name;
            this.adresse = adresse;
                    this.telefonnummer = telefonnummer;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public void setGeburtsdatum(String geburtsdatum) {
            this.geburtsdatum = geburtsdatum;
    }
    public void setGeschlecht(String geschlecht) {
            this.geschlecht = geschlecht;
    }
    public void setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
    }
    public String getName() {
        return this.name;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public String getTelefonnummer() {
        return this.telefonnummer;
    }
    public String getEmail() {
        return this.email;
    }
    public String getGeburtsdatum() {
        return this.geburtsdatum;
    }
    public String getGeschlecht() {
        return this.geschlecht;
    }
    public String getBeschreibung() {
        return this.beschreibung;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", email='" + email + '\'' +
                ", geburtsdatum='" + geburtsdatum + '\'' +
                ", geschlecht='" + geschlecht + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}