# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiLanjutan`, dan `PegawaiBeraksi` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiLanjutan extends Pegawai {
    ...
}

public class PegawaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pgw[i] = new PegawaiLanjutan(namapegawai, nikpegawai);` adalah contoh pembuatan object.

```bash
pgw[i] = new PegawaiLanjutan(namapegawai, nikpegawai);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namapegawai` dan `nikpegawai` adalah contoh atribut.

```bash
String namapegawai;
String nikpegawai;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan `PegawaiLanjutan`.

```bash
public Pegawai(String namapegawai, String nikpegawai) {
    this.namapegawai = namapegawai;
    this.npm = nikpegawai;
}

public PegawaiLanjutan(String namapegawai, String nikpegawai) {
    super(namapegawai, nikpegawai);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPegawai` dan `setNikPegawai` adalah contoh method mutator.

```bash
public void setNamaPegawai(String namapegawai) {
    this.namapegawai = namapegawai;
}

public void setNikPegawai(String nikpegawai) {
    this.nikpegawai = nikpegawai;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPegawai`, `getNikPegawai`, `getTahunMasuk`, `getJabatan`, `getJenisKelamin`, `getNoKeanggotan` adalah contoh method accessor.

```bash
public String getNamaPegawai() {
    return namapegawai;
}

public String getNikPegawai() {
    return nikpegawai;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namapegawai` dan `nikpegawai` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namapegawai;
private String nikpegawai;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PegawaiLanjutan` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class PegawaiLanjutan extends Mahasiswa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `pegawaiInfo(String)` di `Pegawai` merupakan overloading method `pegawaiInfo` dan `pegawaiInfo` di `PegawaiLanjutan` merupakan override dari method `pegawaiInfo` di `Pegawai`.

```bash
public String pegawaiInfo(String nik) {
    return pegawaiInfo() + "\nNik: " + nik;
}

@Override
public String pegawaiInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJabatan` dan seleksi `switch` dalam method `getJenisKelamin`.

```bash
public String getJabatan() {
    if(getNikPegawai().substring(2, 4).equals("10")){
        return "Karyawan";
    } else {
        return "yang lain";
    }

    //return getNikPegawai().substring(2, 4).equals("10") ? "Karyawan" : "yang lain";
}

public String getJenisKelamin() {
    switch(getNikPegawai().substring(4, 6)) {
        case "01":
            return "Laki-laki";
        case "02":
            return "Perempuan";
        default:
            return "Kalo ada yang lain berati aneh";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < pgw.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pegawai ke-" + (i + 1) + ": ");
String namapegawai = scanner.nextLine();

System.out.println("\nData Pegawai:");
System.out.println(data.pegawaiInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
PegawaiLanjutan[] pgw = new PegawaiLanjutan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
            System.out.println("Terjadi Kesalahan dalam memasukkan nomor: "+e.getMessage());
 } catch (StringIndexOutOfBoundsException e){
            System.out.println("Terjadi Kesalahan dalam dalam memasukkan nik: "+e.getMessage());
 } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Akmal Ramadhan
NPM: 2110010567
