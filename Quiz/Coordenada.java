public class Coordenada
{
    private double x;
    private double y;
    private double distancia;

    public Coordenada()
    {
    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Coordenada(String s)
    {
        Coordenada c3 = new Coordenada("1.3/5.3");
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String toString()
    {
        return "[" + x + "," + y + "]"/* + "\ndistancia recorrida: " + calcularDistancia()*/;
    }

    public boolean equals(Object o)
    {
        Coordenada c2 = (Coordenada)o;
        return (x==c2.x) && (y==c2.y);

    }

    /*
    public double calcularDistancia()
    {
        distancia = sqrt()
    }
     */
}
