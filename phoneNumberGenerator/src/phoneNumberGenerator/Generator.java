package phoneNumberGenerator;

public class Generator {
 public static void main(String[] args) {
	 String one = ""+Math.round(7*Math.random())+Math.round(7*Math.random())+Math.round(7*Math.random());
	 int two = 799;
	 String two_string = "";
	 while (two >= 742) {
		int a = (int)Math.round(Math.random()*9);
		int b = (int)Math.round(Math.random()*9);
		int c = (int)Math.round(Math.random()*9);
		two_string = ""+a+b+c;
		two = Integer.parseInt(two_string);
	 }
	 String three = ""+Math.round(Math.random()*9)+Math.round(Math.random()*9)+Math.round(Math.random()*9)+Math.round(Math.random()*9);
	 String phone_number = one+"-"+two_string+"-"+three;
	 System.out.println(phone_number);
 }
}
