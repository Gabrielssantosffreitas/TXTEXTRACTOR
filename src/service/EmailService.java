package service;

import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailService {

    private String arquivoAnalisarReader(String pathArquivo) {

        String texto = "\n";
        String linha;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(pathArquivo)))) {

            while ((linha = bufferedReader.readLine()) != null) {
                texto += bufferedReader.readLine();
                texto += "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return texto;
        }


    }

    public void criarArquivos(String pathPasta,String texto){


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(pathPasta,"email.txt")))){

            bufferedWriter.write(texto);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            PrintlnColors.printColor("Arquivo Criado",Colors.BLUE);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public String regex(String texo, String regex) {
        String texto = "\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texo);

        while (matcher.find()) {
            texto += matcher.group() + "\n";
        }

        return texto;

    }



    public void anilisar(String pathArquivoAnalise, String pathPastaArquivoNovo) {

        String textoAnilisar = arquivoAnalisarReader(pathArquivoAnalise);
        String emails = regex(textoAnilisar, "[\\\\w.-]+@[\\\\w.-]+\\\\.[a-zA-Z]{2,}");
        criarArquivos(pathPastaArquivoNovo,emails);



    }

}
