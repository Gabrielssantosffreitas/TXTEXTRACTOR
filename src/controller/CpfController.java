package controller;

import service.CpfService;
import service.TellService;
import views.telas.FinalViews;

public class CpfController implements Controller {
    private static final CpfService CPF_SERVICE =  new CpfService();
    private static final FinalViews FINAL_VIEWS = new FinalViews();

    @Override
    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo) {
        String texto =  CPF_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        FINAL_VIEWS.init(texto);
    }
}
