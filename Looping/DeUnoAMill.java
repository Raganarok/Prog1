public class DeUnoAMill extends Base
{
    @Override
    public void looping()
    {
        setName("Numeros impresos del 1 al mil");
        System.out.println("Ejercicio: "+getName());
        for(int index = 1; index<=1000;index++)
        {
            System.out.print(index+"-");
        }
        System.out.println();
        System.out.println();
    }

}
