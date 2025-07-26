package controller;

import controller.abstracts.ControllerClass;
import controller.intefaces.Controller;
import service.CpfService;
import service.interfaces.Service;
import views.telas.FinalViews;

public class CpfController extends ControllerClass {
    public CpfController(Service SERVICE) {
        super(SERVICE);
    }
}
