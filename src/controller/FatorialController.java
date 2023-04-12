package controller;

import libPilhaInt.PilhaInt;

public class FatorialController 
{
	
	public FatorialController()
	{
		super();
	}
	
	public void fat(int valor)
	{
		if(valor >= 0 && valor <= 10)
		{
			PilhaInt pInt = new PilhaInt();
			int fat = 1;
			for(int i = valor; i > 0; i--)
			{
				pInt.push(i);
//				System.out.println(i);
			}
			while(!pInt.isEmpty())
			{
				try {
					fat *= pInt.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(fat);
		}
		else
		{
			System.out.println("Apenas numeros de 0 a 10!");
		}
		
		
		
		
	}
	

}
