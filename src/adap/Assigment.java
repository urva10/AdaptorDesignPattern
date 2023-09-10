package adap;

public class Assigment {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeassignent(String str)
    {
        p.write(str);
    }
}
