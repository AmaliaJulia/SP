public class PrintVisitor implements Visitor{

    private String numeAn;
    private String grupa;
    private String semigrupa;
    private String studenti;
    @Override
    public void visitAn(An an) {
        this.numeAn = an.getNumeAn();
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        this.grupa = grupa.getNumeGrupa();
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        this.semigrupa = semigrupa.getNumeSemigrupa();
    }

    @Override
    public void visitStudent(Student student) {
        this.studenti = student.getNume();
        this.studenti = student.getEmail();
    }

    public void afisare(){
        System.out.println(numeAn);
        System.out.println(grupa);
        System.out.println(semigrupa);
        System.out.println(studenti);
    }
}
