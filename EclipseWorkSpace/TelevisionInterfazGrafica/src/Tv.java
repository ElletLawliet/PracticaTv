
public class Tv {
	private int canal = 1;
	private int volumen;
	private boolean estaEncendido;
	
	public void encender(){
		this.estaEncendido = true;
	}
	
	public void apagar(){
		this.estaEncendido = false;
	}
	
	public void subirVolumen(){
		if(estaEncendido && volumen < 100){
			this.volumen++;
		}
	}
	
	public void bajarVolumen(){
		if(estaEncendido && volumen > 0){
			this.volumen--;
		}
	}
	
	public void subirCanal(){
		if(estaEncendido && canal < 50){
			this.canal++;
		}
	}
	
	public void bajarCanal(){
		if(estaEncendido && canal > 1){
			this.canal--;
		}
	}
	
	public void setCanal(int canal){
		if(estaEncendido && canal > 0 && canal < 51){
			this.canal = canal;
		}
		
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public int getVolumen(){
		return this.volumen;
	}
	
	
	
}
