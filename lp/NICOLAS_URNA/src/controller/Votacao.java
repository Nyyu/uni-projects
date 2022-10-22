package controller;
import views.Contagem;

interface IVotacao {
    public void setVotes(Person person, int totalVotes);
    public int getVotes(Person person);
    public void incrementVotes(Person person, int amount);
}

public class Votacao implements IVotacao {
    public void setVotes(Person person, int totalVotes) {
       person.setVotes(totalVotes);
    }
    
    public void incrementVotes(Person person, int amount) {
       int totalVotes = person.getVotes();
       person.setVotes((totalVotes + amount));
    }

    public int getVotes(Person person) {
        return person.getVotes();
    }
}
