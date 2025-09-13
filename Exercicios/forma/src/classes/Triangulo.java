package classes;

public class Triangulo extends Forma {
	private double altura, base;
	
	public Triangulo(String cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.base = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return base;
	}

	public void setLargura(double largura) {
		this.base = largura;
	}
	
	public double obterArea() {
		return (base * altura)/2;
	}
	
	@Override
	public String toString() {
		return String.format("Triângulo %s altura %.1f e largura %.1f tem área = %.1f",super.getCor(), altura, base, obterArea() );
	}
}
