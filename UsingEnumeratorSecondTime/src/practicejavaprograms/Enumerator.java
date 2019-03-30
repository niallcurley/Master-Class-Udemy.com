package practicejavaprograms;

public enum Enumerator {



    Skoda ("Octavia", "1998"),
    Ford ("Feista", "2001"),
    Fiat ("Punto", "1999"),
    Citreon ("clio", "2009"),
    Vauxhall ("Cavelier", "2014"),
    Toyota ("Corolla", "2018"),
    Nissan ("Cherry", "2010"),
    Mazda ("Xedos", "2000"),
    Honda ("Verno", "1997");


    private final String carType;
    private final String year;

    Enumerator(String carType, String year) {
        this.carType = carType;
        this.year = year;
    }

    public String getCarType() {

        return carType;
    }

    public String getYear() {
        return year;
    }


}
