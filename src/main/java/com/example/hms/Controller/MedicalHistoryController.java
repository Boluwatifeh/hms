package com.example.hms.Controller;
import com.example.hms.Entity.MedicalHistory;
import com.example.hms.Service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by T I F E on 1:21 PM, 5/23/2020, 2020
 */

@RestController
@RequestMapping(value = "/api/v1/patients")
public class MedicalHistoryController {

    @Autowired
    public MedicalHistoryService medicalHistoryService;

    //getAllMedHistory
    @GetMapping(value = "/medicalHistory")
    public @ResponseBody
    List<MedicalHistory> getAllMedicalHistories(){
        return medicalHistoryService.getAllMedicalHistory();
    }

    //getMedHistoryById
    @GetMapping(value = "/medicalHistory/{id}")
    public @ResponseBody
    MedicalHistory getMedicalHistoryById(@PathVariable int id){
        return medicalHistoryService.getMedicalHistoryById(id);
    }

    //addMedHistory
    @PostMapping(value = "/medicalHistory/register")
    public MedicalHistory addMedicalHistory(@RequestBody MedicalHistory medicalHistory){
        return medicalHistoryService.updateMedicalHistory(medicalHistory);
    }

    //updateMedHistory
    @PutMapping(value = "/medicalHistory/update")
    public MedicalHistory updateMedicalHistory(@RequestBody MedicalHistory medicalHistory){
        return medicalHistoryService.updateMedicalHistory(medicalHistory);
    }

    //deleteMedHistory
    @DeleteMapping(value = "/medicalHistory/delete/{id}")
    public String deleteMedicalHistory(@PathVariable int id){
        return medicalHistoryService.deleteMedicalHistory(id);
    }
}
