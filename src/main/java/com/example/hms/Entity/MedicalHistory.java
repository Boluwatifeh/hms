package com.example.hms.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by T I F E on 10:44 PM, 5/18/2020, 2020
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistory {

    @Id
    private int id;
    private Date date_created;
    private Date date_updated;
    private String comment;
    private String medication;
    private String medical_problem;
    private String allergy;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}

