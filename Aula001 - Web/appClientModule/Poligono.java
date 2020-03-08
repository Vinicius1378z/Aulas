
public abstract class Poligono extends Figura {

	private int base;
	private int altura;
	
	
	public Poligono(int base, int altura) {
		setBase(base);
		setAltura(altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		return getBase()*getAltura();
	}
	
	
	
	public int getAltura() {
		return altura;
	}
	public int getBase() {
		return base;
	}
	
	public void setAltura(int Altura) {
		this.altura = Altura;
	}
	public void setBase(int Base) {
		this.base = Base;
	}

}
