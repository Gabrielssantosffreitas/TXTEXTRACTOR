package views.telas;

import controller.*;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.HeaderColors;
import views.PrintlnCorlor.PrintlnColors;

import java.util.Scanner;

public class OpicionViews {
    private static final Scanner SCANNER  =  new Scanner(System.in);

    private static  boolean opicionCase(){
        int opicion = 0;

        try {
            opicion = SCANNER.nextInt();
            SCANNER.nextLine();

        }catch (RuntimeException e){
            throw  new RuntimeException("VALOR INVALIDO POR FAVOR PASSE UO NUMERO");
        }

        switch (opicion){
            case 1:
               InputViews.init(SCANNER, new EmailController());
                break;
            case 2:
                InputViews.init(SCANNER, new TellController());
                break;
            case 3:
                InputViews.init(SCANNER, new CpfController());
                break;
            case 4:
                InputViews.init(SCANNER, new LinkController());
                break;
            case 5:
                InputViews.init(SCANNER, new RegexController());
                break;
            case 6:
                return false;
            default:
                System.out.println("VALOR INVALIDO");
                break;
        }

        return true;
    }

    public static  void opicionLoop (){
        Boolean loop = true;

        while (loop){
            HeaderColors.header("ESCOLHA UMA DAS OPICOES ABAIXO");
            PrintlnColors.printColor("PROCURAR POR :",Colors.GREEN);
            PrintlnColors.printColor("1- email ",Colors.GREEN);
            PrintlnColors.printColor("2- telefones ",Colors.GREEN);
            PrintlnColors.printColor("3- cpfs ",Colors.GREEN);
            PrintlnColors.printColor("4- links HTTPS ",Colors.GREEN);
            PrintlnColors.printColor("5- meu propio REGEX ",Colors.GREEN);
            PrintlnColors.printColor("6- sair ",Colors.GREEN);

            loop = opicionCase();

        }
    }
}
