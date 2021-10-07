import java.util.*;
class main{
public static void main(String args[])
{
	while(true){
	Scanner sc= new Scanner(System.in);
	int ch;
	System.out.println("1.Rock\n2.Papaer\n3.Scissor\nSelect any of the above");
	ch= sc.nextInt();
	String player;
	String[] arr={"Rock","Paper","Scissor"};
	Random random= new Random();
	String bot= arr[random.nextInt(arr.length)];

	switch(ch)
	{
		case 1:
			player="Rock";
			System.out.println("Computer choosed: "+ bot);
			if(player.equals(bot))
			{
				
				System.out.println("Tie");
			}
			else if(bot.equals("Paper"))
				System.out.println("You lost");
			else
				System.out.println("You Win");
			break;
		case 2:
			player="Paper";
			System.out.println("Computer choosed: "+ bot);
			if(player.equals(bot))
				System.out.println("Tie");
			else if(bot.equals("Scissor"))
				System.out.println("You lost");
			else
				System.out.println("You Win");
			break;
		case 3:
			player="Scissor";
			System.out.println("Computer choosed: "+ bot);
			if(player.equals(bot))
				System.out.println("Tie");
			else if(bot.equals("Rock"))
				System.out.println("You lost");
			else
				System.out.println("You Win");
			break;
		default:
			System.out.println("Invalid Choice!")
			
	}
	}
}
}