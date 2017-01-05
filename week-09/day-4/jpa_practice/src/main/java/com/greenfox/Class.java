package com.greenfox;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Created by Anna on 17/01/02.
 */

@Entity
public class Class {

    @Id
    int code;
}
