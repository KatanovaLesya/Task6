package printer3;

public class Main {
    public static void main(String[] args) {

        Printer r = new Red();
        System.out.println();
        r.print();

        Printer b = new Blue();
        b.print();

        Printer g = new Green();
        g.print();

        Printer p = new Printer();
        p.print();

        System.out.println("\n А тепер в масиві: \n");

        Printer [] arr = {r, b, g};
        for (Printer pr:arr)
        {
            pr.print();
        }

    }
}

// Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
// який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування
// від даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки, передані
// як аргументи методів, виводилися різними кольорами. Обязательно используйте приведення типів.
