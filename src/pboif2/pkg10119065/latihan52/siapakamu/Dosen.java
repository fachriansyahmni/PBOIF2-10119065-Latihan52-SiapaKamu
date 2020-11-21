package pboif2.pkg10119065.latihan52.siapakamu;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Siapa Kamu
 */
public class Dosen extends Manusia{
    private String nip, mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang mengajar "+getMataKuliah());
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
