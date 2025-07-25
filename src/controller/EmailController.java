package controller;

import service.EmailService;
import views.telas.FinalViews;

public class EmailController implements Controller {
   private static final  EmailService EMAIL_SERVICE =  new EmailService();
   private static final FinalViews EMAIL_VIEWS = new FinalViews();

    public void controller(String pathArquivoAnalise,String pathPastaArquivoNovo){
        String preViewsArquivo =  EMAIL_SERVICE.anilisar(pathArquivoAnalise,pathPastaArquivoNovo);
        EMAIL_VIEWS.init(preViewsArquivo);
    }
}
