package views.PrintlnCorlor;

public class PrintlnColors {


    public static void printColor(String texto, Colors colors) {
        System.out.println(colors.getColor() + texto + Colors.RESET.getColor());
    }

    public static void printColor(String texto) {
        System.out.println(Colors.GREEN.getColor() + texto + Colors.RESET.getColor());
    }

    public static void printColorRed(String texto) {
        System.out.println(Colors.RED.getColor() + texto + Colors.RESET.getColor());
    }

    public static void printColorBlue(String texto) {
        System.out.println(Colors.BLUE.getColor() + texto + Colors.RESET.getColor());
    }

    public static void printColorYellow(String texto) {
        System.out.println(Colors.YELLOW.getColor() + texto + Colors.RESET.getColor());
    }


}
