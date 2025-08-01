import java.util.List;

public class Student {
    public String name;
    public String faculty;
    private List<Book> books;

    public Student(String name, String faculty, List<Book> books) {
        this.name = name;
        this.faculty = faculty;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String toString() {
        return "Student name: " + name +
                "\n faculty - " + faculty +
                "\n List of books: \n" + books + "\n";
    }
}