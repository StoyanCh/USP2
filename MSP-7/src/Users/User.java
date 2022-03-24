package Users;

import javax.jws.soap.SOAPBinding;

public class User extends Role{
    private String Name;
    private String Phone;

    public User(String name, String role, String phone) {
       super(role);
        Name = name;
        Phone = phone;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
