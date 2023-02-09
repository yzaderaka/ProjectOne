package Class20;

public class Sport {
    String name;
    String country;
    Sport( String name, String country){
        this.name=name;
        this.country=country;
    }
    public void display(){
        System.out.println(name+" is played in "+country);
    }
}
class Cricket extends Sport{
    String helmet;
    Cricket(String name, String country, String helmet){
        super(name, country);
        this.helmet=helmet;
    }
}

class Soccer extends Sport{
    String team;
    int numOfPlayers;
    Soccer(String name, String country, String team, int numOfPlayers){
        super(name, country);
        this.team=team;
        this.numOfPlayers=numOfPlayers;
    }
    void displayTeam(){
        System.out.println(team+" consist of "+numOfPlayers+" players");
    }
}
