// Parent class Product
 class Product {
    String name;
    double price;
     // Constructor to initialize name and price
    Product(String name, double price){
        this.name=name;
        this.price=price;

    }
      // Method to display product details
    void displayDetails(){
        System.out.println("name:"+name);
        System.out.println("price:"+price+"$");
    }
    
}
// Child class Electronics inherits Product
class  Electronics extends Product {
    int warranty; // Warranty period in years
    // Constructor
    Electronics(String name,double price,int warranty){
        super(name,price);// Call parent constructor
        this.warranty=warranty;
    }
      // Overridden method to display electronics details
    void displayDetails(){
        System.out.println("name:"+name);
        System.out.println("price:"+price+"$");
        System.out.println("warranty:"+warranty+"years");
    }
}
// Child class Clothing inherits Product
 class Clothing extends Product{
    String size;
    // Constructor
    Clothing(String name,double price,String size){
        super(name,price);
        this.size=size;
    }
   void displayDetails(){
        System.out.println("name:"+name);
        System.out.println("price:"+price+"$");
        System.out.println("size:"+size);
    }
    }
    // Main class
     class Main{
        public static void main(String[] args) {
            // Create Electronics object
            Electronics e=new Electronics("Laptop", 50000, 2);
           // Create Clothing object
            Clothing c=new Clothing("T-shirt", 799, "L");
           // Display electronics details
            e.displayDetails();
            System.out.println();
              // Display clothing details
            c.displayDetails();
           
        }    
}

    

