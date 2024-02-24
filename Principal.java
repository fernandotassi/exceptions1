
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.*;

public class Principal
{
	public static void main(String[] args) throws ParseException 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("quarto: ");
		int quarto = scan.nextInt();
		System.out.print("entrada: ");
		Date in = sdf.parse(scan.next());
		System.out.print("saída: ");
		Date out = sdf.parse(scan.next());
		
		if(!out.after(in))
		{
			System.out.println("erro!");
		}
		else
		{
		    Reserva reserva = new Reserva(quarto, in, out);
		    System.out.println(reserva);
		    System.out.println("");
		    
		    System.out.print("entrada: ");
			in = sdf.parse(scan.next());
			System.out.print("saída: ");
			out = sdf.parse(scan.next());
			
			String erro = reserva.upData(in, out);
			if(erro != null)
			{
				System.out.println("Erro " + erro);
			}
			else
			{
				System.out.println(reserva);
		    } 
		 }
		
	
		
		
		
		
		
		scan.close();
	}
}
