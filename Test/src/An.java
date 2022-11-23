import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    private String numeAn;
    private List<Element> grupe = new ArrayList<>();

    public An(String numeAn) {
        this.numeAn = numeAn;
    }

    public String getNumeAn() {
        return numeAn;
    }

    @Override
    public void print() {
        System.out.println(numeAn);
        for(Element element: grupe){
            element.print();
        }
    }

    @Override
    public void add(Element e) {
        this.grupe.add(e);
    }

    @Override
    public void remove(Element e) {
        this.grupe.remove(e);
    }

    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
