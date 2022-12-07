public class DocumentManager {

    public static DocumentManager instance = new DocumentManager();
    private Book myBook;

    public static DocumentManager getInstance(){
        return instance;
    }
    public Book getBook(){
        return this.myBook;
    }
    public void setBook(Book myBook){
        this.myBook = myBook;
    }
    public void print() {
    }
}
