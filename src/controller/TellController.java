package controller;

import service.TellService;
import views.telas.FinalViews;

public class TellController implements Controller{
    private static final TellService TELL_SERVICE =  new TellService();
    private static final FinalViews FINAL_VIEWS = new FinalViews();

    @Override
    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo) {
        String preViewsArquivo =  TELL_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        FINAL_VIEWS.init(preViewsArquivo);
    }
}
