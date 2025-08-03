public class Book{
    public String author;
    public String title;
    public int year;
    public int pages;

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String toString(){
        return "Author of the book: " +author+
                " Title of the book: " +title+
                " Year of manufacture: " +year+
                " Number of pages: " +pages+ "\n";
    }
}
