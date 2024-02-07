// Import Library
#include <iostream>  // Library untuk input/output stream
#include <string>    // Library untuk penggunaan string

// using standard namespace.
using namespace std;

// Deklarasi kelas AnggotaDPR
class AnggotaDPR
{
private:
    // Data anggota DPR
    string id;       // ID anggota DPR
    string name;     // Nama anggota DPR
    string bidang;   // Bidang atau dapil anggota DPR
    string partai;   // Partai politik anggota DPR

public:
    // Konstruktor default untuk inisialisasi anggota DPR dengan nilai default
    AnggotaDPR()
    {
        this->id = "";
        this->name = "";
        this->bidang = "";
        this->partai = "";
    }

    // Konstruktor dengan parameter untuk inisialisasi anggota DPR dengan nilai yang diberikan
    AnggotaDPR(string id, string name, string bidang, string partai)
    {
        this->id = id;
        this->name = name;
        this->bidang = bidang;
        this->partai = partai;
    }

    // Getter dan setter untuk masing-masing atribut anggota DPR

    // Getter dan setter untuk ID anggota DPR
    string get_id()
    {
        return id;
    }

    void set_id(string id)
    {
        this->id = id;
    }

    // Getter dan setter untuk nama anggota DPR
    string get_name()
    {
        return this->name;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    // Getter dan setter untuk bidang atau dapil anggota DPR
    string get_bidang()
    {
        return this->bidang;
    }

    void set_bidang(string bidang)
    {
        this->bidang = bidang;
    }

    // Getter dan setter untuk partai politik anggota DPR
    string get_partai()
    {
        return this->partai;
    }

    void set_partai(string partai)
    {
        this->partai = partai;
    }

    // Destruktor untuk membersihkan sumber daya yang mungkin digunakan oleh kelas
    ~AnggotaDPR() {}
};
