package controller;

import controller.abstracts.ControllerClass;
import controller.intefaces.Controller;
import service.EmailService;
import service.interfaces.Service;
import views.telas.FinalViews;

public class EmailController extends ControllerClass {
    public EmailController(Service SERVICE) {
        super(SERVICE);
    }
}
