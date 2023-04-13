package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class ParEImparController 
{
	
	
	public ParEImparController()
	{
		super();
	}
	
	public void parEImpar(int[] valor)
	{
		
		PilhaInt pilhaIni = new PilhaInt();
		PilhaInt pilhaA = new PilhaInt();
		PilhaInt pilhaB = new PilhaInt();
		
		for(int array: valor)
		{
			pilhaIni.push(array);
			System.out.println(array);
		}
		
		while(!pilhaIni.isEmpty())
		{
			int test;
			try {
				test = pilhaIni.pop();
				if(test % 2 == 0)
				{
					pilhaA.push(test);
				}
				else
				{
					pilhaB.push(test);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			System.out.println("Pilha A com pares");
			while(!pilhaA.isEmpty())
			{
					System.out.println(pilhaA.pop());
			}
			System.out.println("Pilha B com impares");
			while(!pilhaB.isEmpty())
			{
				System.out.println(pilhaB.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
