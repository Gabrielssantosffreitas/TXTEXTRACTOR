package controller;

import controller.abstracts.ControllerClass;
import controller.intefaces.Controller;
import service.LinkService;
import service.interfaces.Service;
import views.telas.FinalViews;

public class LinkController extends ControllerClass {
    public LinkController(Service SERVICE) {
        super(SERVICE);
    }
}
