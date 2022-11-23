public class Main {
    public static void main(String[] args){
        Element info3 = new An("Informatica 3");
        info3.add(new Grupa("Grupa 1"));
                info3.add(new Semigrupa("Semigrupa 1.1"));
                                info3.add(new Student("Popescu I", "popescu@email.com"));
                                info3.add(new Student("Ionescu E", "ionescu@email.com"));
                info3.add(new Semigrupa("Semigrupa 1.2"));
                        info3.add(new Student("Vasilescu I", "vasilescu@email.com"));
                        info3.add(new Student("Georgescu E", "georgescu@email.com"));
        info3.add(new Grupa("Grupa 2"));

        PrintVisitor v = new PrintVisitor();
        info3.accept(v);
        v.afisare();
    }
}
