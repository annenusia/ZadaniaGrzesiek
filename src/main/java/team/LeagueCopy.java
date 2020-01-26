package team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueCopy<T extends Team> {

    private String name;
    private List<T> teams;

    public LeagueCopy(String name) {
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
            System.out.println("Drużyna " + team.getName() +
                    " została dodana do listy");
            return teams.add(team);
        }
        System.out.println("Drużyna już istnieje w lidze");
        return false;
    }

    public void printTable() {
        Collections.sort(teams);
        System.out.println(name + " table:");
        for (T team : teams) {
            System.out.println(team.getName() + " " + team.getPoints());

        }}

        public void printTableByStream(){
            Collections.sort(teams);
            System.out.println(name + " table:");
           teams.stream().forEach(x -> System.out.println(x.getName() + " " + x.getPoints()));
            }

    }



