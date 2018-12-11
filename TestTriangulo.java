import javax.swing.JOptionPane;

public class TestTriangulo {

	

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(cateto1,cateto2);		
		String c1 = JOptionPane.showInputDialog(
				"introduzca el cateto1");
         int cateto1 =Integer.parseInt(c1);

         String c2 = JOptionPane.showInputDialog(
 				"introduzca el cateto2");
          int cateto2 =Integer.parseInt(c2);

        
        if(cateto1 > cateto2){
        	System.out.println("cateto1 es la altura");
        }else
        	System.out.println("cateto2 es la altura");
         
	    
	 
	

	}
}
