import java.io.*;
import java.util.Random;

public class Zreb
{
	public static void main(String[] args) throws IOException
	{
		int stevec = 0;
		boolean obstaja = true;
		Random rand = new Random();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Vnesi stevilo dijakov v razredu");
		int st_dijakov = Integer.parseInt(reader.readLine());
		
		int[] tabela_dijakov = new int[st_dijakov];
		
		while(stevec < tabela_dijakov.length)
		{
			obstaja = false;
			int random = rand.nextInt(tabela_dijakov.length) + 1;
			
			for(int i = 0; i < tabela_dijakov.length; i++)
			{
				if(tabela_dijakov[i] == random)
				{
					obstaja = true;
				}
			}
			
			if(obstaja == false)
			{
				tabela_dijakov[stevec] = random;
				stevec++;
			}
		}
		
		for(int a = 0; a < tabela_dijakov.length; a++)
		{
			System.out.print(tabela_dijakov[a] + " ");
		}
	}
}