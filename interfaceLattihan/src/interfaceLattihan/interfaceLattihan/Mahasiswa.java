package interfaceLattihan;

public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa(String nama){
        this.nama=nama;
    }
    public void kuliahDikampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus. ");
    }

    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebuh dari 3,51");
    }
}
