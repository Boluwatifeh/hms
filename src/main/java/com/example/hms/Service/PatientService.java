package com.example.hms.Service;
import com.example.hms.Entity.Patient;
import com.example.hms.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by T I F E on May, 2020
 */
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatient(){
        return (List<Patient>) patientRepository.findAll();
    }

    public Patient getPatientById(int id){
        return patientRepository.findById(id).orElse(null);
    }

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient){
        Patient existingPatient = patientRepository.findById(patient.getId()).orElse(null);
        assert existingPatient != null;
        existingPatient.setFirst_name(patient.getFirst_name());
        existingPatient.setMiddle_name(patient.getMiddle_name());
        existingPatient.setDob(patient.getDob());
        existingPatient.setAddress(patient.getAddress());
        existingPatient.setGender(patient.getGender());
        existingPatient.setPhone_number(patient.getPhone_number());
        existingPatient.setBlood_group(patient.getBlood_group());
        existingPatient.setGeno_type(patient.getGeno_type());
        existingPatient.setRecord_status(patient.getRecord_status());
        existingPatient.setDate_created(patient.getDate_created());
        return patientRepository.save(existingPatient);

    }

    public String deletePatient(int id){
        patientRepository.deleteById(id);
        return "Patient deleted successfully! " + id;
    }

}
