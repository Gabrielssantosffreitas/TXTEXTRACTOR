package controller;

import controller.abstracts.ControllerClass;
import controller.intefaces.Controller;
import service.TellService;
import service.interfaces.Service;
import views.telas.FinalViews;

public class TellController extends ControllerClass {
    public TellController(Service SERVICE) {
        super(SERVICE);
    }
}
