package iesmm.ad.t5_02.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/producer")
public class Producer {

    @GetMapping(value="/html", produces= MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String getHTML(){
        return "<!doctype html><html>" +
                "<head></head>" +
                "<body>" +
                "<h1>Hola, esto es un ejemplo</h1>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value="/xml", produces=MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String getXML(){
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<personas>" +
                "<persona>pepe</persona>" +
                "<persona>lola</persona>" +
                "</personas>";
    }

    @GetMapping(value="/json", produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getJSON(){
        return "{" +
                "\"nombre\": \"pepito\"," +
                "\"edad\": \"50\"" +
                "}";
    }

    @PostMapping(value="/fecha", produces=MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String getFecha(){
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<fecha>" +
                "<dia>" + LocalDateTime.now().getDayOfMonth() + "</dia>" +
                "<mes>" + LocalDateTime.now().getMonth() + "</mes>" +
                "<anio>" + LocalDateTime.now().getYear() + "</anio>" +
                "</fecha>";
    }
}
