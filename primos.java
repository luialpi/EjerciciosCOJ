
public class primos { 

	public void iniciar(int limite)
	{

		for(int i=1;i<=limite;i++)

		{

			if(esPrimo(i))

			{
				System.out.println("Numero Primo:"+i);
			}
		}
	}

	public boolean esPrimo(int numero)
	{
		int aux;
		for(int cont=2;cont<numero;cont++)
		{
			aux=numero%cont;
			if(aux==0)
				return false;
		}
		return true;
	}
}
