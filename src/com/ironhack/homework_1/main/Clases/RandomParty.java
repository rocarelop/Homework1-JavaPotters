package com.ironhack.homework_1.main.Clases;

public class RandomParty extends Party{
    public RandomParty(int numMembersParty) {
        super(numMembersParty);
        numWarriorsMax = (int)(Math.random()*numMembersParty);
        numWizardsMax = numMembersParty - numWarriorsMax;
    }


}
