package Hashes;

import java.util.Objects;

public class User {

    private int id;
    private String email;
    private String name;
    private String telefono;

    public User(int id, String email, String name, String telefono) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, email, name);
    }
}
