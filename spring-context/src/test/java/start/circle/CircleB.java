package start.circle;

public class CircleB {

	private CircleA circleA;

	private CircleB(){}

	public CircleB(CircleA circleA){
		this.circleA = circleA;
	}

	public void b() {
		System.out.println("B");
		circleA.a();
	}

	public CircleA getCircleA() {
		return circleA;
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}
