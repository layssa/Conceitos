package polimorfismo;

public interface Carro
{
	public void acelerar();
}

public class Ferrari implements Carro
{
	public void acelerar()
	{
		System.out.println("Ferrari acelerando...");
	}
}

public class Fusca implements Carro
{
	public void acelerar()
	{
		System.out.println("Fusca tentando acelerar...");
	}
}

Carro c = new Ferrari();
c.acelerar();

c = new Fusca();
c.acelerar();