package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1 = " + result1 + ", " + "result2 = " + result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("주말 이군요.");
		}else {
			System.out.println("평일 이군요");
		}
		
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + ",");
		}
		
		System.out.println();
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i].ordinal() + ",");
		}
		
		System.out.println();
		System.out.println();
		for(Week day:days) {
			System.out.println(day);
		}
	}

}
