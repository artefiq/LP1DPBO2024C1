class Tabel:
    def __init__(self, anggota_dpr, baris, kolom):
        """
        Inisialisasi objek Tabel dengan parameter anggota_dpr, baris, dan kolom.

        Parameters:
        - anggota_dpr: Objek AnggotaDPR yang digunakan untuk mengakses informasi panjang maksimum setiap kolom.
        - baris: Jumlah baris tabel.
        - kolom: Jumlah kolom tabel.
        """
        self.anggota_dpr = anggota_dpr
        self.baris = baris
        self.kolom = kolom

    def setBaris(self, baris):
        """
        Mengatur jumlah baris tabel.

        Parameters:
        - baris: Jumlah baris baru.
        """
        self.baris = baris

    def getBaris(self):
        """
        Mendapatkan jumlah baris tabel.

        Returns:
        - Jumlah baris tabel.
        """
        return self.baris

    def setKolom(self, kolom):
        """
        Mengatur jumlah kolom tabel.

        Parameters:
        - kolom: Jumlah kolom baru.
        """
        self.kolom = kolom

    def getKolom(self):
        """
        Mendapatkan jumlah kolom tabel.

        Returns:
        - Jumlah kolom tabel.
        """
        return self.kolom

    def buatBaris(self, isi, add):
        """
        Membuat dan menampilkan baris tabel berdasarkan isi yang diberikan.

        Parameters:
        - isi: List yang berisi data untuk setiap kolom.
        - add: Jumlah karakter tambahan yang ingin ditambahkan di akhir setiap kolom.
        """
        i, j = 0, 0

        # Menampilkan baris tabel
        print("|", end="")
        for i in range(len(isi)):
            print(" " + isi[i], end="")

            # Menambahkan spasi untuk menyeimbangkan lebar kolom
            if i == 0:
                for j in range(self.anggota_dpr.getMaxId() - len(isi[i])):
                    print(" ", end="")

            if i == 1:
                for j in range(self.anggota_dpr.getMaxName() - len(isi[i])):
                    print(" ", end="")

            if i == 2:
                for j in range(self.anggota_dpr.getMaxBidang() - len(isi[i])):
                    print(" ", end="")

            if i == 3:
                for j in range(self.anggota_dpr.getMaxPartai() - len(isi[i])):
                    print(" ", end="")

            print(" |", end="")
        print("")

        # Menampilkan strip pembatas
        max_strip = self.anggota_dpr.getMaxId() + self.anggota_dpr.getMaxName() + self.anggota_dpr.getMaxBidang() + self.anggota_dpr.getMaxPartai()
        for i in range(max_strip + ((2 * 4) + 5)):
            print("-", end="")
        print("")
