
public class Losangulo extends Poligono {

	public Losangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}

}
