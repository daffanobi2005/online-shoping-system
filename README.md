# online-shoping-system

## Deskripsi
Proyek **OnlineShoppingSystem2** adalah simulasi sistem belanja online sederhana yang dirancang menggunakan prinsip-prinsip **Pemrograman Berorientasi Objek (OOP)** dalam bahasa **Java**. Sistem ini dibuat untuk memberikan gambaran bagaimana sebuah aplikasi e-commerce dapat mengelola berbagai jenis produk, menerapkan diskon, dan menampilkan informasi secara terstruktur tanpa menggunakan perulangan (loop).

Dalam proyek ini, terdapat dua jenis produk utama: **Elektronik** dan **Pakaian**, masing-masing diturunkan dari kelas induk abstrak `Product`. Kedua jenis produk ini mengimplementasikan interface `Discountable`, yang memungkinkan setiap produk menghitung harga akhir setelah potongan harga 10%.

Beberapa fitur OOP yang diimplementasikan dalam proyek ini mencakup:

- **Abstraction & Inheritance**: `Product` sebagai superclass menyediakan struktur umum untuk semua jenis produk.
- **Interface**: `Discountable` mendefinisikan kontrak untuk perhitungan diskon.
- **Polymorphism**: Digunakan dalam pemanggilan method yang berasal dari superclass dan interface.
- **Inner Class**: Diterapkan dalam `Electronics.java` untuk mengelola informasi garansi produk.
- **Enum**: Digunakan dalam `Clothing.java` untuk mendefinisikan ukuran pakaian (S, M, L, XL).
- **Tanpa Loop**: Semua produk ditampilkan satu per satu tanpa menggunakan struktur pengulangan, sesuai instruksi tugas.

Tujuan dari proyek ini adalah untuk menunjukkan kemampuan mahasiswa dalam:
- Mendesain struktur kelas berbasis kebutuhan sistem.
- Menerapkan konsep OOP secara konsisten dan tepat.
- Menulis kode Java yang bersih dan terstruktur tanpa penggunaan loop.
- Mendokumentasikan dan menjelaskan sistem yang dibuat.

Proyek ini juga dilengkapi dengan dokumentasi internal (komentar kode) dan file README ini untuk menjelaskan arsitektur sistem serta informasi anggota kelompok.

---

## Struktur Direktori
OnlineShoppingSystem/
├── Product.java 
├── Electronics.java 
├── Clothing.java // 
├── Size.java //
├── Discountable.java // 
├── MainApp.java //
└── README.md //


---

## Penjelasan Program

- **Product.java**  
  Kelas abstrak yang menjadi induk semua produk. Menyediakan atribut dan method dasar seperti `category`, `info`, `createdAt`, dan `price`. Juga terdapat method untuk mencetak informasi umum produk.

- **Electronics.java**  
  Subclass dari `Product` khusus untuk produk elektronik. Menggunakan inner class `WarrantyInfo` untuk menyimpan detail garansi (durasi dan service center). Mengimplementasikan `Discountable` untuk perhitungan harga setelah diskon.

- **Clothing.java**  
  Subclass dari `Product` khusus untuk produk pakaian. Menambahkan atribut ukuran yang diatur melalui enum `Size`. Mengimplementasikan `Discountable` seperti pada `Electronics`.

- **Size.java**  
  Enum yang mendefinisikan pilihan ukuran pakaian: `S`, `M`, `L`, dan `XL`.

- **Discountable.java**  
  Interface yang mendeklarasikan method `getDiscountedPrice()`, yang harus diimplementasikan oleh semua kelas produk agar dapat menghitung harga setelah diskon.

- **MainApp.java**  
  Kelas utama tempat objek-objek `Electronics` dan `Clothing` dibuat dan informasinya ditampilkan tanpa menggunakan struktur pengulangan (tanpa `for`, `while`, atau sejenisnya).

---

## Contoh Output
Kategori: Electronics
Info: Smartphone Samsung Galaxy S22
Created at: 2025-05-19
Harga setelah diskon: Rp13.500.000

Kategori: Clothing
Info: Jaket Hoodie Polos (Size: L)
Created at: 2025-05-19
Harga setelah diskon: Rp270.000

## Nama kelomopok
1. Daffa Nobi Adi Pratama (50424290)
2. Embun Pagi Al Islam (50424370)
3. Muhammad Muflih (50424877)
4. Muhammad Riqy Faturrahman (50424944)
