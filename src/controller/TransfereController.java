package controller;

import libPilhaInt.PilhaInt;
import libPilhaInt.PilhaString;


public class TransfereController 
{
	
	
	public TransfereController()
	{
		super();
	}
	
	public void transfere(int[] valor)
	{
		PilhaInt pilhaA = new PilhaInt();
		PilhaInt pilhaB = new PilhaInt();
		PilhaInt pilhaC = new PilhaInt();
		
		for(int array: valor)
		{
			pilhaA.push(array);
			
		}
		
		while(!pilhaA.isEmpty())
		{
			try {
				int test = pilhaA.pop();
				pilhaB.push(test);
				System.out.println(test);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(!pilhaB.isEmpty())
		{
			try {
				pilhaC.push(pilhaB.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(!pilhaC.isEmpty())
		{
			try {
				pilhaA.push(pilhaC.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		while(!pilhaA.isEmpty())
		{
			try {
				System.out.println(pilhaA.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
