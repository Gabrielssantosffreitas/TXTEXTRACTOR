package controller;

import controller.abstracts.ControllerClass;
import controller.intefaces.Controller;
import service.RegexService;
import service.interfaces.Service;
import views.telas.FinalViews;
import views.telas.RegexInputViews;

public class RegexController extends ControllerClass {
    private static final FinalViews FINAL_VIEWS = new FinalViews();
    private  static final RegexInputViews REGEX_INPUT_VIEWS = new RegexInputViews();

    public RegexController(Service SERVICE) {
        super(SERVICE);
    }

    @Override
    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo){
        String rx = REGEX_INPUT_VIEWS.init();
        this.SERVICE.setREGEX(rx);
        String texto =  this.SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        FINAL_VIEWS.init(texto);
    }
}
