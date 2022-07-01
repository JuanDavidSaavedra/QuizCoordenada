public class Coordenada
{
    private double x;
    private double y;

    public Coordenada()
    {
    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object o)
    {
        Coordenada c2 = (Coordenada)o;
        return (x==c2.x) && (y==c2.y);

    }

    public String toString()
    {
        return "[" + x + "," + y + "]";
    }

    public double calcularDistancia(Coordenada c1)
    {
        double x1=x;
        double y1=y;
        double x2=c1.getX();
        double y2=c1.getY();
        double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
        return distancia;
    }
     
}
