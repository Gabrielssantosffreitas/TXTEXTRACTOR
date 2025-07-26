package service;

import service.abstracts.ServiceClass;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;
import views.telas.FinalViews;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailService extends ServiceClass {
    public EmailService() {
        super("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b", "Emal.txt");
    }
}
