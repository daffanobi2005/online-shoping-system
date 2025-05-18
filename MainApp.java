// MainApp class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        
        // Membuat objek Electronics
        products.add(new Electronics("MacBook Pro", 20000000, 1.5, "Apple"));
        products.add(new Electronics("Galaxy S21", 12000000, 0.2, "Samsung"));
        products.add(new Electronics("Smart TV", 5000000, 8.5, "LG"));
        
        // Membuat objek Clothing
        products.add(new Clothing("Cotton T-Shirt", 150000, Size.M, "Cotton"));
        products.add(new Clothing("Slim Fit Jeans", 350000, Size.L, "Denim"));
        products.add(new Clothing("Winter Jacket", 750000, Size.XL, "Wool"));
        
        while (true) {
            // Menampilkan menu
            System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");
            System.out.println("1. Tampilkan semua produk");
            System.out.println("2. Pilih produk untuk melihat detail");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid!");
                continue;
            }
            
            switch (choice) {
                case 1:
                    displayAllProducts(products);
                    break;
                case 2:
                    selectAndDisplayProduct(scanner, products);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    
    // Method untuk menampilkan daftar semua produk
    private static void displayAllProducts(List<Product> products) {
        System.out.println("\n===== DAFTAR PRODUK =====");
        System.out.println("No. | Nama Produk           | Kategori     | Harga");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.printf("%-3d | %-22s | %-12s | Rp %,d%n", 
                i + 1, p.getName(), p.getCategory(), (int)p.getPrice());
        }
    }
    
    // Method untuk memilih dan menampilkan detail produk
    private static void selectAndDisplayProduct(Scanner scanner, List<Product> products) {
        displayAllProducts(products);
        
        System.out.print("\nPilih nomor produk (1-" + products.size() + "): ");
        try {
            int productNum = Integer.parseInt(scanner.nextLine());
            
            if (productNum > 0 && productNum <= products.size()) {
                System.out.println("\n===== DETAIL PRODUK =====");
                printProductInfo(products.get(productNum - 1));
            } else {
                System.out.println("Nomor produk tidak valid!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Masukkan angka yang valid!");
        }
    }
    
    // Method untuk mencetak informasi produk
    private static void printProductInfo(Product product) {
        System.out.println(product.toString());
        
        // Cetak harga setelah diskon 10% jika product adalah Discountable
        if (product instanceof Discountable) {
            Discountable discountable = (Discountable) product;
            double discountedPrice = discountable.getDiscountedPrice(10);
            System.out.printf("Price after 10%% discount: Rp %,.2f%n", discountedPrice);
        }
    }
}