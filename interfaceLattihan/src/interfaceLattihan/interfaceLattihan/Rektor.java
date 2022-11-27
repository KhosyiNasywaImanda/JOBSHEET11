package interfaceLattihan;

public class Rektor {
  
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR , memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda ...");

        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("------------------------------------------------------");

    }

    public void beriSertifikatMawapres(IBerprestasi sarjanaCum){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        sarjanaCum.menjuaraiKompetisi();
        sarjanaCum.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------------------");
    }


}
