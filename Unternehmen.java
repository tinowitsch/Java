import java.util.ArrayList;
import java.util.List;

public class Unternehmen { 

    private String name;
    private String adresse;
    private String telefonnummer;
    private String email;
    private String website;
    private String umsatzsteuerID;
    private String handelsregister;
    private String beschreibung;
    private String geschaeftsfuehrer;
    private List<Mitarbeiter> mitarbeiter;

    public Unternehmen() {
        this.name = "";
        this.adresse = "";
        this.telefonnummer = "";
        this.email = "";
        this.website = "";
        this.umsatzsteuerID = "";
        this.handelsregister = "";
        this.beschreibung = "";
        this.geschaeftsfuehrer = "";
        this.mitarbeiter = new ArrayList<>();
    }

    public Unternehmen(String name, String adresse) {
        if (name.isEmpty() || adresse.isEmpty()) {
            throw new IllegalArgumentException("Alle Felder müssen ausgefüllt sein!");
        } else {
            this.name = name;
            this.adresse = adresse;
        }
        this.mitarbeiter = new ArrayList<>();
    }

    public Unternehmen(String name, String adresse, String telefonnummer) {
        if (name.isEmpty() || adresse.isEmpty() || telefonnummer.isEmpty()) {
            throw new IllegalArgumentException("Alle Felder müssen ausgefüllt sein!");
        } else {
            this.name = name;
            this.adresse = adresse;
            if (telefonnummer.length() != 11) {
                throw new IllegalArgumentException("Die Telefonnummer ist nicht gültig!");
            } else {
                this.telefonnummer = telefonnummer;
            }
        }
        this.mitarbeiter = new ArrayList<>();
    }
    
    public void setMitarbeiter(Mitarbeiter m) {
        mitarbeiter.add(m);
    } 

    public Mitarbeiter getMitarbeiter(int i) {
        return this.mitarbeiter.get(i);
    }
    public String getName() {
        return name;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelefonnummer() {
        return telefonnummer;
    }
    public String getEmail() {
        return email;
    }
    public String getWebsite() {
        return website;
    }
    public String getUmsatzsteuerID() {
        return umsatzsteuerID;
    }
    public String getHandelsregister() {
        return handelsregister;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public String getGeschaeftsfuehrer() {
        return geschaeftsfuehrer;
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

    public void setWebsite(String website) {
            this.website = website;
    }
    public void setUmsatzsteuerID(String umsatzsteuerID) {
            this.umsatzsteuerID = umsatzsteuerID;
    }
    public void setHandelsregister(String handelsregister) {
            this.handelsregister = handelsregister;
    }
    public void setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
    }
    public void setGeschaeftsfuehrer(String geschaeftsfuehrer) {
            this.geschaeftsfuehrer = geschaeftsfuehrer;
    }

    @Override
    public String toString() {
        return "Unternehmen{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", umsatzsteuerID='" + umsatzsteuerID + '\'' + 
                ", handelsregister='" + handelsregister + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", geschaeftsfuehrer='" + geschaeftsfuehrer + '\'' +
                '}';
    }
}