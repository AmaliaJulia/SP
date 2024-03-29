package models;

public class ImageProxy implements Picture, Element {
    private String url;
    private Image realImg;

    public void loadImage() {
        if (realImg == null) {
            realImg = new Image(url);
        }
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

    @Override
    public void print() {
        loadImage();
        realImg.print();
    }

    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}