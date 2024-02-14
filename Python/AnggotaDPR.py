class AnggotaDPR:
    # Atribut statis untuk menyimpan nilai maksimum panjang setiap atribut
    maxId = 0
    maxName = 0
    maxBidang = 0
    maxPartai = 0

    def __init__(self, id="", name="", bidang="", partai=""):
        """
        Inisialisasi objek AnggotaDPR.

        Parameters:
        - id (str): ID Anggota DPR.
        - name (str): Nama Anggota DPR.
        - bidang (str): Bidang kerja Anggota DPR.
        - partai (str): Partai politik Anggota DPR.
        """
        self.id = id
        self.name = name
        self.bidang = bidang
        self.partai = partai

        # Mengupdate nilai maksimum panjang atribut statis
        if len(self.id) > AnggotaDPR.maxId:
            AnggotaDPR.maxId = len(self.id)

        if len(self.name) > AnggotaDPR.maxName:
            AnggotaDPR.maxName = len(self.name)

        if len(self.bidang) > AnggotaDPR.maxBidang:
            AnggotaDPR.maxBidang = len(self.bidang)

        if len(self.partai) > AnggotaDPR.maxPartai:
            AnggotaDPR.maxPartai = len(self.partai)

    # Getter & Setter methods

    def getId(self):
        """Mengembalikan ID Anggota DPR."""
        return self.id

    def setId(self, id):
        """Mengatur ID Anggota DPR."""
        self.id = id

    def getName(self):
        """Mengembalikan nama Anggota DPR."""
        return self.name

    def setName(self, name):
        """Mengatur nama Anggota DPR."""
        self.name = name

    def getBidang(self):
        """Mengembalikan bidang kerja Anggota DPR."""
        return self.bidang

    def setBidang(self, bidang):
        """Mengatur bidang kerja Anggota DPR."""
        self.bidang = bidang

    def getPartai(self):
        """Mengembalikan partai politik Anggota DPR."""
        return self.partai

    def setPartai(self, partai):
        """Mengatur partai politik Anggota DPR."""
        self.partai = partai

    @staticmethod
    def getMaxId():
        """Mengembalikan nilai maksimum panjang ID."""
        return AnggotaDPR.maxId

    @staticmethod
    def getMaxName():
        """Mengembalikan nilai maksimum panjang nama."""
        return AnggotaDPR.maxName

    @staticmethod
    def getMaxBidang():
        """Mengembalikan nilai maksimum panjang bidang kerja."""
        return AnggotaDPR.maxBidang

    @staticmethod
    def getMaxPartai():
        """Mengembalikan nilai maksimum panjang partai politik."""
        return AnggotaDPR.maxPartai
