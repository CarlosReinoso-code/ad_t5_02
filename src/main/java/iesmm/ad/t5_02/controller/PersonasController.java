package iesmm.ad.t5_02.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import iesmm.ad.model.Persona;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonasController {

    @GetMapping(value="/persona", produces= MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Persona getPersona(){
        return new Persona("Carlos", "Reinoso", 34);
    }

    @GetMapping(value="/personaJSON", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Persona getPersonaJSON(){
        return new Persona("Carlos", "Reinoso", 34);
    }

    @GetMapping(value="/personasXML", produces= MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Adolf", "Hitler", 42));
        personas.add(new Persona("Iosif", "Stalin", 69));
        personas.add(new Persona("Jesus", "Cristo", 33));

        return personas;
    }

    @GetMapping(value="/personasJSON", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Persona> getPersonasJSON(){
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Adolf", "Hitler", 42));
        personas.add(new Persona("Iosif", "Stalin", 69));
        personas.add(new Persona("Jesus", "Cristo", 33));

        return personas;
    }
}
