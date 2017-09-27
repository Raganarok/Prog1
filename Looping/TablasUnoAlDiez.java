public class TablasUnoAlDiez extends Base
{
    @Override
    public void looping()
    {
        setName("Imprimir las tablas del 1 al 10");
        System.out.println("Ejercicio: "+getName());
        for(int index = 1; index<=10;index++)
        {
            System.out.println("Tabla del "+ index);
            for(int counter = 1; counter<=10; counter++)
            {
                int result = index * counter;
                System.out.println(counter+" * "+index+"="+result);
            }
             System.out.println();
        }
       
        
    }
}

