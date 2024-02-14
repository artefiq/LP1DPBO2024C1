import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas untuk mengelola program utama, menangani operasi berbasis menu untuk Anggota DPR.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<AnggotaDPR> list = new ArrayList<>(); // ArrayList untuk menyimpan objek AnggotaDPR

        int menu; // Variabel untuk menyimpan pilihan menu pengguna
        String ulang = "y"; // String untuk mengontrol kelanjutan loop

        // Loop utama program
        while (ulang.equals("y")) {
            System.out.println("\nMenu : ");
            System.out.println("1. TAMBAH");
            System.out.println("2. TAMPIL");
            System.out.println("3. UBAH");
            System.out.println("4. HAPUS");

            System.out.print("\nPilih menu yang diinginkan : ");
            menu = sc.nextInt(); // Dapatkan pilihan menu pengguna

            if (menu == 1) { // CREATE
                System.out.print("\nMasukkan banyak anggota yang ingin ditambah : ");
                int n = sc.nextInt();

                // Input data untuk n objek AnggotaDPR
                for (int i = 0; i < n; i++) {
                    System.out.print("Masukkan id : ");
                    String id = sc.next();
                    System.out.print("Masukkan nama : ");
                    String name = sc.next();
                    System.out.print("Masukkan bidang : ");
                    String bidang = sc.next();
                    System.out.print("Masukkan partai : ");
                    String partai = sc.next();

                    // Buat objek AnggotaDPR dan tambahkan ke dalam daftar
                    AnggotaDPR temp = new AnggotaDPR(id, name, bidang, partai);
                    list.add(temp);
                }
            } else if (menu == 2) { // READ
                System.out.println("\nDaftar Anggota DPR :");
                Tabel tab = new Tabel(list.size(), 4);

                int maxStrip = AnggotaDPR.getMaxId() + AnggotaDPR.getMaxName() + AnggotaDPR.getMaxBidang()
                        + AnggotaDPR.getMaxPartai();
                for (int i = 0; i < maxStrip + ((2 * 4) + 5); i++) {
                    System.out.print("-");
                }
                System.out.println("");

                // Tampilkan data dalam format tabel menggunakan kelas Tabel
                for (int i = 0; i < list.size(); i++) {
                    String[] arrstr = new String[4];
                    arrstr[0] = "" + list.get(i).getId();
                    arrstr[1] = "" + list.get(i).getName();
                    arrstr[2] = "" + list.get(i).getBidang();
                    arrstr[3] = "" + list.get(i).getPartai();

                    tab.buatBaris(arrstr, 4);
                }

            } else if (menu == 3) { // UPDATE
                if (list.isEmpty()) {
                    System.out.println("Data Kosong\n");
                } else {
                    System.out.print("Masukkan ID anggota DPR yang ingin diubah : ");
                    String updateId = sc.next();
                    boolean ketemu = false;

                    // Ubah data objek AnggotaDPR berdasarkan ID yang diberikan
                    for (int i = 0; i < list.size(); i++) {
                        AnggotaDPR x = list.get(i);
                        if (updateId.equals(x.getId())) {
                            System.out.print("Masukkan nama baru : ");
                            String namaBaru = sc.next();
                            System.out.print("Masukkan bidang baru : ");
                            String bidangBaru = sc.next();
                            System.out.print("Masukkan partai baru : ");
                            String partaiBaru = sc.next();
                            list.set(i, new AnggotaDPR(updateId, namaBaru, bidangBaru, partaiBaru));
                            ketemu = true;
                            System.out.println("\n===== Perubahan Berhasil Dilakukan (" + updateId + ") ======\n");
                        }
                    }

                    // Beri pesan jika ID tidak ditemukan
                    if (!ketemu) {
                        System.out.println("Tidak ditemukan anggota DPR dengan ID " + updateId + "\n");
                    }
                }
            } else if (menu == 4) { // DELETE
                if (list.isEmpty()) {
                    System.out.println("Data Kosong\n");
                } else {
                    System.out.print("Masukkan ID anggota yang ingin dihapus : ");
                    String deleteId = sc.next();
                    boolean ketemu = false;

                    // Hapus objek AnggotaDPR berdasarkan ID yang diberikan
                    for (AnggotaDPR x : list) {
                        if (x.getId().equals(deleteId)) {
                            list.remove(x);
                            ketemu = true;
                            System.out.println("Anggota DPR dengan ID " + deleteId + " berhasil dihapus");
                        }
                    }

                    // Beri pesan jika ID tidak ditemukan
                    if (!ketemu) {
                        System.out.println("Tidak ditemukan anggota DPR dengan ID " + deleteId + "\n");
                    }
                }
            } else {
                System.out.println("Menu yang anda pilih salah\n");
            }

            System.out.print("Apakah masih (y/n) ? ");
            ulang = sc.next();
        }

        sc.close();
    }
}
