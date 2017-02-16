import java.util.Random;

public class CoinFlip
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int n = r.nextInt(100) + 1;// n is random int 1 to 100
		//if no args then assume fair coin
		if(args.length == 0)
		{
			if(n <= 50){
				System.out.println("Heads");
				return;
			}
			else{
				System.out.println("Tails");
				return;
			}
		}
		//if 1 argument is given assume it is probability of heads
		if(args.length == 1)
		{
			if(Integer.parseInt(args[0]) >= 0 && Integer.parseInt(args[0]) <=100)
			{
				int val = Integer.parseInt(args[0]);
				if (n <= val)
				{
					System.out.println("Heads");
					return;
				}
				else
				{
					System.out.println("Tails");
					return;
				}
			}
			else
			{
				System.out.println("Invalid entry for probability");
				return;
			}
		}

		//if 2 or more arguments given then assume 1st arg is for heads probability: 2nd is for tails probability.  They must add to 100
		if(args.length > 1)
		{
			int h = Integer.parseInt(args[0]);
			int t = Integer.parseInt(args[1]);
			if((h + t) != 100)
			{
				System.out.println("Invalid, probabilities don't add to 100");
				return;
			}
			if(Integer.parseInt(args[0]) >= 0 && Integer.parseInt(args[0]) <=100)
			{
				int val = Integer.parseInt(args[0]);
				if (n <= val)
				{
					System.out.println("Heads");
					return;
				}
				else
				{
					System.out.println("Tails");
					return;
				}
			}
			else
			{
				System.out.println("Invalid entry for probability");
				return;
			}
		}
	}
}