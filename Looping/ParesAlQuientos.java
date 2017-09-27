public class ParesAlQuientos extends Base
{
    @Override
    public void looping()
    {
        setName("Pares del 2 al 500: ");
        System.out.println("Ejercicio: "+getName());
        for(int index = 1; index<=500;index++)
        {
            if(index % 2 == 0)
            {
                System.out.print(index + "-");
            }
        }
        System.out.println();
        System.out.println();
    }
}
