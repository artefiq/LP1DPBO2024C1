// Import Library
#include <iostream>
#include <string>

// using standard namespace.
using namespace std;

class AnggotaDPR
{
private:
    string id;
    string name;
    string bidang;
    string partai;

public:
    AnggotaDPR()
    {
        this->id = "";
        this->name = "";
        this->bidang = "";
        this->partai = "";
    }

    AnggotaDPR(string id, string name, string bidang, string partai)
    {
        this->id = id;
        this->name = name;
        this->bidang = bidang;
        this->partai = partai;
    }

    string get_id()
    {
        return id;
    }

    void set_id(string id)
    {
        this->id = id;
    }

    string get_name()
    {
        return this->name;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    string get_bidang()
    {
        return this->bidang;
    }

    void set_bidang(string bidang)
    {
        this->bidang = bidang;
    }

    string get_partai()
    {
        return this->partai;
    }

    void set_partai(string partai)
    {
        this->partai = partai;
    }

    void eat()
    {
        cout << this->name << " is eating!" << '\n';
    }

    void sleep()
    {
        cout << this->name << " is sleeping!" << '\n';
    }

    ~AnggotaDPR() {}
};