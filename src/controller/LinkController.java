package controller;

import service.CpfService;
import service.LinkService;
import service.TellService;
import views.telas.FinalViews;

public class LinkController implements Controller {
    private static final LinkService LINK_SERVICE =  new LinkService();
    private static final FinalViews FINAL_VIEWS = new FinalViews();

    @Override
    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo) {
        String texto =  LINK_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        FINAL_VIEWS.init(texto);
    }
}
