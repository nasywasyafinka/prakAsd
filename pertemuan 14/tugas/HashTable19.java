package tugas;

public class HashTable19 {
    String nim;
    String namaLengkap;
    String jurusan;
    String programStudi;

    public HashTable19(String nim, String namaLengkap, String jurusan, String programStudi) {
        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String toString() {
        return "Mahasiswa adalah " +
                "\nNim\t\t\t" + nim + 
                "\nNama Lengkap\t\t" + namaLengkap + 
                "\nJurusan\t\t\t" + jurusan + 
                "\nProgram Studi\t\t" + programStudi + '\n';
    }
}


