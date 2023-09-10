package adap;

public class PenAdaptor implements Pen{

    adap.PilotPen pp=new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);

    }
}
