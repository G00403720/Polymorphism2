package ie.atu.productv4;

public class Horse extends Animal {

    private String Dam;
    private String Sire;
    private double Height;

    public Horse() {
        super();
        Dam = "";
        Sire = "";
        Height = 0;
        count++;
    }

    public String getDam() {
        return Dam;
    }

    public void setDam(String dam) {
        Dam = dam;
    }

    public String getSire() {
        return Sire;
    }

    public void setSire(String sire) {
        Sire = sire;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "Dam='" + Dam + '\'' +
                ", Sire='" + Sire + '\'' +
                ", Height=" + Height +
                '}';
    }
}
