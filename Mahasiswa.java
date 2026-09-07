class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public double getIpk(){
        return ipk;
    }

    public void setIpk(double ipkBaru){
        ipk = ipkBaru;
    }

    public String getNim(){ return nim; }

    public void tampilkanInfo(){
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: "+ipk);
    }

    public void cekKelulusan(){
        if(ipk>=3.00){
            System.out.println("Status: Lulus");
        }else{
            System.out.println("Status: Belum Lulus");
        }
    }

    public void updateIpk(double ipkBaru){
        this.ipk=ipkBaru; //ganti nilai ipk lama
    }

    public void hitungPredikat(){
        // Dicek dari yang paling tinggi dulu(DESC)
        if (ipk >= 3.75) {
            System.out.println("Predikat: Dengan Pujian");
        } else if (ipk >= 3.50) {
            System.out.println("Predikat: Sangat Memuaskan");
        } else if(ipk >= 3.00){
            System.out.println("Predikat: Memuaskan");
        } else {
            System.out.println("Predikat: Perlu Perbaikan");
        }
    }
}
