package com.example.hms.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private int date_of_birth;
    private String address;
    private String gender;
    private int phone_number;
    private String blood_group;
    private String genotype;
    private String record_status;
    private int date_created;
}
