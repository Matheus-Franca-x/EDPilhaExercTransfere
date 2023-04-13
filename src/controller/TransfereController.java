package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class TransfereController 
{
	
	
	public TransfereController()
	{
		super();
	}
	
	public void maior(int[] valor)
	{
		PilhaInt pilha = new PilhaInt();
		
		for(int array: valor)
		{
			pilha.push(array);
		}
		
		int maior1;
		int maior2;
		
		while(pilha.size() != 1)
		{
			try {
				maior1 = pilha.pop();
				maior2 = pilha.pop();
				if(maior1 > maior2)
				{
					pilha.push(maior1);
				}
				else
				{
					pilha.push(maior2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
