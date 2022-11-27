

import interfaceLattihan.ICumlaude;
import interfaceLattihan.Mahasiswa;
import interfaceLattihan.PascaSarjana;
import interfaceLattihan.Rektor;
import interfaceLattihan.Sarjana;

public class interfaceMain {
    public static void main(String[] args) {

        // praktikum1
        // Rektor pakrektor = new Rektor();

        // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        // Sarjana sarjanaCumlaude = new Sarjana("Dini");
        // PascaSarjana masterCumlaude = new PascaSarjana("khosyi");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        // pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakrektor.beriSertifikatCumlaude(masterCumlaude);
        

        // praktikum2
        Rektor pakrektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("khosyi");
        
        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masterCum);

    }
}
