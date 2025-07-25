package controller;

import service.RegexService;
import views.telas.FinalViews;
import views.telas.RegexInputViews;

public class RegexController implements Controller{
    private static final RegexService REGEX_SERVICE =  new RegexService();
    private static final FinalViews FINAL_VIEWS = new FinalViews();
    private  static final RegexInputViews REGEX_INPUT_VIEWS = new RegexInputViews();

    @Override
    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo){
        String rx = REGEX_INPUT_VIEWS.init(); ;
        String texto =  REGEX_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo,rx);
        FINAL_VIEWS.init(texto);
    }
}
