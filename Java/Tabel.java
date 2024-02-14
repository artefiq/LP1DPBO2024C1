public class Tabel {
    private int baris;
    private int kolom;

    Tabel(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public int getBaris() {
        return baris;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public int getKolom() {
        return kolom;
    }

    public void buatBaris(String[] isi, int add) {
        int i = 0, j = 0; 

        System.out.print("|");
        for (i = 0; i < isi.length; i++) {
            
            System.out.print(" ");
            System.out.print(isi[i]);

            if (i == 0) {
                for (j = 0; j < (AnggotaDPR.getMaxId() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 1) {
                for (j = 0; j < (AnggotaDPR.getMaxName() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 2) {
                for (j = 0; j < (AnggotaDPR.getMaxBidang() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 3) {
                for (j = 0; j < (AnggotaDPR.getMaxPartai() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            System.out.print(" |");
        }
        System.out.println("");

        int maxStrip = AnggotaDPR.getMaxId() + AnggotaDPR.getMaxName() + AnggotaDPR.getMaxBidang()
                        + AnggotaDPR.getMaxPartai();
        for (i = 0; i < maxStrip + ((2 * 4) + 5); i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}