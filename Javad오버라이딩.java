package Java객체지향;

class point3 {
	int x ;
	int y ;
	
	//생성자
	point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x : " + x+", y: "+y ;
	}
}



public class Javad오버라이딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        	point3 p =new point3(3,5);
        
        	System.out.println(p);
        	
        	/* point3 p = new point3();
        	 * p.x = 3;
        	 * p.x = 5;
        	 * System.out.println("p.x :"+p.x+",p.y ="+p.y);
        	 * System.out.println(p.toString(
        	 */
        
	}

}
