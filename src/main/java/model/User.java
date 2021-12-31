package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String family;
    private String age;

    public User(int id, String name, String family, String age) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public User() {

    }

    public User(String name, String family, String age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
}
