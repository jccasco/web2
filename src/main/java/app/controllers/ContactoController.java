
package app.controllers;

import app.models.DatosContacto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.POST;
import org.javalite.common.Collections;
import org.javalite.common.JsonHelper;


public class ContactoController extends AppController {
    public void index(){
        view("motivos",DatosContacto.getListaMotivos());
    }
    
    @POST
    public void procesarDatos(){
        DatosContacto contacto = new DatosContacto();
        List<String> moti = new ArrayList<String>(params("motivos"));
       
        
        try {
            contacto.rellenar(params1st());
            contacto.setMotivos(moti);
            
            //contacto.validar();
        } catch (IllegalArgumentException ex){
            Map error = Collections.map("error", ex.getMessage());
            respond(JsonHelper.toJsonString(error)).contentType("application/json").status(400);
            return;
        }
        
        respond(JsonHelper.toJsonString(contacto)).contentType("application/json");
    }
}
