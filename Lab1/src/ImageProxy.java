import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Picture{

    private String url;
    public ImageProxy(String url){
        this.url = url;
    }

    private List<Picture> img = new ArrayList<>();
    public void print() {
        for(Picture p: img){
            p.print();
        }
    }
    public void addImg(Picture p) {}
    public void remove(Picture p) {}

    public void content(Picture content){
        addImg(content);
    }
}
