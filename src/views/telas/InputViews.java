package views.telas;

import controller.Controller;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.HeaderColors;
import views.PrintlnCorlor.PrintlnColors;

import java.util.Scanner;

public class InputViews {
    public static void init(Scanner scanner, Controller controller){
        HeaderColors.header("PATHS");
        PrintlnColors.printColor("digite o caminho do PATH do arquivo a ser analisado ", Colors.GREEN);

        String pathArquivoAnalise =  scanner.nextLine();

        PrintlnColors.printColor("digite o caminho do PATH no local para criar um novo arquivo", Colors.GREEN);

        String pathPastaArquivoNovo =  scanner.nextLine();

        controller.controller(pathArquivoAnalise,pathPastaArquivoNovo);
    }
}
