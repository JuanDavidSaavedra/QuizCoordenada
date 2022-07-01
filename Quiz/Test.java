public class Test extends Coordenada
{
    public static void main(String[] args)
    {
        Coordenada c1 = new Coordenada(0,0);
        c1.setX(2.4);
        c1.setY(3.8);

        Coordenada c2 = new Coordenada(0,0);
        c2.setX(2.4);
        c2.setY(3.8);

        System.out.println("x1 = " + c1.getX());
        System.out.println("y1 = " + c1.getY());
        System.out.println(c1);

        System.out.println("\nx2 = " + c2.getX());
        System.out.println("y2 = " + c2.getY());
        System.out.println(c2);

        if(c1.equals(c2))
        {
            System.out.println("\nLas coordenadas son iguales");
        }
        else
        {
            System.out.println("\nLas coordenadas son diferentes");
        }

        System.out.println("\nLa distancia es: " + c1.calcularDistancia(c2));
    }

    public String toString()
    {
        return "x: " + getX() + "y: "+ getY();
                
    }
    
}
