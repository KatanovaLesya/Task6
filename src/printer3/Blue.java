package printer3;

public class Blue extends Printer

{
    public static final String ANSI_BLUE = "\u001B[34m";
   @Override
    public void print()
    {
        System.out.println(ANSI_BLUE+"Print is Blue");
    }
}

