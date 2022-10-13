#include<iostream>

using namespace std;

class DataPenduduk {
private:
    //    2. Variabel
    //    3. Tipe Data
    struct KTP {
        int rt;
        int rw;
        string NIK;
        string nama;
        string tempatLahir;
        string tanggalLahir;
        string golonganDarah;
        string jenisKelamin;
        string alamat;
        string kelurahan;
        string kecamatan;
        string agama;
        bool status;
        string statusPerkawinan;
        string pekerjaan;
        string kewarganegaraan;
        string masaBerlaku;
    };

public:
    KTP ktp;

    //    10. Input
    void inputData() {
        cout << "Masukkan NIK: ";
        cin >> ktp.NIK;
        cin.ignore(256, '\n');
        cout << "Masukkan Nama: ";
        getline(cin, ktp.nama);
        cout << "Masukkan Tempat Lahir: ";
        cin >> ktp.tempatLahir;
        cin.ignore(256, '\n');
        cout << "Masukkan Tanggal Lahir: ";
        getline(cin, ktp.tanggalLahir);
        cout << "Masukkan Golongan Darah: ";
        cin >> ktp.golonganDarah;
        cout << "Masukkan Jenis Kelamin: ";
        cin >> ktp.jenisKelamin;
        cin.ignore(256, '\n');
        cout << "Masukkan Alamat: ";
        getline(cin, ktp.alamat);
        cout << "Masukkan RT: ";
        cin >> ktp.rt;
        cout << "Masukkan Rw: ";
        cin >> ktp.rw;
        cout << "Masukkan Kelurahan: ";
        cin >> ktp.kelurahan;
        cout << "Masukkan Kecamatan: ";
        cin >> ktp.kecamatan;
        cout << "Masukkan Agama: ";
        cin >> ktp.agama;
        cin.ignore(256, '\n');
        cout << "Masukkan Status: (0 || 1)";
        cin >> ktp.status;
        //5. if else
        if (ktp.status) ktp.statusPerkawinan = "Kawin";
        else ktp.statusPerkawinan = "Belum Kawin";
        cout << "Masukkan Pekerjaan: ";
        cin >> ktp.pekerjaan;
        cout << "Masukkan Kewarganegaraan: ";
        cin >> ktp.kewarganegaraan;
        cin.ignore(256, '\n');
        cout << "Masukkan Masa Berlaku: ";
        getline(cin, ktp.masaBerlaku);
        cout << endl;
    }

    //    11. Output
    void display() {
        cout << "NIK\t\t\t: " << ktp.NIK << endl;
        cout << "Nama\t\t\t: " << ktp.nama << endl;
        cout << "Tempat Lahir/Tgl Lahir\t: " << ktp.tempatLahir << ", " << ktp.tanggalLahir << endl;
        cout << "Jenis Kelamin\t\t: " << ktp.jenisKelamin;
        cout << "\tGol. Darah: " << ktp.golonganDarah << endl;
        cout << "Alamat\t\t\t: " << ktp.alamat << endl;
        cout << "\tRT/RW\t\t: " << ktp.rt << "/" << ktp.rw << endl;
        cout << "\tKel/Desa\t: " << ktp.kelurahan << endl;
        cout << "\tKecamatan\t: " << ktp.kecamatan << endl;
        cout << "Agama\t\t\t: " << ktp.agama << endl;
        cout << "Status\t\t\t: " << ktp.statusPerkawinan << endl;
        cout << "Pekerjaan\t\t: " << ktp.pekerjaan << endl;
        cout << "Kewarganegaraan\t\t: " << ktp.kewarganegaraan << endl;
        cout << "Masa Berlaku\t\t: " << ktp.masaBerlaku << endl;
        cout << endl;
    }
};

class Matrix {
private:
    // 9. Array Multidimensi
    int a[2][2] = {
            1,
            2,
            3,
            4
    };
    int i;
public:
    // 7. do while
    void displayArray() {
        do {
            cout << "nilai Array a[1][1] adalah:" << a[1][1];
        } while (a[1][1] != 4);
    }
};

//1. Main Program
int main() {
    DataPenduduk dataPenduduk[3]; //8. Array 1 dimensi

    //   4. for loop
    for (int i = 0; i < 3; ++i) {
        cout << endl << "Masukkan Data Penduduk Ke-" << i + 1 << ": " << endl;
        dataPenduduk[i].inputData();
    }

    //6. while
    int i = 0;
    while (i < 3) {
        cout << endl << "Data Penduduk Ke-" << i + 1 << ": " << endl << endl;
        dataPenduduk[i].display();
        cout << "==========================================================" << endl;
        i++;
    }

    Matrix matrix;
    matrix.displayArray();
}

//12. Comment