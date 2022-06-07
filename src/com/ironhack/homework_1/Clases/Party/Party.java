package com.ironhack.homework_1.Clases.Party;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.ArrayList;
import java.util.List;

public abstract class Party {

    int numMembersParty;
    protected static List<Character> party;
    private String nameParty;

    public Party(int numMembersParty, String nameParty) {
        this.numMembersParty = numMembersParty;
        this.nameParty = nameParty;
        party = new ArrayList<Character>();
    }

    public void addWizard(Wizard wizard){
        if(party.size()< numMembersParty){
            party.add(wizard);
            numMembersParty++;
        }
        else {
            System.out.println("Party llena");
        }
    }

    public void addWarrior(Warrior warrior){
        if(party.size()< numMembersParty){
            party.add(warrior);
            numMembersParty++;
        }
        else {
            System.out.println("Party llena");
        }
    }

    public void printParty(){
        for(Character i: party){
            i.toString();
        }
    }

}
