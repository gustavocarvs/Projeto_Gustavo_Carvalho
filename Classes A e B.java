import java.util.Scanner;
import java.util.Locale; 

class A {
	
	private Integer A1;
	private float A1;
	
	public A(Integer A1, float A2){
		this.A1 = A1;
		this.A2 = A2;
	}
	
	public Integer getA1(){
		return A1;
	}
	
	public float getA2(){
		return A2;
	}
	
	public void setA1(Integer A1) {
		this.A1 = A1;
	}
	
	public void setA2(float A2) {
		this.A2 = A2;
	}
	
	public void MA1(){
        System.out.println("Metodo MA1 com valor: "+getA1());
    }
	
	public void MA2(){
        System.out.println("Metodo MA2 com valor: "+getA2());
    }
	
	public String MA3(){
		return "Alteração da classe A partir do clone";
	}
}

class B {
	
	private Integer B1;
	private float B2;
	
	public B(Integer B1, float B2){
		this.B1 = B1;
		this.B2 = B2;
	}
	
	public Integer getB1(){
		return B1;
	}
	
	public float getB2(){
		return B2;
	}
	
	public void setB1(Integer B1) {
		this.B1 = B1;
	}
	public void setB2(float B2) {
		this.B2 = B2;
	}
	
	public void MB1(){
        System.out.println("Metodo MB1 com valor: "+getB1());
    }
	
	public void MB2(){
        System.out.println("Metodo MB2 com valor: "+getB2());
    }

}
class C {
	
	private String C1;
	private Integer C2;
	
	public C(String C1, Integer C2){
		this.C1 = C1;
		this.C2 = C2;
	}
	
	
	public void MC1(){
        System.out.println("Metodo MC1");
    }
	
	public void MC2(){
        System.out.println("Metodo MC2");
    }

}
