import java.time.LocalDateTime;

// 1. Abstract class Product
public abstract class Product {
    private String name;
    private double price;
    private LocalDateTime createdAt;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.createdAt = LocalDateTime.now(); // Set otomatis saat objek dibuat
    }
    
    // Abstract method getCategory()
    public abstract String getCategory();
    
    // Getter dan setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    @Override
    public String toString() {
        return "Product: " + name + 
               "\nCategory: " + getCategory() + 
               "\nPrice: " + price + 
               "\nCreated At: " + createdAt;
    }
}