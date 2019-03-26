package main.com.internationalpersons;

import main.com.interfaces.Country;

public class BelarusianPerson extends Person implements Country {
    public String personName() { return "Андроник"; }
    public String getDescription(){
        return super.getDescription() + personName() + ". Моя страна - " + Country.BELARUS + ". Я горжусь своей страной";
    }

}
