package ar.edu.unlam.pb2.clase2;

public class Circulo {
	@SuppressWarnings("unused")
	private Float radio, perimetroCirculo,areaCirculo;	
	
	
	public void calcularPerimetro (Float radio){
		perimetroCirculo =(float) (radio *2*3.14);
	}
	
	public void calcularArea (Float radio){
		areaCirculo =(float) Math.pow(radio*3.14, 2);
	}
	
	public float visualizarPerimetro(){
		return this.perimetroCirculo;
	}
	
	public float visualizarArea(){
		return this.areaCirculo;
	}

}