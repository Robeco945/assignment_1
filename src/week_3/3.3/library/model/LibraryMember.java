package model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int ID;
    public String[] borrowed;

    public LibraryMember(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }
    public int ID(){
        return ID;
    }
    public String[] getBorrowed(){
        return borrowed;
    }
}
