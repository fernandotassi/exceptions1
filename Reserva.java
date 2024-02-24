
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class Reserva 
{
	private Integer quarto;
	private Date in;
	private Date out;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer quarto, Date in, Date out)
	{this.quarto = quarto; this.in = in; this.out = out;}
	
	public Reserva(){}
	
	public void setQuarto(Integer quarto){this.quarto = quarto;}
	public Integer getQuarto(){return quarto;}
	public Date getIn(){return in;}
	public Date getOut(){return out;}
	public long duracao()
	{
		long dife = out.getTime() - in.getTime();
		return TimeUnit.DAYS.convert(dife, TimeUnit.MILLISECONDS);
	}
	public void upData(Date in, Date out)
	{
		this.in = in; this.out = out;
	}
	@Override
	public String toString()
	{
		return "reserva: quarto " + quarto + ", in: " + sdf.format(in) + ", out: " + sdf.format(out) + ", " + duracao();
	}
}
