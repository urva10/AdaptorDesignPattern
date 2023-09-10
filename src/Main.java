import adap.Assigment;
import adap.Pen;
import adap.PenAdaptor;

public class Main {
    public static void main(String[] args) {

        Pen p=new PenAdaptor();
        Assigment aw=new Assigment();
        aw.setP(p);
        aw.writeassignent("I am bit tired to write assignment");
    }
}