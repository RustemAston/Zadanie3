package aston_rest2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "societies")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "heading")
    private String heading;

    @ManyToMany(mappedBy = "societyList")
    private List<User> usersSociety;

    public Society(String heading) {
        this.heading = heading;
    }

    public Society() {
    }

    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public List<User> getUsersSociety() {
        return usersSociety;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setUsersSociety(List<User> usersSociety) {
        this.usersSociety = usersSociety;
    }

}
