package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * @author: Nikolai.Savenko
 * em@il: niknik2986@gmail.com
 */
@Entity
public class Contacts extends Model {

    public String phone;
    public String address;
    public String city;
}
