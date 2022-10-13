import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataPenduduk dataPenduduk = new DataPenduduk();
        Matrix matrix = new Matrix();

        //   4. for loop
        for (int i = 0; i < 3; ++i) {
            System.out.println("Masukkan Data Penduduk Ke-" + (i + 1) + ": ");
            Scanner input = new Scanner(System.in);
        System.out.println("Masukkan NIK: ");
        input.next(NIK);
        System.out.println("Masukkan Nama: ");
        input.next(nama);
        System.out.println("Masukkan Tempat Lahir: ");
        input.next(tempatLahir);
        System.out.println("Masukkan Tanggal Lahir: ");
        input.next(tanggalLahir);
        System.out.println("Masukkan Golongan Darah: ");
        input.next(golonganDarah);
        System.out.println("Masukkan Jenis Kelamin: ");
        input.next(jenisKelamin);
        System.out.println("Masukkan Alamat: ");
        input.next(alamat);
        System.out.println("Masukkan RT: ");
        input.nextInt(rt);
        System.out.println("Masukkan RW: ");
        input.nextInt(rw);
        System.out.println("Masukkan Kelurahan: ");
        input.next(kelurahan);
        System.out.println("Masukkan Kecamatan: ");
        input.next(kecamatan);
        System.out.println("Masukkan Agama: ");
        input.next(agama);
          System.out.println("Masukkan Status (0 || 1): ");
        boolean status = input.nextBoolean();
        if (status) statusPerkawinan = "Kawin";
        else statusPerkawinan = "Belum Kawin";
          System.out.println("Masukkan Pekerjaan: ");
        input.next(pekerjaan);
          System.out.println("Masukkan Kewarganegaraan: ");
        input.next(kewarganegaraan);
          System.out.println("Masukkan Masa Berlaku: ");
        input.next(masaBerlaku);
        System.out.println("");
        }

        //6. while
        int i = 0;
        while (i < 3) {
            System.out.println("Data Penduduk Ke-" + (i + 1) + ": \n\n"); ;
            dataPenduduk.display();
            System.out.println("==========================================================\n\n");
            i++;
        }

        matrix.displayArray();
    }
}