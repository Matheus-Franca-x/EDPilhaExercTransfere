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
		int bin = 0;
		while(valor <= 0)
		{
			bin = valor % 2;
			pInt.push(bin);
			valor /= 2;
		}
	}

}
