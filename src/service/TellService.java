package service;

import service.abstracts.ServiceClass;
import views.PrintlnCorlor.Colors;
import views.PrintlnCorlor.PrintlnColors;
import views.telas.FinalViews;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TellService extends ServiceClass {
    public TellService() {
        super("\\b(?:\\(?([1-9]{2})\\)?\\s?)?(?:9\\s?\\d{4}[-\\s]?\\d{4}|\\d{4}[-\\s]?\\d{4})\\b", "tell.txt");
    }
}
