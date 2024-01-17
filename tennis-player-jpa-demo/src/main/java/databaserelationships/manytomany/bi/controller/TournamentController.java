package databaserelationships.manytomany.bi.controller;

import databaserelationships.manytomany.bi.models.Category;
import databaserelationships.manytomany.bi.models.Registration;
import databaserelationships.manytomany.bi.models.Tournament;
import databaserelationships.manytomany.bi.service.CategoryService;
import databaserelationships.manytomany.bi.service.RegistrationService;
import databaserelationships.manytomany.bi.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    @Autowired
    TournamentService service;

    @Autowired
    RegistrationService registrationService;

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Tournament> allTournaments() {
        return service.allTournaments();
    }

    @GetMapping("/{id}")
    public Tournament getTournament(@PathVariable int id){
        return service.getTournament(id);
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return service.addTournament(tournament);
    }

    @PutMapping("/{id}/registrations/{registration_id}")
    public Tournament addRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        System.out.println(registration);
        return service.addRegistration(id, registration);
    }

    @PutMapping("/{id}/remove_registrations/{registration_id}")
    public Tournament removeRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        System.out.println(registration);
        return service.removeRegistration(id, registration);
    }


    @PutMapping("/{id}/categories/{category_id}")
    public Tournament addCategory(@PathVariable int id, @PathVariable int category_id) {
        Category category = categoryService.getCategory(category_id);
        return service.addCategory(id, category);
    }

    @PutMapping("/{id}/remove_categories/{category_id}")
    public Tournament removeCategory(@PathVariable int id, @PathVariable int category_id) {
        Category category = categoryService.getCategory(category_id);
        System.out.println(category);
        return service.removeCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteTournament(@PathVariable int id) {
        service.deleteTournament(id);
    }
}