package start.circle;

public class CircleA {

	private CircleB circleB;

	public CircleA(){}

	public CircleA(CircleB circleB){
		this.circleB = circleB;
	}

	public void a() {
		System.out.println("A");
		circleB.b();
	}

	public CircleB getCircleB() {
		return circleB;
	}

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}
}
