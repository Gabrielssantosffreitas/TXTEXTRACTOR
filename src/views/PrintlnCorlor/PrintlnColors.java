package views.PrintlnCorlor;

public class PrintlnColors {


    public static void printColor(String texto, Colors colors) {
        System.out.println( colors.getColor() +texto+ Colors.RESET.getColor() );
    }


}
