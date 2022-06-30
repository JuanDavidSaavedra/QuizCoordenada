public class Test extends Coordenada
{
    public static void main(String[] args)
    {
        Coordenada c1 = new Coordenada(0,0);
        c1.setX(2.4);
        c1.setY(3.8);
        c1.setDistancia(5);

        Coordenada c2 = new Coordenada(0,0);
        c2.setX(2.4);
        c2.setY(3.9);

        Coordenada c3 = new Coordenada(0,0);


        System.out.println("X = " + c1.getX());
        System.out.println("Y = " + c1.getY());
        System.out.println(c1);

        System.out.println("X = " + c2.getX());
        System.out.println("Y = " + c2.getY());
        System.out.println(c2);

        if(c1.equals(c2))
        {
            System.out.println("Las coordenadas son iguales");
        }
        else
        {
            System.out.println("Las coordenadas son diferentes");
        }
    }

    public String toString()
    {
        return "x: " + getX() + "y: "+ getY() /*+ "distancia recorrida: " + calcularDistancia()*/;
                
    }
    
}
