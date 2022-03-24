package Transport;

import Users.User;

import java.util.GregorianCalendar;

public class Bus extends User
{
    private String r_number;
    private GregorianCalendar bought_date;

    public Bus(String r_number, GregorianCalendar bought_date, String Name,String Phone,String role) {
        super(Name,Phone,role);
        this.r_number = r_number;
        this.bought_date = bought_date;
    }
}


