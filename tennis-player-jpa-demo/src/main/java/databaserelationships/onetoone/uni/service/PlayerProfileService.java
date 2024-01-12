package databaserelationships.onetoone.uni.service;

import java.util.List;

import databaserelationships.onetoone.uni.model.PlayerProfile;
import databaserelationships.onetoone.uni.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerProfileService {

    @Autowired
    PlayerProfileRepository repo;

    public List<PlayerProfile> allPlayerProfiles() {
        return repo.findAll();
    }

    public PlayerProfile getPlayerProfile(int id) {
        return repo.findById(id).get();
    }

    public PlayerProfile addPlayerProfile(PlayerProfile profile) {
        profile.setId(0);
        return repo.save(profile);
    }

    public void deletePlayerProfile(int id) {
        repo.deleteById(id);
    }
}