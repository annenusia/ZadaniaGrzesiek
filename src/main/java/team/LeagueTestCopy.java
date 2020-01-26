package team;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeagueTestCopy {

    public static void main(String[] args) {

        FootballTeam footballT1 = new FootballTeam("Biali");
        FootballTeam footballT2 = new FootballTeam("Czarni");
        FootballTeam footballT3 = new FootballTeam("Czerwoni");
        FootballTeam footballT4 = new FootballTeam("Niebiescy");

        VolleyballTeam volleyballT1 = new VolleyballTeam("Kwiatki");
        VolleyballTeam volleyballT2 = new VolleyballTeam("Trawa");
        VolleyballTeam volleyballT3 = new VolleyballTeam("Drzewa");

        footballT1.setPoints(52);
        footballT2.setPoints(25);
        footballT3.setPoints(51);
        footballT4.setPoints(1);

        volleyballT1.setPoints(85);
        volleyballT2.setPoints(57);
        volleyballT3.setPoints(15);

        LeagueCopy <FootballTeam> footballLeague = new LeagueCopy("TopColor");
        LeagueCopy <VolleyballTeam> volleyballLeague = new LeagueCopy("TopHarvest");

        footballLeague.addTeamToLeague(footballT1);
        footballLeague.addTeamToLeague(footballT2);
        footballLeague.addTeamToLeague(footballT3);
        footballLeague.addTeamToLeague(footballT4);
        volleyballLeague.addTeamToLeague(volleyballT1);
        volleyballLeague.addTeamToLeague(volleyballT2);
        volleyballLeague.addTeamToLeague(volleyballT3);

//        volleyballLeague.printTable();

        footballLeague.printTable();

        System.out.println("------------------");

        for (FootballTeam footballTeam : footballLeague.getTeams()) {
            System.out.println(footballTeam.getName());
        }

        System.out.println("=================");
        System.out.println("Stream print");
        footballLeague.getTeams().stream().forEach((t -> System.out.println(t.getName())));

        System.out.println("=================");
        System.out.println("Stream print2 witch maping teams to names");
        footballLeague.getTeams().stream().map(x -> x.getName()).forEach(x -> System.out.println(x));

        System.out.println("===================");
        System.out.println("Stream print with maping teams to points v2");
        footballLeague.getTeams().stream().map(x -> x.getPoints()).forEach(System.out::println);

        System.out.println("====================");
        System.out.println("Stream print with maping teams to points v3");
        footballLeague.getTeams().stream().map(Team::getPoints).forEach(System.out::println);

        System.out.println("===================");
        System.out.println("Stream print with maping teams to names where points >10");
        footballLeague.getTeams().stream().filter(x -> x.getPoints() >10).map(Team::getName)
                .forEach(System.out::println);

        System.out.println("===================");
        System.out.println("Stream print with maping teams to names where points >10");
        List<FootballTeam> teamCopy = footballLeague.getTeams().stream().
                filter(x -> x.getPoints() >10).
                collect(Collectors.toList());

       teamCopy.stream().forEach(x -> System.out.println(x.getName() + " " + x.getPoints()));



       //łączenie strumieni
        List<FootballTeam> teamCopy2 = footballLeague.getTeams();
        System.out.println("====================");
       List <FootballTeam> teamConcat =  Stream.concat(teamCopy.stream(),
               teamCopy2.stream()).collect(Collectors.toList());

       teamConcat.stream().forEach(x -> System.out.println(x.getName() + " " + x.getPoints()));


       List <FootballTeam> teamConcat2 = Stream.of(teamCopy, teamCopy2). flatMap(Collection::stream).
               collect(Collectors.toList());

       //Lista nazw drużyn z listy drużyn

        List <String> teamNames = teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toList());

        Set<String> teamNamesSet = teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toSet());
        System.out.println("============ListPrint======================");
        teamNames.stream().forEach(System.out::println);
        System.out.println("============SetPrint======================");
        teamNamesSet.stream().forEach(System.out::println);

        System.out.println("Wydruk tabeli przez stream");
        footballLeague.printTableByStream();
        volleyballLeague.printTableByStream();

        //Wyciąganie pojedynczych wartosci ze stream

        int sumPoints = footballLeague.getTeams().stream()
                .map(Team::getPoints)
                .reduce(0, Integer::sum);

        System.out.println("Suma punktów: ");
        System.out.println(sumPoints);

        //zliczanie elementów
        System.out.println("Suma elementów w footballLeague");

        long countElements = footballLeague.getTeams().stream()
                .map(Team::getPoints)
                .count();

        System.out.println(countElements);

        countElements = footballLeague.getTeams().stream().count();

        System.out.println(countElements);

        System.out.println("-------");
        System.out.println("Suma elementów z punktami mniej niż 8 v2");
        countElements = footballLeague.getTeams().stream()
                .filter(x -> x.getPoints() < 8)
                .count();
        System.out.println(countElements);

            //suma punktów drużyn mających co najmniej 10 punktów
        System.out.println("=====================");
        System.out.println("Suma punktów drużyn, mających co najmniej 10 punktów");

        sumPoints = footballLeague.getTeams().stream()
                .filter(x -> x.getPoints() > 10)
                .map(Team::getPoints)
                .reduce(0, Integer::sum);

        System.out.println(sumPoints);


        Integer max = footballLeague.getTeams().stream()
                .mapToInt( t -> t.getPoints())
                .max()
                .orElse (new Integer(0));

        Team teamExpected = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                        .orElseThrow(NoSuchElementException::new);
        System.out.println("max from team : " + teamExpected.getPoints());

        Integer max2 = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints)
                .orElseThrow(NoSuchElementException::new);

        System.out.println("max2 : " + max2);

        Optional<Integer> max3 = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints);
        if(max3.isPresent()) System.out.println("max3: " + max3);




        }
    }


