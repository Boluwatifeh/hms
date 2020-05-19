package com.example.hms.Controller;

import com.example.hms.Entity.Patient;
import com.example.hms.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by T I F E on May, 2020
 */
@RestController
@RequestMapping(value = "/api/v1")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public @ResponseBody
    List<Patient> getAllPatients(){
        return patientService.getAllPatient();
    }

    @GetMapping("/patients/{id}")
    public @ResponseBody
    Patient getPatientById(@PathVariable int id){
        return patientService.getPatientById(id);
    }

    @PostMapping("/patients/register")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @PutMapping("/patients/update")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable int id){
       return patientService.deletePatient(id);
    }


}
