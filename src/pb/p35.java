package pb;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class p35 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("text1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello");
			pw.println("GoodBye!");
			
			pw.close();
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}	
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
	}

}