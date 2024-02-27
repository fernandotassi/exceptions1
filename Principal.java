
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.InputMismatchException;

public class Principal
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    try
		    {
				System.out.print("quarto: ");
				int quarto = scan.nextInt();
				System.out.print("entrada: ");
				Date in = sdf.parse(scan.next());
				System.out.print("saída: ");
				Date out = sdf.parse(scan.next());
				
				Reserva reserva = new Reserva(quarto, in, out);
				System.out.println(reserva);
				System.out.println("");
				
				System.out.print("entrada: ");
				in = sdf.parse(scan.next());
				System.out.print("saída: ");
				out = sdf.parse(scan.next());
				
				reserva.upData(in, out);
				System.out.println(reserva);
		    }
		    catch(ParseException e){System.out.println("formato inválido! ");}
		    catch(DominioExcecao e){System.out.println("datas erradas " + e.getMessage());}
	        catch(InputMismatchException e){System.out.println("inesperado!");}
		
		
		
		
		
		scan.close();
	}
}
