interface Relation {
public boolean isGreater( Object a, Object b);
public boolean isLess(Object a, Object b);
public boolean isEqual( Object a, Object b);
}

public class Line implements Relation{
    private final double x1;
    private final double x2; 
    private final double y1;
    private final double y2;
    public Line(double x1, double x2, double y1, double y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
    }
    public double getLength(){
    double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)* (y2-y1));
    return length;
    }
    @Override
    public boolean isGreater( Object a, Object b){
    double aLen = ((Line)a).getLength();
    double bLen = ((Line)b).getLength();
    return (aLen > bLen);
    }
    @Override
    public boolean isLess( Object a, Object b){
    double aLen = ((Line)a).getLength();
    double bLen = ((Line)b).getLength();
    return (aLen < bLen);
    }
    @Override
    public boolean isEqual( Object a, Object b){
    double aLen = ((Line)a).getLength();
    double bLen = ((Line)b).getLength();
    return (aLen == bLen);
    }
}
class Main{
    public static void main(String[] args){
        Line a, b;
        a = new Line (2,3,4,5);
        b = new Line (3,1,4,6);
        
        System.out.println("Panjang Garis a: " + a.getLength());
        System.out.println("Panjang Garis a: " + b.getLength());
        System.out.println("Garis a lebih panjang dari Garis b: " + a.isGreater(a, b));
        System.out.println("Garis a lebih pendek dari Garis b: " + a.isLess(a, b));
        System.out.println("Garis a sama dengan Garis b: " + a.isEqual(a, b));
        
        System.out.println("\n\nGiwang Eka Risti/19.0504.0012");
    }
}
