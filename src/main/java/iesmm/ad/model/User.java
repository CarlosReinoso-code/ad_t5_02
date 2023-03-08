package iesmm.ad.t3_02.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "user")
public class User {

    @JacksonXmlProperty(isAttribute = true)
    private String role;

    @JacksonXmlProperty(isAttribute = true)
    private String type;

    private String username;

    @JacksonXmlProperty(localName = "client_token")
    private String clientToken;

    @JacksonXmlProperty(localName = "client_secret")
    private String clientSecret;

    public User() {
    }

    public User(String role, String type, String username, String clientToken, String clientSecret) {
        this.role = role;
        this.type = type;
        this.username = username;
        this.clientToken = clientToken;
        this.clientSecret = clientSecret;
    }

    public String getUsername() {
        return username;
    }
    public String getRole() {
        return role;
    }
}