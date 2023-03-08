package iesmm.ad.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Asociaciones {
    @JacksonXmlProperty(localName = "asociacion")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<iesmm.ad.t3_02.model.Asociacion> lista_asociaciones; // Colección de objetos implícita manejadora

    public List<iesmm.ad.t3_02.model.Asociacion> getAsociaciones() {
        return this.lista_asociaciones;
    }
}
