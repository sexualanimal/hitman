package ua.kozak.hitman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.kozak.hitman.entity.Specialist;
import ua.kozak.hitman.repository.SpecialistRepository;

@RestController
@RequestMapping(value = "/specialist")
public class SpecialistController {

    @Autowired
    private SpecialistRepository specialistRepository;

    @GetMapping(value = "/{username:[a-zA-Z0-9]+}")
    public Specialist get(@PathVariable(value = "username") String userName){
        return specialistRepository.findByName(userName);
    }

    @PutMapping(value = "/{username:[a-zA-Z0-9]+}")
    public Specialist create(@PathVariable(value = "username") String userName, @RequestParam(value = "password") String password){
        return specialistRepository.save(new Specialist(userName, password));
    }

}