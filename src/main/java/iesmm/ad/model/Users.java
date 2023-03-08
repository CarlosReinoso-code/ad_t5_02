package iesmm.ad.t3_02.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JacksonXmlRootElement(localName = "users")
public class Users {

    @JacksonXmlProperty(localName = "user")
    @JacksonXmlElementWrapper(useWrapping = false)
    private User[] users; // Colección de objetos implícita manejadora

    /**
     * Agrega un usuario a la lista de los usuarios
     * @param user Objeto usuario
     */
    public void addUser(User user) {
        if (users != null && users.length > 0)
            users = Arrays.copyOf(users, users.length + 1);
        else
            users = new User[1];

        users[users.length - 1] = user;
    }

    /**
     * Localiza un usuario según el orden insertado
     * @param index Índice de posición
     * @return Devuelve un objeto usuario, según su posición en la lista
     */
    public User searchUserByIndex (int index) {
        if (this.users.length > 0 && index > 0 && index < this.users.length)
            return this.users[index];
        else
            return null;
    }

    /**
     * Localiza un usuario según su nombre (no puede haber dos usuarios con el mismo nombre)
     * @param username Nombre de usuario
     * @return Devuelve un objeto usuario, según su nombre
     */
    public User searchUserbyName (String username) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i<this.users.length) {
            if (users[i].getUsername().equals(username))
                encontrado = true;
            else
                i++;
        }

        if (encontrado)
            return users[i];
        else
            return null;
    }

    /**
     * Devuelve el número de usuarios
     * @return Número de usuarios
     */
    public int numberOfUsers() {
        return this.users.length;
    }
}