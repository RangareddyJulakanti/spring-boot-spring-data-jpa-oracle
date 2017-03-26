package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by RANGA on 3/26/2017.
 */
@Entity
@Table(name="vendor")
public class Vendor {
    @Id
    Long id;
}
