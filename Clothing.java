// Clothing class
public class Clothing extends Product implements Discountable {
    private Size size;
    private String material;
    
    public Clothing(String name, double price, Size size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getCategory() {
        return "Clothing";
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
               "\nSize: " + size + 
               "\nMaterial: " + material;
    }
}