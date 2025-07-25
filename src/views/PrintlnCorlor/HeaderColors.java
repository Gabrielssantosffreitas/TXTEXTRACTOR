package views.PrintlnCorlor;

public class HeaderColors {
    public static void header(String texto){
        texto = texto.toUpperCase();
        PrintlnColors.printColor("==================| "+texto+" |==================\n",Colors.RED);
    }
}
