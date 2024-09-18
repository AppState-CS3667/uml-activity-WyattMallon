public class ElectricBurner extends Burner {
    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq){super(0, 0, 0);}
    public void increaseCurrent(){}
    public void decreaseCurrent(){};
    public double getVoltReq(){return voltReq;}
}