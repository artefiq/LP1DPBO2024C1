<?php
class AnggotaDPR {
    // Properti untuk menyimpan data anggota DPR
    private $id = "";
    private $name = "";
    private $bidang = "";
    private $partai = "";

    // Konstruktor untuk membuat objek AnggotaDPR
    public function __construct($id = "", $name = "", $bidang = "", $partai = "") {
        $this->id = $id;
        $this->name = $name;
        $this->bidang = $bidang;
        $this->partai = $partai;
    }

    // Getter & Setter methods untuk mengakses dan mengubah nilai properti
    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getBidang() {
        return $this->bidang;
    }

    public function setBidang($bidang) {
        $this->bidang = $bidang;
    }

    public function getPartai() {
        return $this->partai;
    }

    public function setPartai($partai) {
        $this->partai = $partai;
    }
}
?>
