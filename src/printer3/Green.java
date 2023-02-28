package printer3;

public class Green extends Printer

{
    public static final String ANSI_GREEN = "\u001B[32m";
    @Override
    public void print()
    {
        System.out.println(ANSI_GREEN+"Print is Green");
    }
}
