
public class Paragraph implements Element, AlignStrategy{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void print(){
        System.out.println("Paragraph: "+ text);
    }

    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){
        return null;
    }

    @Override
    public void render(Paragraph p) {}
    public void setAlignStrategy(){}
}