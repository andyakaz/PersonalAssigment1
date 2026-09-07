import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Setyo", "3310009", "Teknik Informatika", 3.85);
        daftar[1] = new Mahasiswa("Benja Lasaris", "3310010", "Sistem Informasi", 3.41);
        daftar[2] = new Mahasiswa("Mayang Sari", "3310015", "Teknik Informatika", 3.93);
        daftar[3] = new Mahasiswa("Emil", "3310017", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Suciani", "33320005", "Akuntansi", 2.30);

        // Soal 1 
        for(int i=0; i<daftar.length; i++){
            daftar[i].tampilkanInfo();
        }

        // Soal 2
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();
        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = input.nextDouble();

        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getNim().equals(nimCari)) {
                daftar[i].updateIpk(ipkBaru);
                System.out.println("Data berhasil diperbarui!");
                daftar[i].tampilkanInfo();
                daftar[i].cekKelulusan();
                break; 
            }
        }

        // Soal 
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
            daftar[i].cekKelulusan();
            daftar[i].hitungPredikat();
        }

        input.close();
    }
}