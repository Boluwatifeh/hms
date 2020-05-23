package com.example.hms.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    private Date dob;
    private String address;
    private String gender;
    private int phone_number;
    private String blood_group;
    private String geno_type;
    private String record_status;
    private String date_created;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JoinColumn(name = "md_fk", referencedColumnName = "id")
    private List<MedicalHistory> medicalHistories;

}
