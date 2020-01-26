package team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
    private String name;
    private List<Team> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isTeamOnTheList(Team team) {
        return teams.indexOf(team) >= 0;
    }

    public boolean addTeamToLeague(Team team) {
        if (!isTeamOnTheList(team)) {
            System.out.println("Drużyna " + team.getName() +
                    " została dodana do listy");
            return teams.add(team);
        }
        System.out.println("Drużyna już istnieje w lidze");
        return false;
    }

    public void printTable(){
        Collections.sort(teams);
        System.out.println(name + " Lista: ");
        for (Team team : teams){
            System.out.println(team.getName() + " " + team.getPoints());
        }
    }

}
