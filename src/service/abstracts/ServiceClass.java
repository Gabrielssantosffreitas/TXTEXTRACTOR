package service.abstracts;

import service.interfaces.Service;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;
import views.telas.FinalViews;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ServiceClass implements Service {
    protected String REGEX;
    protected final String NOME_ARQUIVO;

    public ServiceClass(String REGEX, String NOME_ARQUIVO) {
        this.REGEX = REGEX;
        this.NOME_ARQUIVO = NOME_ARQUIVO;
    }

    public ServiceClass(String NOME_ARQUIVO) {
        this.NOME_ARQUIVO = NOME_ARQUIVO;
    }



    public void setREGEX(String REGEX) {
        this.REGEX = REGEX;
    }

    private String arquivoAnalisarReader(String pathArquivo) {
        String texto = "";
        String linha;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(pathArquivo)))) {
            while ((linha = bufferedReader.readLine()) != null) {
                texto += linha+"\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return texto;
        }
    }
    public void criarArquivos(String pathPasta,String texto,String arquivoNome){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(pathPasta,arquivoNome),true))){
            bufferedWriter.write(texto);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            PrintlnColors.printColorBlue("Arquivo Criado");
            bufferedWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String regex(String txt, String regex) {
        String texto = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);

        System.out.println("txt:"+ txt);
        while (matcher.find()) {

            texto += matcher.group() + "\n";
            System.out.println("loop: "+texto);
        }
        System.out.println("fora :" + texto);
        return texto;
    }

    public String anilisar(String pathArquivoAnalise, String pathPastaArquivoNovo) {

        FinalViews finalViews = new FinalViews();
        String textoAnilisar = arquivoAnalisarReader(pathArquivoAnalise);
        String result = regex(textoAnilisar, this.REGEX);
        criarArquivos(pathPastaArquivoNovo,result,this.NOME_ARQUIVO);
        return result;


    }
}
