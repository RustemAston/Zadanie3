package aston_rest2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "owner")
    private List<Advertise> adverts;

    @ManyToMany
    @JoinTable(name = "user_society", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "society_id"))
    private List<Society> societyList;

    public User(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public List<Advertise> getAdverts() {
        return adverts;
    }

    public List<Society> getSocietyList() {
        return societyList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdverts(List<Advertise> adverts) {
        this.adverts = adverts;
    }

    public void setSocietyList(List<Society> societyList) {
        this.societyList = societyList;
    }
}