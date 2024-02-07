#include <bits/stdc++.h>  // Library untuk mengakses semua library secara bersamaan
#include "AnggotaDPR.cpp" // Menggunakan definisi kelas AnggotaDPR dari file AnggotaDPR.cpp

using namespace std; // Menggunakan standard namespace

int main()
{
    AnggotaDPR data; // Membuat objek AnggotaDPR bernama data

    int i, n = 0, menu; // Deklarasi variabel integer i, n, dan menu
    string id;          // Deklarasi variabel string id
    string name;        // Deklarasi variabel string name
    string bidang;      // Deklarasi variabel string bidang
    string partai;      // Deklarasi variabel string partai

    char ulang = 'y'; // Deklarasi dan inisialisasi variabel char ulang dengan nilai 'y'

    list<AnggotaDPR> linked_list; // Membuat objek linked_list dari kelas list dengan template AnggotaDPR

    AnggotaDPR awal; // Membuat objek awal dari kelas AnggotaDPR

    // Menginisialisasi objek awal dengan data
    awal.set_id("1A");
    awal.set_name("Agus");
    awal.set_bidang("Regional");
    awal.set_partai("Bulan Sabit");
    linked_list.push_back(awal);

    awal.set_id("1B");
    awal.set_name("Budi");
    awal.set_bidang("Nasional");
    awal.set_partai("Kuda Hitam");
    linked_list.push_back(awal);

    cout << "menu :\n";
    cout << "1. CREATE\n2. READ\n3. UPDATE\n4. DELETE\n\n";

    while (ulang == 'y')
    {

        cout << "Pilih menu :";
        cin >> menu;

        switch (menu)
        {
        case 1: // CREATE
            cout << "Input banyak anggota yang ingin ditambah :";
            cin >> n;
            for (i = 0; i < n; i++)
            {
                AnggotaDPR temp; // Membuat objek temp dari kelas AnggotaDPR

                // Mengisi data objek temp dengan input pengguna
                cin >> id >> name >> bidang >> partai;

                temp.set_id(id);
                temp.set_name(name);
                temp.set_bidang(bidang);
                temp.set_partai(partai);

                linked_list.push_back(temp); // Menambahkan objek temp ke dalam linked_list
            }
            break;

        case 2: // READ
            cout << "List Anggota DPR : " << '\n';
            i = 0;
            // Iterasi melalui linked_list dan mencetak informasi anggota DPR
            for (list<AnggotaDPR>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
            {
                cout << (i + 1) << ". " << it->get_id() << " | " << it->get_name() << " | " << it->get_bidang() << " | " << it->get_partai() << '\n';
                i++;
            }
            break;

        case 3: // UPDATE
            cout << "masukkan id yang ingin di edit : ";
            cin >> id;

            i = 0;
            // Iterasi melalui linked_list untuk mencari objek dengan ID yang sesuai
            for (list<AnggotaDPR>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
            {
                // Jika ID objek sesuai dengan input pengguna, lakukan update
                if (id == it->get_id())
                {
                    cout << "masukkan nama baru : ";
                    cin >> name;
                    it->set_name(name);

                    cout << "masukkan bidang baru : ";
                    cin >> bidang;
                    it->set_bidang(bidang);

                    cout << "masukkan partai baru : ";
                    cin >> partai;
                    it->set_partai(partai);

                    cout << "\n===== Perubahan Berhasil Dilakukan (" << it->get_id() << ") ======\n"
                         << endl;
                }
                i++;
            }
            break;

        case 4: // DELETE
            cout << "Masukkan ID anggota yang ingin dihapus: ";
            cin >> id;

            int done = 0;

            // Iterasi melalui linked_list untuk mencari objek dengan ID yang sesuai
            for (auto it = linked_list.begin(); it != linked_list.end(); ++it)
            {
                // Jika ID objek sesuai dengan input pengguna, lakukan delete
                if (id == it->get_id() && done != 1)
                {
                    it = linked_list.erase(it);

                    cout << "\n===== Anggota DPR dengan ID " << id << " berhasil dihapus =====\n"
                         << endl;
                    done = 1;
                }
            }
            break;
        }

        cout << "apakah masih ? (y/n)\n";
        cin >> ulang;
    }

    return 0; // Mengembalikan nilai 0 sebagai tanda program berakhir dengan sukses
}
