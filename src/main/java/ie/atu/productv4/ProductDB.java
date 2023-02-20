package ie.atu.productv4;

public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = (Productable) myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = (Productable) myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = (Productable) myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = (Productable) mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = (Productable) mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = (Productable) mySoftware;
        }

        if (productCode.equalsIgnoreCase("lab"))
        {
            Dog myDog = new Dog();
            myDog.setVaccination("Yes");
            myDog.setShedding("normal");
            myDog.setPrice(1000.00);
            myDog.setNeutered("No");
            myDog.setType("average");
            myDog.setAge(6);
            myDog.setBreed("Labrador Retriever");
            p = myDog;
        } else if (productCode.equalsIgnoreCase("ger")) {
            Dog myDog = new Dog();
            myDog.setVaccination("No");
            myDog.setShedding("slow");
            myDog.setPrice(800.00);
            myDog.setNeutered("Yes");
            myDog.setType("average");
            myDog.setAge(2);
            myDog.setBreed("German wirehaired pointer");
            p = myDog;
        } else if (productCode.equalsIgnoreCase("cav")) {
            Dog myDog = new Dog();
            myDog.setVaccination("Yes");
            myDog.setShedding("fast");
            myDog.setPrice(1800.00);
            myDog.setNeutered("Yes");
            myDog.setType("small");
            myDog.setAge(8);
            myDog.setBreed("Cavalier king charles spaniel");
            p = myDog;
        }

        if (productCode.equalsIgnoreCase("app"))
        {
            Horse myHorse = new Horse();
            myHorse.setDam("horse");
            myHorse.setSire("horse");
            myHorse.setPrice(2400.00);
            myHorse.setHeight(210.19);
            myHorse.setType("big");
            myHorse.setAge(20);
            myHorse.setBreed("Appaloosa");
            p = myHorse;
        } else if (productCode.equalsIgnoreCase("ara")) {
            Horse myHorse = new Horse();
            myHorse.setDam("ponie");
            myHorse.setSire("horse");
            myHorse.setPrice(1200.00);
            myHorse.setHeight(170.43);
            myHorse.setType("average");
            myHorse.setAge(14);
            myHorse.setBreed("Arabian");
            p = myHorse;
        } else if (productCode.equalsIgnoreCase("bel")) {
            Horse myHorse = new Horse();
            myHorse.setDam("mule");
            myHorse.setSire("donkey");
            myHorse.setPrice(350.00);
            myHorse.setHeight(127.18);
            myHorse.setType("small");
            myHorse.setAge(4);
            myHorse.setBreed("Belgian");
            p = myHorse;
        }
        return p;
    }
}
