import java.util.Scanner;
public class DataPenduduk {
   private int rt;
    private int rw;
    private String NIK;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String golonganDarah;
    private String jenisKelamin;
    private String alamat;
    private String kelurahan;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String masaBerlaku;

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getMasaBerlaku() {
        return masaBerlaku;
    }

    public void setMasaBerlaku(String masaBerlaku) {
        this.masaBerlaku = masaBerlaku;
    }

    void display() {
        System.out.println("NIK\t\t\t: " + NIK);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tempat Lahir/Tgl Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin\t\t: " + jenisKelamin);
        System.out.print("\tGol. Darah: " + golonganDarah);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("\tRT/RW\t\t: " + rt + "/" + rw);
        System.out.println("\tKel/Desa\t: " + kelurahan);
        System.out.println("\tKecamatan\t: " + kecamatan);
        System.out.println("Agama\t\t\t: " + agama);
        System.out.println("Status\t\t\t: " + statusPerkawinan);
        System.out.println("Pekerjaan\t\t: " + pekerjaan);
        System.out.println("Kewarganegaraan\t\t: "+ kewarganegaraan);
        System.out.println("Masa Berlaku\t\t: " + masaBerlaku);
        System.out.println("");
    }
}
