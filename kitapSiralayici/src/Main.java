
import java.util.*;


public class Main {
    public static void main(String[] args) {
        TreeSet<Book> myobj = new TreeSet<>();

        myobj.add(new Book("Ayşe",125,"terskovski", "1908"));
        myobj.add(new Book("Lord",136,"SERGEY", "1994"));
        myobj.add(new Book("Sefiller",1724,"Victor Hugo", "1862"));
        myobj.add(new Book("Beni Böyle Sev", 300,"Ahmet Batman", "1935"));



        System.out.println("Kitap ismine göre sırala : \n");
        int j=1;
        for(Book i : myobj){

            System.out.println(j+". "+"Book Name: " + i.getBookName() +
                    "\t\tPage Number: " + i.getPageNumb() +
                    "\t\tAuthor Name: " + i.getAuthorName() +
                    "\t\tDate: " + i.getReleaseDate());
            j++;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        TreeSet<Book> myobj2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPageNumb() == o2.getPageNumb()) {
                    return o1.getBookName().compareTo(o2.getBookName());
                }
                return o1.getPageNumb() - o2.getPageNumb();
            }
        });

        myobj2.addAll(myobj);

        System.out.println("Sayfa sayısına göre sıralama : \n");

        int k=1;
        for(Book i : myobj2){
            System.out.println(k+". "+"Book Name: " + i.getBookName() +
                    "\t\tPage Number: " + i.getPageNumb() +
                    "\t\tAuthor Name: " + i.getAuthorName() +
                    "\t\tDate: " + i.getReleaseDate());
            k++;
        }
    }
}