package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class ConverteController 
{
//	public PilhaString pStr = new PilhaString();
	
	public ConverteController()
	{
		super();
	}
	
	public void decToBin(int valor) 
	{
		PilhaInt pInt = new PilhaInt();
		int bin = 0;
		String met = "";
		while(valor > 0)
		{
			bin = valor % 2;
			pInt.push(bin);
			valor /= 2;
		}
		while(!pInt.isEmpty())
		{
			try {
				met = met + pInt.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(met);
	}

}
