#include <bits/stdc++.h>
#include "AnggotaDPR.cpp"

using namespace std;

int main()
{
    AnggotaDPR data;

    int i, n = 0, menu;
    string id;
    string name;
    string bidang;
    string partai;

    char ulang = 'y';

    list<AnggotaDPR> linked_list;

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
                AnggotaDPR temp;

                cin >> id >> name >> bidang >> partai;

                temp.set_id(id);
                temp.set_name(name);
                temp.set_bidang(bidang);
                temp.set_partai(partai);

                linked_list.push_back(temp);
            }
            break;

        case 2: // READ
            cout << "List Anggota DPR : " << '\n';
            i = 0;
            for (list<AnggotaDPR>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
            {
                cout << (i + 1) << ". " << it->get_id() << " | " << it->get_name() << " | " << it->get_bidang() << " | " << it->get_bidang() << '\n';
                i++;
            }
            break;

        case 3: // UPDATE
            cout << "masukkan id yang ingin di edit : ";
            cin >> id;
            
            i = 0;
            for (list<AnggotaDPR>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
            {
                if (id == it->get_id()){
                    cout << "masukkan nama baru : ";
                    cin >> name; it->set_name(name);

                    cout << "masukkan bidang baru : ";
                    cin >> bidang; it->set_bidang(bidang);

                    cout << "masukkan partai baru : ";
                    cin >> partai; it->set_partai(partai);

                    cout << "\n===== Perubahan Berhasil Dilakukan (" << it->get_id() << ") ======\n" << endl;
                }
                i++;
            }
            break;

        case 4: // DELETE
            cout << "Masukkan ID anggota yang ingin dihapus: ";
            cin >> id;

            int done = 0;

            for (auto it = linked_list.begin(); it != linked_list.end(); ++it)
            {
                if (id == it->get_id() && done != 1)
                {
                    it = linked_list.erase(it);

                    cout << "\n===== Anggota DPR dengan ID " << id << " berhasil dihapus =====\n" << endl;
                    done = 1;
                }
            }
            break;
        }

        cout << "apakah masih ? (y/n)\n";
        cin >> ulang;
    }

    return 0;
}