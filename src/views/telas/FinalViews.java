package views.telas;

import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.HeaderColors;
import views.PrintlnCorlor.PrintlnColors;

public class FinalViews  {
    public void init(String texto) {
        HeaderColors.headerRed("ARQUIVO CRIADO ");
        PrintlnColors.printColor("aqui esta uma previa do seu aequivo", Colors.GREEN);
        PrintlnColors.printColor(texto, Colors.BLUE);

    }
}
