package main.com.internationalpersons;

import main.com.interfaces.Country;

public class RussianPerson extends Person implements Country {
        public String personName() {
        return "Миша";
    }
            public String getDescription(){
            return super.getDescription() + personName() + ". Моя страна - " + Country.RUSSIA + ". Я горжусь своей страной";
    }
}
