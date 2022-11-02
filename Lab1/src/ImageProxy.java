import java.awt.*;
import java.util.List;

public class ImageProxy implements Picture, Element{

    private String url;
    private Dimension dim;
    private Image realImg;
    public void loadImage(){
        if(realImg == null){
            realImg = new Image(url);
        }
    }

    public ImageProxy(String url){
        this.url = url;
    }
    public String url(){
        return url;
    }

    public void print() {
        loadImage();
        realImg.print();
    }
    public void add(Element e) {}
    public void remove(Element e) {}
    public Element get(int index){
        return null;
    }
}
