package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * @author: Nikolai.Savenko
 * em@il: niknik2986@gmail.com
 */
@Entity
public class Company extends Model {

    public String name;
    @OneToOne
    public Contacts contacts;

    public Company(String name) {
        this.name = name;
    }

    public static List<Company> list() {
        return Company.all().fetch();
    }

    public static Long saveCompany(Company company) {
        return (Long) company.save()._key();
    }
}
