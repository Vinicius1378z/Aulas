
public class Retangulo extends Poligono {

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}

}
