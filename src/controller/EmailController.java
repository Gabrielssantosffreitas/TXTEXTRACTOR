package controller;

import service.EmailService;
import views.telas.EmailViews;

public class EmailController implements Controller {
   private static final  EmailService EMAIL_SERVICE =  new EmailService();
   private static final EmailViews  EMAIL_VIEWS = new EmailViews();

    public void controller(String pathArquivoAnalise,String pathPastaArquivoNovo){
        EMAIL_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
    }
}
