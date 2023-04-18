package com.banking.core.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "banking_core_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identificationNumber;

    @OneToMany(mappedBy ="user" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private BankAccountEntity accounts;


}
