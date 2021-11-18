
import java.util.Scanner;
class Zodiac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your birth month?");
		String month = input.nextLine();
		System.out.println("What is the day you were born?");
		int days = input.nextInt();
		System.out.println("Were you born during a leap year? (true/false)");
		boolean leapYear = input.nextBoolean();
		input.close();
		int[] monthDayNotLeap = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] monthDayLeap = {31,29,31,30,31,30,31,31,30,31,30,31};
		int monthInd = 0;
		switch (month) {
		case "January":
			monthInd = 0;
			break;
		case "February":
			monthInd = 1;
			break;
		case "March":
			monthInd = 2;
			break;
		case "April":
			monthInd = 3;
			break;
		case "May":
			monthInd = 4;
			break;
		case "June":
			monthInd = 5;
			break;
		case "July":
			monthInd = 6;
			break;
		case "August":
			monthInd = 7;
			break;
		case "September":
			monthInd = 8;
			break;
		case "October":
			monthInd = 9;
			break;
		case "November":
			monthInd = 10;
			break;
		case "December":
			monthInd = 11;
			break;
		default:
			System.out.println("Not a valid month.");
		}
		int monthAccumulator = 0;
		int leapDay = 0;
		if (!leapYear) {
		for (int i=0; i<=monthInd-1; i++) {
			monthAccumulator += monthDayNotLeap[i];
		}
		} else if (leapYear) {
		leapDay = 1;
		for (int i=0; i<=monthInd-1; i++) {
			monthAccumulator += monthDayLeap[i];
		}
		}
		int zodiacScore = 0;
		if (!leapYear) {
		if (days<=monthDayNotLeap[monthInd]) {
			zodiacScore = monthAccumulator + days;
		} else {
			System.out.println("Your date is invalid.");
		}
		} else if (leapYear) {
		if (days<=monthDayLeap[monthInd]) {
			zodiacScore = monthAccumulator + days;
		} else {
			System.out.println("Your date is invalid.");
		}
		}
		if (((0<zodiacScore)&&(zodiacScore<=19))||((zodiacScore<=365+leapDay)&&(zodiacScore>=356+leapDay))) {
			System.out.println("Capricorn");
			
		} else if ((zodiacScore>=20)&&(zodiacScore<=49)) {
			System.out.println("Aquarius");
		} else if ((zodiacScore>=49)&&(zodiacScore<=79+leapDay)) {
			System.out.println("Pisces");
		} else if ((zodiacScore>=80+leapDay)&&(zodiacScore<=110+leapDay)) {
			System.out.println("Aries");
		} else if ((zodiacScore>=111+leapDay)&&(zodiacScore<=140+leapDay)) {
			System.out.println("Taurus");
		} else if ((zodiacScore>=141+leapDay)&&(zodiacScore<=172+leapDay)) {
			System.out.println("Gemini");
		} else if ((zodiacScore>=173+leapDay)&&(zodiacScore<=203+leapDay)) {
			System.out.println("Cancer");
		} else if ((zodiacScore>=204+leapDay)&&(zodiacScore<=235+leapDay)) {
			System.out.println("Leo");
		} else if ((zodiacScore>=236+leapDay)&&(zodiacScore<=265+leapDay)) {
			System.out.println("Virgo");
		} else if ((zodiacScore>=267+leapDay)&&(zodiacScore<=296+leapDay)) {
			System.out.println("Libra");
		} else if ((zodiacScore>=297+leapDay)&&(zodiacScore<=+326+leapDay)) {
			System.out.println("Scorpio");
		} else if ((zodiacScore>=327+leapDay)&&(zodiacScore<=355+leapDay)) {
			System.out.println("Sagittarius");
		}
		
	}
}