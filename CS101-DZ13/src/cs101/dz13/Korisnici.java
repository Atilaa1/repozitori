package cs101.dz13;

import java.util.*;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Korisnici {

    public String username;
    public String password;


    public Korisnici() {
    }

    public Korisnici(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    @Override
    public String toString() {
        return "Korisnici{" + "username=" + username + ", password=" + password + '}';
    }

}
