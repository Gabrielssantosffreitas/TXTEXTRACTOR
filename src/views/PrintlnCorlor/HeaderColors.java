package views.PrintlnCorlor;

public class HeaderColors {
    private static String transformeText(String texto) {
        texto = texto.toUpperCase();
        return texto;
    }

    public static void headerRed(String texto) {
        texto = texto.toUpperCase();
        PrintlnColors.printColorRed("==================| " + texto + " |==================\n");
    }

    public static void headerYallow(String texto) {
        texto = texto.toUpperCase();
        PrintlnColors.printColorYellow("==================| " + texto + " |==================\n");
    }

    public static void headerBlue(String texto) {
        texto = texto.toUpperCase();
        PrintlnColors.printColorBlue("==================| " + texto + " |==================\n");
    }

    public static void headerGreew(String texto) {
        texto = texto.toUpperCase();
        PrintlnColors.printColor("==================| " + texto + " |==================\n");
    }

}
