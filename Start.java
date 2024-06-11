public class Start {

    static int b = 2;
    public static void main(String[] args) {
        System.out.println("Start");

        int a = 1;
        System.out.println(b);
        System.out.println(a);

        Unternehmen u1 = new Unternehmen("Firma 1", "Adresse 1");
        Unternehmen u2 = new Unternehmen("Firma 2", "Adresse 2", "01234567890");
        Mitarbeiter m1 = new Mitarbeiter("m1", "m1 Adresse");
        Mitarbeiter m2 = new Mitarbeiter("m2", "m2 Adresse");
        
        System.out.println(u1.getName());
        System.out.println(u2.getName());
        System.out.println(m1.getName());
        System.out.println(m1.getUnternehmen());
        m1.setUnternehmen(u2);
        System.out.println(m1.getUnternehmen());

        u2.setMitarbeiter(m1);
        System.out.println(u2.getMitarbeiter(0));

        m2.setUnternehmen(u2);
        u2.setMitarbeiter(m2);
        System.out.println(u2.getMitarbeiter(1));
        System.out.println(m2.getUnternehmen());

        System.out.println("Ende");
    }
}