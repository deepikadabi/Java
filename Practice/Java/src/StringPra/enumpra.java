package StringPra;

public class enumpra {

	enum Day{
		SUN(1),MON(2),TUES(3),WED(4),THRUS(5),FRI(6),SAT(7);
		private int dayNo;
		Day(int dayNo){
			this.dayNo = dayNo;
		}
		int getDay() {
			return dayNo;
		}
	}
	public static void main(String[] args) {
		Day d = Day.MON;
		System.out.println(d);
		System.out.println(d.getDay());
		for(Object a : Day.values())
			System.out.println(a);
	}

}
