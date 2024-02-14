from AnggotaDPR import AnggotaDPR
from Tabel import Tabel

# Inisialisasi list anggota DPR
list_anggota_dpr = []

# Variabel untuk mengulang program
ulang = 'y'

while ulang == 'y':
    # Menampilkan menu
    print("\nMenu : ")
    print("1. CREATE")
    print("2. READ")
    print("3. UPDATE")
    print("4. DELETE")

    # Meminta pengguna memilih menu
    menu = int(input("\nPilih menu yang diinginkan : "))

    if menu == 1:  # CREATE
        # Meminta input jumlah anggota yang ingin ditambahkan
        n = int(input("\nMasukkan banyak anggota yang ingin ditambah : "))
        for i in range(n):
            # Meminta input data anggota
            id_anggota = input("Masukkan id : ")
            name_anggota = input("Masukkan nama : ")
            bidang_anggota = input("Masukkan bidang : ")
            partai_anggota = input("Masukkan partai : ")

            # Membuat objek AnggotaDPR baru dan menambahkannya ke list
            temp_anggota = AnggotaDPR(id_anggota, name_anggota, bidang_anggota, partai_anggota)
            list_anggota_dpr.append(temp_anggota)

    elif menu == 2:  # READ
        print("\nList Anggota DPR :")
        
        # Membuat objek Tabel untuk menampilkan data
        tabel = Tabel(anggota_dpr=list_anggota_dpr[0], baris=len(list_anggota_dpr), kolom=4)

        # Menghitung panjang maksimum strip
        max_strip = AnggotaDPR.getMaxId() + AnggotaDPR.getMaxName() + AnggotaDPR.getMaxBidang() + AnggotaDPR.getMaxPartai()
        for i in range(max_strip + ((2 * 4) + 5)):
            print("-", end="")
        print("")

        # Menampilkan data anggota dalam bentuk tabel
        for anggota in list_anggota_dpr:
            arr_str = [str(anggota.getId()), str(anggota.getName()), str(anggota.getBidang()), str(anggota.getPartai())]
            tabel.buatBaris(arr_str, 4)

    elif menu == 3:  # UPDATE
        if not list_anggota_dpr:
            print("Data Kosong\n")
        else:
            # Meminta input ID anggota yang ingin diubah
            update_id = input("Masukkan ID anggota DPR yang ingin diubah : ")
            ketemu = False

            # Melakukan iterasi untuk mencari dan mengubah data anggota
            for i, anggota in enumerate(list_anggota_dpr):
                if update_id == anggota.getId():
                    nama_baru = input("Masukkan nama baru : ")
                    bidang_baru = input("Masukkan bidang baru : ")
                    partai_baru = input("Masukkan partai baru : ")
                    list_anggota_dpr[i] = AnggotaDPR(update_id, nama_baru, bidang_baru, partai_baru)
                    ketemu = True
                    print(f"\n===== Perubahan Berhasil Dilakukan ({update_id}) ======\n")

            # Menampilkan pesan jika ID tidak ditemukan
            if not ketemu:
                print(f"Tidak ditemukan anggota DPR dengan ID {update_id}\n")

    elif menu == 4:  # DELETE
        if not list_anggota_dpr:
            print("Data Kosong\n")
        else:
            # Meminta input ID anggota yang ingin dihapus
            delete_id = input("Masukkan ID anggota yang ingin dihapus : ")
            ketemu = False

            # Melakukan iterasi untuk mencari dan menghapus data anggota
            for anggota in list_anggota_dpr:
                if anggota.getId() == delete_id:
                    list_anggota_dpr.remove(anggota)
                    ketemu = True
                    print(f"Anggota DPR dengan ID {delete_id} berhasil dihapus")

            # Menampilkan pesan jika ID tidak ditemukan
            if not ketemu:
                print(f"Tidak ditemukan anggota DPR dengan ID {delete_id}\n")

    else:
        print("Menu yang anda pilih salah\n")

    # Meminta input untuk mengulang program
    ulang = input("Apakah masih (y/n) ? ")