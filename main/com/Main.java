package main.com;

import main.com.internationalpersons.*;
import main.com.interfaces.Country;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Здравствуйте! Введите одну из стран и представитель своей страны сообщит Вам то, чем гордится!");
        System.out.println("Доступный список стран: Беларусь, Молдовия, Украина, Россия");
        String Strana = reader.readLine();
        if(Strana.equals("Беларусь")|| Strana.equals("беларусь")) {
        Person person = Society.getPerson(Country.BELARUS);
        person.personName();
        System.out.println(person.getDescription());
        }
        else if(Strana.equals("Молдовия")|| Strana.equals("молдовия")) {
        Person person = Society.getPerson(Country.MOLDOVA);
        person.personName();
        System.out.println(person.getDescription());
        }
        else if(Strana.equals("Украина")|| Strana.equals("украина")) {
        Person person = Society.getPerson(Country.UKRAINE);
        person.personName();
        System.out.println(person.getDescription());
        }
        else if(Strana.equals("Россия")|| Strana.equals("россия")) {
        Person person = Society.getPerson(Country.RUSSIA);
        person.personName();
        System.out.println(person.getDescription());
        }
        else {
            System.out.println("Страна недоступна");
            System.out.println("Доступный список стран: Беларусь, Молдовия, Украина, Россия");
        }

    }

    static class Society {

        static Person getPerson(String country) {
            Person pers = null;

            if (country.equals(Country.BELARUS)) {
                pers = new BelarusianPerson();
            }
            else if (country.equals(Country.MOLDOVA)) {
                pers = new MoldovanPerson();
            }
            else if (country.equals(Country.UKRAINE)) {
                pers = new UkrainianPerson();
            }
            else if (country.equals(Country.RUSSIA)) {
                pers = new RussianPerson();
            }
            return pers;
        }
    }
}

