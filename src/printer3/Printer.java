package printer3;

public class Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public void print()
    {
        System.out.println(ANSI_RESET + "Print is print");
    }
}

// Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
// який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування
// від даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки, передані
// як аргументи методів, виводилися різними кольорами. Обязательно используйте приведення типів.
