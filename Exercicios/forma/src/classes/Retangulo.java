package classes;

public class Retangulo extends Forma {
	private double altura, largura;
	
	public Retangulo(String cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double obterArea() {
		return largura * altura;
	}
	
	@Override
	public String toString() {
		return String.format("Retângulo %s altura %.1f e largura %.1f tem área = %.1f",super.getCor(), altura, largura, obterArea() );
	}
}
