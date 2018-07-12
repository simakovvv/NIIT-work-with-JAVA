import java.util.Arrays;

public class Book {
    private String name;
    private Author[] autors;
    private Double price;
    private int qty = 0;

    public void addNewAuthor(Author...authors){

        int length = this.autors.length+authors.length;

        Author[] tmp = new Author[length];

         System.arraycopy(this.autors, 0, tmp,0,this.autors.length);
         //*copy the first half of the temporary array
         System.arraycopy(authors, 0, tmp,this.autors.length,authors.length);
         //*copy the second half of the temporary array


         autors = Arrays.copyOf(tmp,length);//* copy the temporary array into the class field


    }

    public Book(String name, Author[] autors, Double price) {
        this.name = name;
        this.autors = autors;
        this.price = price;
    }

    public Book(String name, Author[] autors, Double price, int qty) {
        this.name = name;
        this.autors = autors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAutors() {
        return autors;
    }

    public void setAutors(Author[] autors) {
        this.autors = autors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autors=" + getAuthorNames() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){ //*add the author to the book
        String names =  " ";

        for (int i = 0; i < autors.length; i++) {
            if(i!=autors.length-1) {
                String currentName = autors[i].getName();
                names = names + currentName + ", ";
            }else{
                String currentName = autors[i].getName();
                names = names + currentName + ". ";
            }
        }
        return names;

    }
}
