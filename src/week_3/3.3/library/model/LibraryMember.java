package model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int ID;
    public ArrayList<String> borrowed;
    public ArrayList<String> reserved;

    public LibraryMember(String name, int ID){
        this.name = name;
        this.ID = ID;
        borrowed = new ArrayList<>();
        reserved = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public ArrayList<String> getBorrowed(){
        return borrowed;
    }
    public ArrayList<String> getReserved(){
        return reserved;
    }
}
