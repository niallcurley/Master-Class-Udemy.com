package practicejavaprograms;

public class Main {

    public enum Company {//enum class created
        EBAY, PAYPAL, GOOGLE, YAHOO, ATT
    }

    Company cName;//variable created from object Class Company

    public Main(Company cName) {//constructor created for parametre to be inserted Company cName
        this.cName = cName;
    }

    public void companyDetails() {//method to contain switch statements
        switch (cName) {
            case EBAY:
                System.out.println("Biggest Market Place in the World.");
                break;

            case PAYPAL:
                System.out.println("Simplest way to manage Money.");
                break;

            case GOOGLE:
                System.out.println("The best company in the world");
            case YAHOO:
                System.out.println("1st Web 2.0 Company.");
                break;

            default:
                System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
                break;
        }
    }

    public static void main(String[] args) {
        Main ebay = new Main(Company.EBAY);
        ebay.companyDetails();
        Main paypal = new Main(Company.PAYPAL);
        paypal.companyDetails();
        Main google = new Main(Company.GOOGLE);
        google.companyDetails();
        Main yahoo = new Main(Company.YAHOO);
        yahoo.companyDetails();
        Main att = new Main(Company.ATT);
        att.companyDetails();
    }
}
