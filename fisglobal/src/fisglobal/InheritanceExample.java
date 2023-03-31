package fisglobal;

class Box2D extends Object{
	int length;
	int breadth;

	public Box2D() {
		System.out.println("inside box2d constructor");
		length = 4;
		breadth = 2;
	}

	public void calArea() {
		System.out.println("The surface area of box   :" + (length * breadth));
	}
	
	public void display() {
		System.out.println("Inside the box2d display method");
	}
}

class Box3D extends Box2D {

	int height;

	public Box3D() {
		System.out.println("inside box3d constructor");
		height = 3;
	}

	public void calVolume() {
		System.out.println("The Volume of box   :" + (length * breadth * height));
	}
	public void display() {
		System.out.println("Inside the box3d display method");
	}
	
	@Override
	protected void finalize() throws Throwable{ // destructor
		System.out.println("finally reclaimed");
	}

}

public class InheritanceExample {

	public static void main(String[] args) {
		

		Box3D box2 = new Box3D();
		
		System.out.println(box2);
		box2.calArea();
		box2.calVolume();
		box2.display();

	}

}
