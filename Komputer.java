
package Assignment;

/**
 *
 * @author Abdul Rohman
 */
public class Komputer {
    public String merk,jnsProcessor;
    public int kecProcessor,sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProcessor = jnsProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilData(){
        System.out.println("Merk \t\t\t : "+merk);
        System.out.println("Jenis Processor\t\t : "+jnsProcessor);
        System.out.println("Size Memory\t\t : "+sizeMemory);
        System.out.println("Kecepatan Processor\t : "+kecProcessor);
    }
}
