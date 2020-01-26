package team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueT<T> {

    private String name;
    private List<T> teams;

    public LeagueT(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getTeams() {
        return teams;
    }

    private boolean isTeamOnTheList(T team) {
        return teams.indexOf(team) >= 0;
    }

    public boolean addTeamToLeague(T team) {
        if (!isTeamOnTheList(team)) {
            System.out.println("Drużyna " + ((Team) team).getName() +
                    " została dodana do listy");
            return teams.add(team);
        }
        System.out.println("Drużyna już istnieje w lidze");
        return false;
    }

    public void printTable() {
        Collections.sort((List<Team>) teams);
        System.out.println(name + " table:");
        for (T team : teams) {
            System.out.println(((Team) team).getName() + " " + ((Team) team).getPoints());

        }

    }
}


