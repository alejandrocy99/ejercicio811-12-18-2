
public class Triangulo{
       private int cateto1;
       private  int cateto2;
	
     public Triangulo(int cateto1,int cateto2) {
    	 this.cateto1 = cateto1;
         this.cateto2 = cateto2;
     }
    
 


	@Override
	public String toString() {
		return "Triangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2 + "]";
	}




	public int getCateto1() {
		return cateto1;
	}
	public void setCateto1(int cateto1) {
		this.cateto1 = cateto1;
	}
	public int getCateto2() {
		return cateto2;
	}
	public void setCateto2(int cateto2) {
		this.cateto2 = cateto2;
	}

    public double calcularHipotenusa() {
    	
    	
		return Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
         	
    }
    
    public double calcularPerimetro() {
    	
    	return (calcularHipotenusa() + cateto1 + cateto2);
    }
	
    public int calcularArea() {
     return (cateto1 * cateto2);
 }
}