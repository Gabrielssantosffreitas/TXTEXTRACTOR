package service;

import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;
import views.telas.FinalViews;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkService {
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

    public void criarArquivos(String pathPasta,String texto){


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(pathPasta,"Link.txt")))){

            bufferedWriter.write(texto);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            PrintlnColors.printColor("Arquivo Criado", Colors.BLUE);
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
        String links = regex(textoAnilisar, "https?:\\/\\/[^\\s\"]+");
        criarArquivos(pathPastaArquivoNovo,links);
        return links;




    }
}
