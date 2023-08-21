package com.gdr.demolagi.apis;

import com.gdr.demolagi.entities.Lead;
import com.gdr.demolagi.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeadController {

    @Autowired
    private LeadRepository leadRepository;

    @GetMapping("/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping("/getAll")
    public List<Lead>getLeads(){
        return leadRepository.findAll();
    }

    @PostMapping("/save")
    public String saveLead(@RequestBody Lead lead){
        leadRepository.save(lead);
        return "Saved...";
    }

    @PutMapping("/update/{id}")
    public String updateLead(@PathVariable long id, @RequestBody Lead lead){
        Lead updatedLead = leadRepository.findById(id).get();
        updatedLead.setNama(lead.getNama());
        updatedLead.setDeskripsi(lead.getDeskripsi());
        leadRepository.save(updatedLead);
        return ("Updated...");
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        Lead deleteUser = leadRepository.findById(id).get();
        leadRepository.delete(deleteUser);
        return "Delete user with the name: "+ deleteUser.getNama();
    }
}
