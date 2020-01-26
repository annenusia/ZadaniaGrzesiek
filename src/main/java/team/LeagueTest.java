package team;

public class LeagueTest {

    public static void main(String[] args) {

        Team footballT1 = new FootballTeam("Biali");
        Team footballT2 = new FootballTeam("Czarni");
        Team footballT3 = new FootballTeam("Czerwoni");
        Team footballT4 = new FootballTeam("Czerwoni");

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

        League footballLeague = new League("TopColor");
        League volleyballLeague = new League("TopHarvest");

        footballLeague.addTeamToLeague(footballT1);
        footballLeague.addTeamToLeague(footballT2);
        footballLeague.addTeamToLeague(footballT3);
        footballLeague.addTeamToLeague(footballT4);
        volleyballLeague.addTeamToLeague(volleyballT1);
        volleyballLeague.addTeamToLeague(volleyballT2);
        volleyballLeague.addTeamToLeague(volleyballT3);

        volleyballLeague.printTable();





    }
}
