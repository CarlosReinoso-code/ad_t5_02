package iesmm.ad.mains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import iesmm.ad.t3_02.model.User;
import iesmm.ad.t3_02.model.Users;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsersJackson {

    public static void serializeToXML() {
        try {
            // 1. INSTANCIA DEL MAPEADOR (para serialización/deserialización)
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT); // Código indentado (opcional)

            // 2. SERIALIZACIÓN (marshalling)
            // Ejemplo con usuario
            User user = new User("administrator", "interno", "admin1", "abcplaudzrbcy38d", "0cxEF4CE0000=");
            String xml = xmlMapper.writeValueAsString(user); // Serialización de un usuario

            // Ejemplo con usuarios
            Users usuarios = new Users();
            usuarios.addUser(user);
            usuarios.addUser(new User("user", "interno", "user2", "defplaudzrbcy38d", "0cxDD2CE0000="));
            String xml_lista = xmlMapper.writeValueAsString(usuarios); // Serialización de una lista de usuarios
            System.out.println(xml_lista);

            // 3. VOLCADO DE DATOS A FICHERO
            // 1º método
            FileWriter file = new FileWriter(new File("users-ejemplo-1.xml"));
            file.write(xml_lista);
            file.close();

            // 2º método
            xmlMapper.writeValue(new File("users-ejemplo-2.xml"), usuarios);
        } catch (JsonProcessingException e) {
            System.out.println("Error en serialización");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeFromXML() {
        try {
            // 1. INSTANCIA DEL MAPEADOR (para serialización/deserialización)
            XmlMapper xmlMapper = new XmlMapper();

            // 2. DESERIALIZACIÓN (unmarshalling)
            File resource = new ClassPathResource("data/users.xml").getFile();
            Users usuarios = xmlMapper.readValue(resource, Users.class);

            // 3. PROCESAMIENTO DE DATOS
            System.out.println("Nº de usuarios: " + usuarios.numberOfUsers());
            System.out.print("Datos nombre de usuario 3º:");
            System.out.println(usuarios.searchUserByIndex(2).getUsername());

            System.out.println("Rol del usuario \"pepe\":");
            User usuario = usuarios.searchUserbyName("pepe");

            if (usuario != null)
                System.out.println(usuario.getRole());
            else
                System.out.println("NO EXISTE USUARIO \"pepe\"");
        } catch (JsonProcessingException e) {
            System.out.println("Error en deserialización");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // DESERIALIZACIÓN/UNMARSHALLING (XML -> MEMORIA)
        System.out.println("\nDeserialización XML...\n");
        deserializeFromXML();

        // SERIALIZACIÓN/MARSHALLING (MEMORIA -> XML)
        System.out.println("Serialización de XML...\n");
        serializeToXML();
    }
}
