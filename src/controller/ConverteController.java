package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class ConverteController 
{
	private PilhaInt pInt = new PilhaInt();
	private PilhaString pStr = new PilhaString();
	
	public ConverteController()
	{
		super();
	}
	
	public void decToBin(int valor)
	{
		int bin;
		while(valor <= 0)
		{
			
			pInt.push(valor);
		}
	}

}
