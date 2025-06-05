package com.fakesibwork.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * It is a simple example of entity of users *
 * @Entity
 * To initialize entity
 * @Table
 * Is pointing to the table name, by default it'll be named by class name
 * @NoArgsContsructor
 * Entity must have constructor without arguments for Hibernate to init table
 * @AllArgsConstructor
 * All args constructor is not necessary, it is for convenience
 * @Builder
 * For creating user
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    /*
    When we create an Entity we must be sure to tag the primary key with the @Id annotation
    If necessary we can generate a key using @GeneratedValue(strategy = )
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;

}
