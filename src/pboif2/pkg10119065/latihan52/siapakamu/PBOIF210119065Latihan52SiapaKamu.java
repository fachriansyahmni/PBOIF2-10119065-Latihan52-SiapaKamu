package pboif2.pkg10119065.latihan52.siapakamu;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Siapa Kamu
 */
public class PBOIF210119065Latihan52SiapaKamu {
    
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.setNip("41227829930");
        dosen1.setNama("Rizki Adam Kurniawan");
        dosen1.setUmur(27);
        dosen1.setMataKuliah("PBO2");
        System.out.println("NIP DOSEN : "+dosen1.getNip());
        dosen1.siapaKamu();
        dosen1.mengajarApa();
        
                
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Nindi");
        mhs1.setNim("10110269");
        mhs1.setUmur(17);
        mhs1.setKelas("PBO2");
        
        System.out.println("\nNIM MAHASISWA : "+mhs1.getNim());
        mhs1.siapaKamu();
        mhs1.kelasApa();
    }
    
}
