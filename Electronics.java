// Electronics class
public class Electronics extends Product implements Discountable {
    // Inner class Specification
    public static class Specification {
        private double weight;
        private String brand;
        
        public Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }
        
        public double getWeight() {
            return weight;
        }
        
        public String getBrand() {
            return brand;
        }
        
        @Override
        public String toString() {
            return "Brand: " + brand + ", Weight: " + weight + " kg";
        }
    }
    
    private Specification specs;
    
    public Electronics(String name, double price, double weight, String brand) {
        super(name, price);
        this.specs = new Specification(weight, brand);
    }
    
    public Specification getSpecs() {
        return specs;
    }
    
    @Override
    public String getCategory() {
        return "Electronics";
    }
    
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }
        return getPrice() * (1 - discountPercentage / 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nSpecifications: " + specs.toString();
    }
}