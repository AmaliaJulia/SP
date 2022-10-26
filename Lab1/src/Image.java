import java.util.concurrent.TimeUnit;

public class Image implements Picture {
    private String name;
    private String url;

    public Image(String name) {
        this.name = name;
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("Image with name: "+name);
    }

    @Override
    public void addImg(Picture p) {}
    public void remove(Picture p) {}
    public Element get(int index){
        return null;
    }

//    Image loadImage(){
//        if(realImage == null) {
//            realImage = new Image(url);
//        }
//        return realImg;
//    }
}