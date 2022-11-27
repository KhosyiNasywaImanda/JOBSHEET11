public class Keladai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keladai(String nama, int jmlKaki , String suara , String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        super.displayBinatang();
        System.out.println("Suara = " + suara);
        System.out.println("Warna Bulu = " + warnaBulu);
    }

    @Override
    public void displayBinatang(){
        System.out.println("Jenis = Herbivora");
        System.out.println("Makanan = Tumbuhan");
    }
    public void displayData(){
        System.out.println("Keledai");
        displayMakan();
        displayBinatang();
    }
    
}
