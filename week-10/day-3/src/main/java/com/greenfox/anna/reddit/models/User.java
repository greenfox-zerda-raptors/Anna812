package com.greenfox.anna.reddit.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * Created by Anna on 17/01/06.
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private long userId;
    private String name;
    private String password;

    public boolean isEqual(User temp) {
        return temp.name == this.name && temp.password == this.password;
    }
}
