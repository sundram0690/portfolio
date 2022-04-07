package com.learnsimpleways.Portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    int id;
    String fname;
    String lname;
}
