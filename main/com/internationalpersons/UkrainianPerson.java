package main.com.internationalpersons;

import main.com.interfaces.Country;

public class UkrainianPerson extends Person implements Country {
    public String personName() {
        return "Антонина";
    }

    public String getDescription(){
        return super.getDescription() + personName() + ". Моя страна - " + Country.UKRAINE + ". Я горжусь своей страной";
    }
}