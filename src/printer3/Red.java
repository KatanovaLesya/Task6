package printer3;

public class Red extends Printer
{

    public static final String ANSI_RED = "\u001B[31m";
    @Override
    public void print()
    {
        System.out.println(ANSI_RED+"Print is Red");
    }
}
