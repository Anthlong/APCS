package bruh;

public class LipogramAnalyzer {
	private String txt;
	public LipogramAnalyzer(String text) {
		txt = text+" ";
	}
	public String mark(char letter) {
		String temp = "";
		for (int i = 0; i<txt.length();i++) {
			if (String.valueOf(letter).equals(String.valueOf(txt.charAt(i)))) {
				temp+="#";
			} else {
				temp+=String.valueOf(txt.charAt(i));
			}
		}
		return temp;
	}
	public String allWordsWith(char letter) {
		String res = "";
		for (int i=0;i<txt.length();i++) {
			String sub = "";
			if (i==0) {
				sub = txt.substring(0,txt.indexOf(" ",1));
				System.out.println(sub);
			} else if ((String.valueOf(txt.charAt(i)).equals(" ")==true)) {
				if (txt.indexOf(" ",i+1)!=-1) {
					sub = txt.substring(i+1,txt.indexOf(" ",i+1));
				} else {
					sub = txt.substring(i+1);
				}
				if (sub.indexOf(letter)!=-1) {
					if (res.indexOf(sub)==-1) {
						res+=sub+"\n";
					}
				}
			}
		}
		return res;
	}
}
