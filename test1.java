
public abstract class test1 {

	public static void main(String[] args) {
		area[] a = new area[2];
		area c = new Circle(3);
		area r = new Rectangle(2);
		
		area[0] = c;
		area[1] = r;
		
		for(int i=0; i<anu.length; i++) {
			area[i].cal_area();
		}
		for(area)
			
	}
	class area{
		double r;
		area(double r){
			this.r = r;
		}
		double area() {
			System.out.println("Area is calculated from"+r);
		}
	}
	class Circle extends area{
		Circle(int r){
			super(r);
		}
		double cal_area() {
			return r*r*Math.PI;
		}
	}
	class Rectangle extends area{
		Rectangle(int r){
			super(r);
		}
		double cal_area() {
			return r*r;
		}
	}


}
