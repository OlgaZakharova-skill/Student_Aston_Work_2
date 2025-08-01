import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivanova Elena", "Faculty of History", Arrays.asList(
                        new Book("Erich Maria Remarque", "Black Obelisk", 1998, 479),
                        new Book("Erich Maria Remarque", "Three comrades",2003, 446),
                        new Book("Erich Maria Remarque", "Night in Lisbon", 2001, 289),
                        new Book("Erich Maria Remarque", "Station on the horizon", 1993, 312),
                        new Book("Erich Maria Remarque", "Arc de Triomphe", 1994, 100)
                )),
                new Student("Smirnov Ivan", "Faculty of Mathematics", Arrays.asList(
                        new Book("Yana Wagner", "Living people", 1999, 336),
                        new Book("George Orwell", "Animal Farm", 2013, 95),
                        new Book("Liu Cixin", "The Three-Body Problem", 1999, 432),
                        new Book("Liu Cixin", "Eternal Life Death", 2022, 791),
                        new Book("Robert Harris", "Fatherland", 2001, 361)
                ))

        );
        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted((x1, x2) -> Integer.compare(x1.getPages(), x2.getPages()))
                .filter(book -> book.getYear() > 2000)
                .distinct()
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(year -> System.out.println("Year of book release:" + year),
                        () -> System.out.println("Book not found")
                );

    }
}