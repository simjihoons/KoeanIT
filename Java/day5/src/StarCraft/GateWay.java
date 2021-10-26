package StarCraft;

public class GateWay {
	// static 변수는 인스턴스들이 공유할 수 있는 변수
	public static int zealotCount = 0;
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		this.name = "게이트웨이";
	}

	//질럿 생산
	public Zealot createZealot() {
		System.out.println("질럿을 생산 합니다.");
		zealotCount++;
		return new Zealot("질럿");
	}

	
	
}
