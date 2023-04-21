package com.cc.java;

public class Mitarbeiter {
    
    private String name;
    private String firstName;
    private String role;
    private int entryYear;

      public Mitarbeiter(String name, String firstName, String role, int entryYear) {
        this.name = name;
        this.firstName = firstName;
        this.role = role;
        this.entryYear = entryYear;
      }

      void getInfo(Mitarbeiter mitarbeiter)
      { 
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Vorname: " + firstName);
        System.out.println("Rolle: " + role);
        System.out.println("Eintrittsjahr: " + entryYear);
        System.out.println();
    }

    // public void getInfo() {
    // }

}

  
    
