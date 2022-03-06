package faina.sdk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long _id;
    private String name;
    private Integer runtimeInMinutes;
    private Integer budgetInMillions;
    private Integer boxOfficeRevenueInMillions;
    private Integer academyAwardNominations;
    private Integer academyAwardWins;
    private Integer rottenTomatoesScore;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public Long get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public Integer getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public Integer getBudgetInMillions() {
        return budgetInMillions;
    }

    public Integer getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public Integer getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public Integer getAcademyAwardWins() {
        return academyAwardWins;
    }

    public Integer getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }
}
