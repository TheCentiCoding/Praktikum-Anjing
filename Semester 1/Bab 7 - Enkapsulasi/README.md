# Bab 7 - Enkapsulasi
## 1. Swalayan Tiny
Anda dan tim Anda mendapat sebuah proyek untuk merancang sistem transaksi pada sebuah swalayan Tiny. Anda ditugasi oleh tim untuk membuat programnya berdasarkan hasil analisis tim Anda:
1. Informasi akun seorang pelanggan (saldo, nomor pelanggan, nama) tidak bias diubah oleh pelanggan secara langsung.
2. Nomor pelanggan terdiri dari 10 digit dan 2 digit awal adalah jenis rekening
  - 38 : Pelanggan jenis silver; setiap pembelian di atas 1 juta maka mendapat cashback sebesar 5%
  - 56 : Pelanggan jenis gold; setiap pembelian di atas 1 juta maka mendapat cashback sebesar 7%, selain itu cashback 2% (cashback kembali ke saldo)
  - 74 : Pelanggan jenis platinum; setiap pembelian di atas 1 juta maka mendapat cashback sebesar 10%, selain itu cashback 5% (cashback kembali ke saldo)
3. Pelanggan harus memiliki saldo minimal Rp 10.000, jika saldo pasca transaksi kurang dari batas minimal tadi, maka transaksi pembelian dianggap gagal
4. Buatlah sistem transaksi swalayan ini terbatas pada pembelian dan top up saja dan menggunakan PIN dan nomor pelanggan sebagai syarat transaksi pembelian atau top up.
5. Apabila pelanggan melakukan 3x kesalahan dalam autentifikasi, maka akun pelanggan akan defreeze/diblokir sehingga tidak bisa digunakan lagi.
