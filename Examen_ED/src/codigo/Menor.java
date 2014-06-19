package codigo;

/*
 * Clase que nos devuelve el n�mero menor entre dos n�meros
 * */
public class Menor {
	//Inicializaci�n
	private int a;
	private int b;

	//Constructor
	public Menor() {
		a=0;
		b=0;
	}
	
	public void setA(int a){
		this.a=b;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//M�todo que permite decolver el n�mero mayor
	public int menor(){
		if(a<b) return a;
		else return b;
	}
}
