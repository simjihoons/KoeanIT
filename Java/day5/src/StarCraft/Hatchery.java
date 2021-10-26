package StarCraft;

public class Hatchery {
	public static int zerglingCount = 0;
	private int hatcheryId;
	private String name;
	
	public Hatchery(int id) {
		this.hatcheryId = id;
		this.name = "해처리";
	}
	
	public Zergling createZergling() {
		zerglingCount++;
		if(zerglingCount>5) {
			System.out.println(zerglingCount+"/5 인구 수 초과\n더 이상 생산할 수 없음");
			zerglingCount--;
		}else {
			System.out.println("저글링 생산");
			System.out.println("생산 가능 저글링 수 : "+(5-zerglingCount));
		}
		return new Zergling("저글링");
	}
}
