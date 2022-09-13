package app.controllers;

import java.text.SimpleDateFormat;
import org.javalite.activeweb.AppController;

public class HomeController extends AppController {

    public void index() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        view("fecha",formato.format(new java.util.Date()));
        view("nombre",param("nombre"));
    }
    

}
