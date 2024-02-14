/**
 * Kelas AnggotaDPR merepresentasikan objek anggota DPR dengan atribut id, name, bidang, dan partai.
 */
public class AnggotaDPR {
    private String id;       // Atribut id anggota DPR
    private String name;     // Atribut nama anggota DPR
    private String bidang;   // Atribut bidang kerja anggota DPR
    private String partai;   // Atribut partai anggota DPR

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    private static int maxId;
    private static int maxName;
    private static int maxBidang;
    private static int maxPartai;

    /**
     * Konstruktor default untuk objek AnggotaDPR.
     * Inisialisasi atribut id, name, bidang, dan partai dengan string kosong.
     */
    public AnggotaDPR() {
        this.id = "";
        this.name = "";
        this.bidang = "";
        this.partai = "";
    }

    /**
     * Konstruktor untuk objek AnggotaDPR dengan parameter id, name, bidang, dan partai.
     * Menginisialisasi atribut objek dan memperbarui nilai maxId, maxName, maxBidang, dan maxPartai
     * jika panjang atribut yang diinisialisasi melebihi nilai maksimum sebelumnya.
     */
    public AnggotaDPR(String id, String name, String bidang, String partai) {
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum sebelumnya
        if (this.id.length() > maxId) {
            maxId = this.id.length();
        }

        if (this.name.length() > maxName) {
            maxName = this.name.length();
        }

        if (this.bidang.length() > maxBidang) {
            maxBidang = this.bidang.length();
        }

        if (this.partai.length() > maxPartai) {
            maxPartai = this.partai.length();
        }
    }

    /* Getter & Setter */

    /**
     * Getter untuk atribut id.
     * @return Nilai atribut id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter untuk atribut id.
     * @param id Nilai yang akan di-set pada atribut id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter untuk atribut name.
     * @return Nilai atribut name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter untuk atribut name.
     * @param name Nilai yang akan di-set pada atribut name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter untuk atribut bidang.
     * @return Nilai atribut bidang.
     */
    public String getBidang() {
        return this.bidang;
    }

    /**
     * Setter untuk atribut bidang.
     * @param bidang Nilai yang akan di-set pada atribut bidang.
     */
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    /**
     * Getter untuk atribut partai.
     * @return Nilai atribut partai.
     */
    public String getPartai() {
        return this.partai;
    }

    /**
     * Setter untuk atribut partai.
     * @param partai Nilai yang akan di-set pada atribut partai.
     */
    public void setPartai(String partai) {
        this.partai = partai;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut id.
     * @return Nilai maksimum panjang atribut id.
     */
    public static int getMaxId () {
        return maxId;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut name.
     * @return Nilai maksimum panjang atribut name.
     */
    public static int getMaxName () {
        return maxName;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut bidang.
     * @return Nilai maksimum panjang atribut bidang.
     */
    public static int getMaxBidang() {
        return maxBidang;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut partai.
     * @return Nilai maksimum panjang atribut partai.
     */
    public static int getMaxPartai() {
        return maxPartai;
    }
}
