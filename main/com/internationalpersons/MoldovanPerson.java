package main.com.internationalpersons;

        import main.com.interfaces.Country;

public class MoldovanPerson extends Person implements Country {
    public String personName() {
        return "Барбара";
    }

    public String getDescription(){
        return super.getDescription() + personName() + ". Моя страна - " + Country.MOLDOVA + ". Я горжусь своей страной";
    }
}
