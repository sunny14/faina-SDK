package faina.sdk.entity;

import faina.sdk.enums.Race;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {

    private @Id @GeneratedValue(strategy= GenerationType.SEQUENCE) Long id;

    private String name;
    private String realm;
    private Gender gender;
    private Race race;

    public Character() {
    }

    public Character(String name, Race race) {
        this.name = name;
        this.race = race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getRealm() {
        return realm;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }

    public Long getId() {
        return id;
    }
}

enum Gender {
    MALE,
    FEMALE
}