package com.example.hms.Service;

import com.example.hms.Entity.MedicalHistory;
import com.example.hms.Repository.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T I F E on 12:30 PM, 5/23/2020, 2020
 */
@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository medicalHistoryRepository;

    public List<MedicalHistory> getAllMedicalHistory(){
        return (List<MedicalHistory>) medicalHistoryRepository.findAll();
    }

    public MedicalHistory getMedicalHistoryById(int id){
        return medicalHistoryRepository.findById(id).orElse(null);
    }

    public MedicalHistory addMedicalHistory(MedicalHistory medicalHistory){
        return medicalHistoryRepository.save(medicalHistory);
    }

    public MedicalHistory updateMedicalHistory(MedicalHistory medicalHistory){
        MedicalHistory existingMedicalHistory = medicalHistoryRepository.findById(medicalHistory.getId()).orElse(null);
        assert existingMedicalHistory != null;
        existingMedicalHistory.setDate_created(medicalHistory.getDate_created());
        existingMedicalHistory.setDate_created(medicalHistory.getDate_created());
        existingMedicalHistory.setComment(medicalHistory.getComment());
        existingMedicalHistory.setMedication(medicalHistory.getMedication());
        existingMedicalHistory.setMedical_problem(medicalHistory.getMedical_problem());
        existingMedicalHistory.setAllergy(medicalHistory.getAllergy());
        return medicalHistoryRepository.save(medicalHistory);
    }

    public String deleteMedicalHistory(int id){
        medicalHistoryRepository.deleteById(id);
        return "Medical history deleted successfully" + id;
    }


}
