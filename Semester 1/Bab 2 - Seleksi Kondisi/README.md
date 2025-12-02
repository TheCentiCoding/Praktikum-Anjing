# Bab 2 - Seleksi Kondisi
## 1. Bangun Datar
Buatlah program sebagai berikut dengan menggunakan metode switch case
```
Menu:
1. menghitung luas dan keliling persegi panjang
2. menghitung luas dan keliling lingkaran
3. menghitung luas dan keliling segitiga
Pilihan anda: 3

Masukkan a: 3
Masukkan b: 4
Masukkan r: 5

Keliling segitiga     : 12 cm
Luas segitiga         : 6 cm2
Pilihan anda: 10
Data tak ditemukan, program dihentikan ...
```
## 2. Indeks Massa Tubuh
Untuk menentukan kriteria kegemukan, digunakan IMT (Indeks Massa Tubuh), yang bisa dihitung menggunakan rumus:

**IMT = b / t2**

b = berat badan (kg)

t = tinggi badan (m)

Kriteria untuk nilai IMT ditabelkan sebagai berikut:
| Nilai IMT | Kriteria |
|----------|----------|
| IMT ≤ 18,5  | Kurus  |
| 18,5 < IMT ≤ 25  | Normal  |
| 25 < IMT ≤ 30  | Gemuk  |
| IMT > 30  | Kegemukan  |

Susun program dengan tampilan sebagai berikut dengan menggunakan metode if-else!
```
Berat badan (kg) : 45
Tinggi badan (m) : 1.72
IMT = 15,21    Termasuk kurus

Berat badan (kg) : 85
Tinggi badan (m) : 1.71
IMT = 27,76    Termasuk gemuk
```
## 3. Gaji Karyawan
Susun program untuk masalah pengajian sebagai berikut:
Masukan yang dibutuhkan oleh program adalah: jumlah jam kerja tiap minggu. Keluaran program adalah: total upah dari pegawai tertentu. Aturan yang diterapkan adalah:
- Batas kerja maksimal adalah 60 jam / minggu, dengan upah Rp. 5000,- / jam. Kelebihan jam kerja dari batas maksimum akan dianggap sebagai lembur dengan upah Rp. 6000,- / jam.
- Batas kerja minimal adalah 50 jam / minggu. Apabila pegawai mempunyai jam kerja di bawah batas kerja minimal ini, maka akan dikenakan denda sebesar Rp. 1000, - / jam.

Contoh tampilan:
```
Jam kerja  : 55
Upah   = Rp. 275000
Lembur = Rp. 0
Denda  = Rp. 0
-------------------
Total  = Rp. 275000

Jam kerja  : 70
Upah   = Rp. 300000
Lembur = Rp. 60000
Denda  = Rp. 0
-------------------
Total  = Rp. 360000

Jam kerja  : 40
Upah   = Rp. 200000
Lembur = Rp. 0
Denda  = Rp. 10000
-------------------
Total  = Rp. 190000
```
