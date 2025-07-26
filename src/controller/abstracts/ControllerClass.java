package controller.abstracts;

import controller.intefaces.Controller;
import service.CpfService;
import service.interfaces.Service;
import views.telas.FinalViews;

import java.security.Provider;

public abstract class  ControllerClass  implements Controller {
    protected final Service SERVICE;
    protected static final FinalViews FINAL_VIEWS = new FinalViews();

    public ControllerClass(Service SERVICE) {
        this.SERVICE = SERVICE;
    }

    public void controller(String pathArquivoAnalise, String pathPastaArquivoNovo) {
        String texto =  SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        FINAL_VIEWS.init(texto);
    }
}
