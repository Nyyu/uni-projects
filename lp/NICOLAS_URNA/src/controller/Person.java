/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

interface IPerson {
    public int getId();
    public void setId(int id);
    
    public int getVotes();
    public void setVotes(int votes);

    public String getName();
    public void setName(String name);
}

public class Person implements IPerson {

    int id;
    String name;
    int votes;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getVotes() {
        return votes;
    }

    @Override
    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
