package user;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;

/**
 * Created by tung on 24.11.2014.
 */
public class User {
    @Id
    private String id;
    @Size(min=2, max=30)
    @NotNull
    private String username;
    @Size(min=2, max=30)
    @NotNull
    private String email;
    private String password;
    @Size(min=2, max=30)
    @NotNull
    private String address;
    private int role;
/*
    public User(String username,
                String email, String address) {
        super();
        this.username = username;
        this.address = address;
        this.email = email;
    }
*/
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String _email) {
        this.email = _email;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public int getRole() {
        return role;
    }


    public void setRole(int role) {
        this.role = role;
    }
}
