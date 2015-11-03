package web.sph.prc1.entity;

import com.sun.istack.internal.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Paradox on 28/10/2015.
 */
public class User {

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
