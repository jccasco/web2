package app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.javalite.common.Collections;

public class DatosContacto implements Serializable {

    public DatosContacto() {
    }

    private String nombre;
    private Integer edad;
    private String email;
    private List<String> motivos;
    private String comentario;

    public static List<Map> getListaMotivos() {

        List res = Collections.list(
                Collections.map("id", 1, "descripcion", "Consulta"),
                Collections.map("id", 2, "descripcion", "Reclamo"),
                Collections.map("id", 3, "descripcion", "Agradecimiento")
        );
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMotivos() {
        return motivos;
    }

    public void setMotivos(List<String> id) {
        List<String> l = new ArrayList<>();
        Integer i;
        for (i = 0; i <= id.size() - 1; i++) {
            l.add(getNombreMotivo(Integer.valueOf(id.get(i))));
        }
        this.motivos = l;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public DatosContacto rellenar(Map<String, String> parameterMap) {
        setComentario(parameterMap.get("comentario"));
        setEdad(Integer.valueOf(parameterMap.get("edad")));
        setEmail(parameterMap.get("email"));
//        setMotivos(parameterMap.get("motivos"));
        setNombre(parameterMap.get("nombre"));

        return this;
    }

    public String getNombreMotivo(Integer codigo) {
        String nombres[] = {"Consulta", "Reclamo", "Agradecimiento"};

        return nombres[codigo - 1];
    }

}
