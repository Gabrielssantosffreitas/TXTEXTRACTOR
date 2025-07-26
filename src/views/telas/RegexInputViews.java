package views.telas;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;

import java.util.Scanner;
public class RegexInputViews {
    public String init(){
        Scanner s = new Scanner(System.in);
        PrintlnColors.printColor("Digite seu regex", Colors.GREEN);
        String rx =  s.nextLine();
        return rx;
    }
}
