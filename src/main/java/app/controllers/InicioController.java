
package app.controllers;

import java.text.SimpleDateFormat;
import org.javalite.activeweb.AppController;


public class InicioController extends AppController{
    
    public void ejemplo1(){
        
    }
    
    public void index(){
        view("nombre",param("nombre"));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        view("fecha",formato.format(new java.util.Date()));
    }
    
}
