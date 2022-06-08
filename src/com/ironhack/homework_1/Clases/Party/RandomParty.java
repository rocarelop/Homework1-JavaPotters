package com.ironhack.homework_1.Clases.Party;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Properties.RandomProperties;

public class RandomParty extends Party{
    public RandomParty(int numMembersParty, String nameTeam) {
        super(numMembersParty, nameTeam);
        int numWarriorsMax = (int)(Math.random()*numMembersParty);
        int numWizardsMax = numMembersParty - numWarriorsMax;

        for(int i=0; i<numWarriorsMax; i++){
            Warrior warrior = RandomProperties.createRandomWarrior();
            addWarrior(warrior);
            //warrior.toString();
        }

        for(int i=0; i<numWizardsMax; i++){
            Wizard wizard = RandomProperties.createRandomWizard();
            addWizard(wizard);
            //wizard.toString();
        }
        System.out.println("Random party creada exitosamente");

    }


}
