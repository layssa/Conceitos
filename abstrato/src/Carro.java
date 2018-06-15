// Classe Carro;
abstract class Carro
{
	// Todo carro tem placa e cor;
	abstract void cor();
	abstract void placa();
}

//Agora podemos criar nossas classe “Concretas” com base na nossa classe abstrata:
//Classe Ferrari;
class Ferrari extends Carro
{
	void cor()
	{
		System.out.println("vermelho");
	}
	void placa()
	{
		System.out.println("JHKL1025");
	}
}

//Outra classe, Celta;
class Celta extends Carro
{
	void cor()
	{
		System.out.println("Rosa");
	}
	void placa()
	{
		System.out.println("HJU677");
	}
}

