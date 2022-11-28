public class HolaMundo {
	
	public void saludar() {
		System.out.println("Hola Mundo");
	}
	
	public static void main (String[] args) {
		
		Presentador p = new Presentador();
		p.presentar();
		
		HolaMundo hm = new HolaMundo();
		hm.saludar();
		System.out.println("Esta es mi primera clase con GIT");
		System.out.println("Este es el texto correcto");
	}
}