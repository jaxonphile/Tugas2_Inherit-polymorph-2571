# Tugas 2 Praktikum Pemrograman Berorientasi Objek

* **Nama Lengkap:** Arienal Zacky Irfan
* **NPM:** 2571
* **Kelas:** PBO A
* **Tautan Repository:** [Tugas2_Inherit-polymorph-2571](https://github.com/username/Tugas2_Inherit-polymorph-2571)

---

## Deskripsi Singkat
Repository ini berisi implementasi solusi untuk Tugas 2 Praktikum Pemrograman Berorientasi Objek. Praktikum ini berfokus pada penguasaan konsep dasar hingga tingkat lanjut mengenai *Inheritance*, *Composition*, *Polymorphism*, urutan pemanggilan *Constructor*, penanganan *Aliasing* dengan *Defensive Copy*, serta kepatuhan pada standar kualitas kode berstandar industri.

---

## Fitur Utama

### Soal 1: Hierarki Perangkat Elektronik
* Menghitung tarif pajak perangkat elektronik sebesar 10% secara terpusat.
* Mengkalkulasi harga diskon khusus produk Laptop dengan memanfaatkan hak akses `protected`.
* Pemanggilan konstruktor berantai (*constructor chaining*) menggunakan `super(...)` pada subclass (`Laptop`, `Ponsel`, `LaptopGaming`).
* Perluasan informasi objek secara polimorfik tanpa duplikasi kode melalui `super.infoSingkat()`.

### Soal 2: Analisis Output, Error, dan Polimorfisme
* Simulasi dynamic method binding dan pemanggilan polymorphic method.
* Pengujian urutan eksekusi *constructor* pada hierarki pewarisan multi-tingkat.
* Pencegahan *runtime error* (`ClassCastException`) saat *downcasting* menggunakan operator `instanceof`.
* Penerapan *method overriding* pada hierarki `Lingkaran` dan `Titik`.

### Soal 3: Komposisi Titik dan Garis
* Menerapkan hubungan *Composition* (*has-a*) di mana kelas `Garis` tersusun dari dua objek `Titik`.
* Konstruktor *overloading* yang efisien menggunakan keyword `this(...)`.
* Pemanfaatan *delegasi method* (`getPanjang()` mendelegasikan penghitungan ke `Titik.jarakKe()`).
* Implementasi *Defensive Copy* pada konstruktor dan *getter/setter* untuk menjamin imutabilitas data internal dari ancaman *aliasing*.

---

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |
| :--- | :--- | :--- |
| **Inheritance (Is-A)** | `Laptop extends Perangkat`, `Kucing extends Hewan` | Memungkinkan subclass mewarisi atribut/method umum dari superclass untuk meminimalkan duplikasi kode. |
| **Encapsulation & Access Modifiers** | `protected double harga` pada `Perangkat`, `private Titik awal` pada `Garis` | Mengamankan atribut dari akses luar secara langsung sekaligus mengizinkan akses internal pada subclass. |
| **Composition (Has-A)** | Class `Garis` menyimpan atribut `private Titik awal, akhir` | Merepresentasikan hubungan kepemilikan struktur nyata (Garis memiliki Titik, bukan Garis adalah Titik). |
| **Polymorphism (Overriding)** | Method `infoSingkat()` di `LaptopGaming`, `luas()` di `Titik` | Memungkinkan pemanggilan method yang sama untuk menghasilkan perilaku spesifik berdasarkan tipe dinamis objek. |
| **Constructor Chaining** | Keyword `super(...)` pada `LaptopGaming`, `this(...)` pada `Garis` | Menjamin inisialisasi status objek induk atau konstruktor utama berjalan secara konsisten. |
| **Defensive Copy** | Constructor & Getter pada kelas `Garis` | Mencegah *side-effect* akibat mutasi objek referensi luar (*aliasing*). |

---

## Struktur Project

```text
Tugas2_Inherit-polymorph-2571/
├── bin/
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   └── soal3/
│       ├── Titik.java
│       ├── Garis.java
│       └── TesSoal3.java
├── .gitignore
└── README.md
```

---

## Prasyarat & Cara Menjalankan Program

### Prasyarat
* **Java Development Kit (JDK):** Versi 17 atau lebih baru.
* **IDE (Opsional):** IntelliJ IDEA / VS Code / Eclipse.

### Menjalankan via Terminal / Command Line

1. Buka terminal pada root folder repositori.
2. Kompilasi seluruh berkas Java ke folder `bin`:
   ```bash
   javac -d bin src/soal1/*.java src/soal2/*.java src/soal3/*.java
   ```
3. Jalankan masing-masing kelas pengujian:
   * **Eksekusi Soal 1:**
     ```bash
     java -cp bin soal1.TesSoal1
     ```
   * **Eksekusi Soal 2:**
     ```bash
     java -cp bin soal2.TesSoal2
     ```
   * **Eksekusi Soal 3:**
     ```bash
     java -cp bin soal3.TesSoal3
     ```

---

## Jawaban Soal dan Analisis Konsep

### Pertanyaan Tambahan Soal 1
> **Pertanyaan:** Ubah harga menjadi `private` lalu kompilasi. Salin pesan error yang muncul dan jelaskan mengapa error tersebut muncul.

* **Pesan Error Kompilasi:**
  ```text
  src/soal1/Laptop.java: error: harga has private access in Perangkat
          return this.harga * (1.0 - (diskonPersen / 100.0));
                     ^
  1 error
  ```
* **Penjelasan:** Error terjadi karena atribut dengan hak akses `private` hanya dapat diakses secara langsung dari dalam badan kelas tempat atribut tersebut dideklarasikan (yaitu kelas `Perangkat`). Meskipun `Laptop` adalah subclass dari `Perangkat`, `Laptop` tidak memiliki akses langsung ke atribut `private` milik induknya. Agar subclass dapat mengakses atribut secara langsung tanpa getter, atribut tersebut harus diberi hak akses `protected`.

---

### Jawaban Soal 2

#### Bagian A
1. **Output Lengkap Program (sebelum perbaikan error):**
   ```text
   Hewan dibuat: Tom
   Kucing dibuat
   Tom makan
   meong
   meong
   Tom memanjat
   Hewan dibuat: Generik
   Exception in thread "main" java.lang.ClassCastException: class soal2.Hewan cannot be cast to class soal2.Kucing
   	at soal2.TesSoal2.main(TesSoal2.java)
   ```

2. **Analisis jika komentar `h.panjat();` dihapus:**
   * **Tahap Error:** Kompilasi (*Compile-time Error*).
   * **Pesan Error:** `cannot find symbol / symbol: method panjat()`.
   * **Alasan:** Variabel `h` memiliki tipe statis `Hewan`. Pada tahap kompilasi, Java hanya memeriksa method yang terdaftar pada tipe statis variabel. Karena kelas `Hewan` tidak memiliki method `panjat()`, maka kompilator menolak kode tersebut meskipun tipe dinamisnya saat runtime adalah `Kucing`.

3. **Baris Penyebab ClassCastException & Perbaikannya:**
   * **Baris Penyebab:** `Kucing k2 = (Kucing) h2;`
   * **Perbaikan dengan `instanceof`:**
     ```java
     Hewan h2 = new Hewan("Generik");
     if (h2 instanceof Kucing) {
         Kucing k2 = (Kucing) h2;
         k2.panjat();
     } else {
         System.out.println("Downcasting gagal: h2 bukan instance dari Kucing");
     }
     ```

4. **Analisis Pemanggilan `suara()` pada `h.makan()`:**
   * Method `suara()` yang dieksekusi adalah milik kelas **`Kucing`**.
   * **Penjelasan (Tipe Statis vs Tipe Dinamis):** Tipe statis variabel `h` adalah `Hewan`, sedangkan tipe dinamis objek yang dirujuk di memori heap adalah `Kucing`. Di Java, pemanggilan method instance menggunakan *dynamic binding* (polimorfisme runtime). Saat `makan()` dipanggil dari `Hewan`, pemanggilan internal `suara()` dievaluasi berdasarkan tipe dinamis objek (`Kucing`), sehingga method `suara()` milik `Kucing` lah yang dieksekusi.

#### Bagian B
5. **Prediksi vs Hasil Eksekusi `new B();`:**
   * **Output Sebenarnya:**
     ```text
     A dibuat
     init B, nilai=0
     B dibuat, nilai=5
     ```
   * **Alasan `nilai` pada `init B` bernilai 0:**
     Saat `new B()` dieksekusi, konstruktor `A()` berjalan terlebih dahulu (`super()`). Dari dalam konstruktor `A()`, method `init()` dipanggil. Karena `init()` telah di-override di kelas `B`, maka `init()` milik `B` dieksekusi. Namun pada fase ini, inisialisasi atribut kelas `B` (`int nilai = 5`) **belum berjalan**, sehingga variabel `nilai` masih berisi nilai default tipe data primitif `int`, yaitu `0`.
   * **Risiko Pemanggilan Method Overridable dari Konstruktor:**
     Sangat berbahaya karena method hasil override dapat mengakses atribut subclass yang **belum selesai diinisialisasi**, sehingga berpotensi menyebabkan bug logika atau `NullPointerException`.

#### Bagian C
6. **Analisis `l3.luas()` dan Evaluasi Relasi Is-A:**
   * **Mengapa `l3.luas()` bernilai 0.0:** Pemanggilan `l3.luas()` mengeksekusi method `luas()` milik kelas `Titik` karena tipe dinamis objek `l3` adalah `Titik` (polimorfisme).
   * **Kevalidan Relasi Is-A:** "Titik adalah sebuah Lingkaran" **tidak masuk akal** secara konsep domain geometri. Lingkaran mendefinisikan bidang 2D dengan luas dan keliling berbasis jari-jari, sedangkan Titik hanya menyatakan posisi koordinat tanpa dimensi.
   * **Konsekuensi Desain:** Jika suatu method mengharapkan objek `Lingkaran` dan berasumsi luasnya selalu $> 0$, melewatkan objek `Titik` akan merusak asumsi *pre-condition* program dan melanggar *Liskov Substitution Principle (LSP)*.

---

### Jawaban Soal 3

1. **Prediksi & Hasil Eksekusi Baris Kedua (sebelum Defensive Copy):**
   * **Hasil:** `(100.0, 1.0)-(5.0, 5.0)`
   * **Penyebab:** Konstruktor `Garis` menyimpan referensi objek `Titik` secara langsung. Akibatnya, variabel `t` di `main` dan atribut `awal` pada objek `g2` menunjuk ke alokasi memori yang sama (*aliasing*). Saat `t.setX(100)` dipanggil, data di dalam `g2` ikut berubah.

2. **Hasil Eksekusi Setelah Perbaikan (dengan Defensive Copy):**
   * **Hasil:** `(1.0, 1.0)-(5.0, 5.0)`
   * **Penjelasan:** Konstruktor dan getter/setter `Garis` telah diperbaiki untuk membuat instansiasi objek `Titik` baru (`new Titik(...)`). Perubahan pada variabel `t` di luar tidak lagi memengaruhi status internal `g2`.

3. **Kapan Menggunakan / Tanpa Defensive Copy:**
   * **Dengan Defensive Copy:** Tepat digunakan saat kita membutuhkan **enkapsulasi ketat** dan **imutabilitas**, sehingga objek internal terjamin aman dari efek samping (*side-effect*) perubahan kode luar.
   * **Tanpa Defensive Copy (Shared Reference):** Tepat digunakan pada sistem yang membutuhkan **pembaruan data terpusat (real-time update)**, di mana beberapa komponen harus merefleksikan perubahan status dari objek acuan yang sama secara otomatis.

4. **Masalah Desain Jika `Garis extends Titik`:**
   * **Pelanggaran Relasi:** Terjadi kesalahan konsep relasi. Garis **bukanlah** sebuah Titik (*is-a*), melainkan Garis **memiliki** Titik (*has-a*).
   * **Pencemaran Interface (Interface Pollution):** Kelas `Garis` akan mewarisi method `setX()` dan `setY()` yang tidak relevan (karena Garis memiliki dua titik, bukan satu). Hal ini membingungkan pengguna kelas dan merusak enkapsulasi.

---

## Batasan dan Pengembangan Lanjutan
* Pengujian saat ini berfokus pada skenario pada kelas uji `TesSoal1`, `TesSoal2`, dan `TesSoal3`.
* Pengerjaan Soal 4 (Mini Project Toko Digital) dan analisis konsep akhir akan diintegrasikan pada tahap berikutnya.