package service;

import service.abstracts.ServiceClass;
import service.interfaces.Service;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;
import views.telas.FinalViews;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfService extends ServiceClass {
    public CpfService() {
        super("\\b(\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})\\b", "CPF.txt");
    }
}
