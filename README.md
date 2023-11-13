#include <iostream>
#include <cstring>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

int main() {
  // Deklarasi variabel
  char pilihanPaket;
  char menu[100];
  int pilihanLevel;
  int jumlahBeli;
  int hargaAyamGeprek;
  int tambah_level = 4000;
  int subTotal;
  int diskon = 0;
  int totalBayar;
  int uangBayar;
  int uangKembali;


  // Input pilihan paket & output
  cout << "AYAM GEPREK lionel ronaldo" << endl;
  cout<< "============================" << endl;
  cout << "PILIH PAKET [A/B/C]: ";
  cin >> pilihanPaket;
  switch (pilihanPaket) {
    case 'A':
    case 'a':
      hargaAyamGeprek = 30000;
      strcpy(menu, "Ayam Geprek + Mozarella");
      break;
    case 'B':
    case 'b':
      hargaAyamGeprek = 25000;
      strcpy(menu, "Ayam Geprek + Sambal Matah");
      break;
    case 'C':
    case 'c':
      hargaAyamGeprek = 25000;
      strcpy(menu, "Ayam Geprek + Sambal Terasi");
      break;
    default:
      cout << "Pilihan paket tidak valid." << endl;
      return 0;
  }

  cout << "Pilih Level [1/2/3/4/5]: ";
  cin >> pilihanLevel;

  
  cout << "Jumlah beli: ";
  cin >> jumlahBeli;

  // Hitung subtotal
  subTotal = hargaAyamGeprek * jumlahBeli + tambah_level * jumlahBeli;

  // Hitung diskon
  if (hargaAyamGeprek >= 30000) {
    diskon = 500;
  }

  // Hitung total bayar
  totalBayar = subTotal - diskon;

  // Input uang bayar
  cout << "Uang bayar: ";
  cin >> uangBayar;

  // Hitung uang kembali
  uangKembali = uangBayar - totalBayar;

  // Cetak output
  cout <<endl;
  
  cout << "Menu" << endl;
  cout << "Nama Menu: " << menu << endl;
  cout << "Harga: " << hargaAyamGeprek << endl;
  cout << "tambah level: " << tambah_level << endl;
  cout << "Jumlah beli: " << jumlahBeli << endl;
  cout << "Sub total: " << subTotal << endl;
  cout << "Diskon: " << diskon << endl;
  cout << "Total bayar: " << totalBayar << endl;
  cout << "Uang Bayar: " << uangBayar << endl;
  cout << "Uang Kembali: " << uangKembali << endl;


   char input;
  cout << endl;
  cout << "Input Lagi [Y/T]? ";
  cin >> input;
  if (input == 'y' || input == 'Y') {
    main();
  }


  return 0;
}
