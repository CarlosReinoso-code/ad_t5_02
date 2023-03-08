package iesmm.ad.mains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import iesmm.ad.model.Asociaciones;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AsociacionesJackson {

    public static void deserializeFromXML() {
        try {
            // 1. Instancia del mapeador para la serialización-deserialización
            XmlMapper xmlMapper = new XmlMapper();

            // 2. Deserialización (unmarshalling)
            File resource = new ClassPathResource("data/asociaciones.xml").getFile();
            Asociaciones deserializedData = xmlMapper.readValue(resource, Asociaciones.class);

            // 3. Procesamiento de datos
            List<iesmm.ad.t3_02.model.Asociacion> lista = deserializedData.getAsociaciones();
            System.out.println("Nº de asociaciones: " + lista.size());

            System.out.println("\n\nLISTADO DE ASOCIACIONES");
            System.out.println("=======================");

            for (iesmm.ad.t3_02.model.Asociacion asoc: lista)
                System.out.println(asoc.getDenominacion());

        } catch (JsonProcessingException e) {
            System.out.println("Error en serialización");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // DESERIALIZACIÓN/UNMARSHALLING (XML -> MEMORIA)
        System.out.println("\nDeserializing from XML...\n");
        deserializeFromXML();
    }
}
