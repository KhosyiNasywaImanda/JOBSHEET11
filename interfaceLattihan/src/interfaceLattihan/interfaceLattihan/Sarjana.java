package interfaceLattihan;

public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    
    public Sarjana (String nama){
        super(nama);
    }

    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebuh dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kempetisi NASIONAL");
    }
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }

}
