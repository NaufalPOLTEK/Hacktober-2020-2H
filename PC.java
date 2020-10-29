
package Assignment;

/**
 *
 * @author Abdul Rohman
 */
public class PC extends Komputer{
    public int layarSize;

    public PC() {
    }

    public PC(int layarSize, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(merk, jnsProcessor, kecProcessor, sizeMemory);
        this.layarSize = layarSize;
    }
    public void tampilPC(){
        super.tampilData();
        System.out.println("LayarSize\t\t : "+layarSize);
    }
}
