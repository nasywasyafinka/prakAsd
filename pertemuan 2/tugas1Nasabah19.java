class tugas1Nasabah19 {
     int id,noHP,noRek,saldo;
     String nama,alamat;
     float jmlHutang;
     boolean statusAktif;
    
    public tugas1Nasabah19(int id, String nama, String alamat, int noHP) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.noRek = 0; 
        this.saldo = 0;
        this.jmlHutang = 0.0f;//inisialisasi variabel yg diawali dari 0.0
        this.statusAktif = false;
    }
    public void bukaRekening() { 
        if (noRek == 0) {
            noRek = (int) (Math.random() * 10000); // mengasilkan nomor rekening secara acak
            statusAktif = true;
            System.out.println("\n====================================================================================\n");
            System.out.println("\n\n\t\t\t    **REKENING BARU BERHASIL DIBUKA**");
            System.out.println("\t\t\t\t## NOMOR REKENING: "+noRek+" ##");
        } else {
            System.out.println("");
        }
    }

    public void tutupRekening() {
        if (statusAktif) {
            noRek = 0;
            saldo = 0;
            jmlHutang = 0.0f;
            statusAktif = false;
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING BERHASIL DITUTUP ");
        } else {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING TIDAK AKTIF / REKENING TIDAK DITEMUKAN");
        }
    }

    public void lihatSaldo() {
        if (statusAktif) {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tSALDO SAAT INI: " + saldo);
        } else {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING TIDAK AKTIF / REKENING TIDAK DITEMUKAN");
        }
    }

    public void menabung(int deposit) {
        if (statusAktif) {
            saldo += deposit;
            System.out.println("\n====================================================================================\n");
            System.out.println("\tPENYIMPANAN BERHASIL\n\tSALDO SAAT INI: " + saldo);
        } else {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING TIDAK AKTIF / REKENING TIDAK DITEMUKAN.");
        }
    }

    public void tarikTunai(int jmlTarik) {
        if (statusAktif) {
            if (saldo >= jmlTarik) {
                saldo -= jmlTarik;
                System.out.println("\n====================================================================================\n");
                System.out.println("\tPENARIKAN BERHASIL\n\tSALDO SAAT INI: " + saldo);
            } else {
                System.out.println("\n====================================================================================\n");
                System.out.println("\tSALDO TIDAK MENCUKUPI");
            }
        } else {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING TIDAK AKTIF / REKENING TIDAK DITEMUKAN");
        }
    }

    public void berhutang(float jmlHutang) {
        if (statusAktif) {
            if (jmlHutang >= saldo) {
                System.out.println("\n====================================================================================\n");
                System.out.println("\tAJUAN PEMINJAMAN DITOLAK\n\tJUMLAH HUTANG MELEBIHI SALDO");
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = jmlHutang / 6;
                System.out.println("\n====================================================================================\n");
                System.out.println("\tPINJAMAN DISETUJUI\n\tNOMINAL CICILAN PER BULAN " + cicilanPerBulan);
            }
        } else {
            System.out.println("\n====================================================================================\n");
            System.out.println("\tREKENING TIDAK AKTIF / REKENING TIDAK DITEMUKAN");
        }
    }
}
