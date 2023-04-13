package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class ConverteController 
{
	
	
	public ConverteController()
	{
		super();
	}
	
	public void decToBin(int valor)
	{
		if(valor <= 1000)
		{
				
			PilhaInt pInt = new PilhaInt();
			int bin = 0;
			String callBin = "";
			while(valor > 0)
			{
				bin = valor % 2;
				pInt.push(bin);
				valor /= 2;
			}
			while(!pInt.isEmpty())
			{
				try {
					callBin += pInt.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(callBin);
		}
		else
		{
			System.out.println("Apenas valor menor ou igual a 1000!");
		}
		
	}

}
