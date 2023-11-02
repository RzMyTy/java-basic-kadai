package kadai_014;

public class Car_Chapter14 {
	
	//フィールド
	private int gear = 1;
	private int speed = 10;
	
	//メソッド①
	public void gearChange( int afterGear ) {
		if( afterGear >= 1 && afterGear <= 5) {
			this.gear = afterGear;
			this.speed = getSpeed(afterGear);
		} else {
			this.gear = 1;
			this.speed = 0;
		}
		
		System.out.println("ギア1から" + gear + "に切り替えました");
	}
	
		public int getSpeed(int gear) {
			return switch (gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
	}
	
	//メソッド②
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}