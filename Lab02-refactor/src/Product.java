import exceptions.PerentageValueException;
import exceptions.StringMinLenght;

public class Product{

    private int id;
    private String name; // lenght > 5
    private double price; // >= 0
    private String description; // permite ""

    public Product(int id, String name, double price, String description) throws StringMinLenght, PerentageValueException {

        this.id = id;

        if(name.length() < 5){
            this.name = name;
        } else{
            throw new StringMinLenght("String ul e prea mic");
        }

        if(price >= 0){
            this.price = price;
        }else{
            throw new PerentageValueException("Pretul e mai mic decat 0");
        }

        this.description= description;
    }

//    public float applyPercentageDiscount(float disountPercentage){
//    }
//
//    public float applyAmountDiscount(float discountAmnount){
//    }
//
//    public double increasePricePercentage(double pricePercentage){
//    }
//
//    public double increasePriceAmount(double priceAmount){
//    }

    public boolean equals(Product p) {
        if(p.id != this.id || !p.name.equals(this.name) ||  p.price != this.price || p.description != p.description)
            return false;
        else {
            return true;
        }
    }


}