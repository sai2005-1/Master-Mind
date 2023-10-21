import TurtleGraphics.KeyboardReader;
import java.util.Random;
public class MastermindMethod {
	Random generator = new Random();
	KeyboardReader reader = new KeyboardReader();
	public void Game()
	{
		int peg1, peg2, peg3, number=1;
		int guess1=0, guess2=0, guess3=0;
		
		peg1=generator.nextInt(5)+1;
		peg2=generator.nextInt(5)+1;
		peg3=generator.nextInt(5)+1;
		
		while((guess1!=peg1)||(guess2!=peg2)||(guess3!=peg3))
		{
			System.out.println("Guess "+number+": ");
			System.out.print("   First peg (1-5): ");
			guess1=reader.readInt();
			System.out.print("   Second peg (1-5): ");
			guess2=reader.readInt();
			System.out.print("   Third peg (1-5): ");
			guess3=reader.readInt();
			
			Check(peg1, peg2, peg3, guess1, guess2, guess3);
			number++;
		}
		System.out.println("You have broken the code in "+number+" guesses");
		
	}
	
	public void Check(int p1, int p2, int p3, int g1, int g2, int g3)
	{
		int correctp=0, correctc=0;
		
		if(g1==p1)
		{
			correctp++;
		}
		else if((g1!=p1)&&(g1==p2)||(g1==p3))
		{
			correctc++;
		}
		if(g2==p2)
		{
			correctp++;
		}
		else if((g2!=p2)&&(g2==p1)||(g2==p3))
		{
			correctc++;
		}
		if(g3==p3)
		{
			correctp++;
		}
		else if((g3!=p3)&&(g3==p1)||(g3==p2))
		{
			correctc++;
		}
		
		System.out.println("You have "+correctp+" correct peg(s) and "+correctc+" correct color(s)");
	}

}
