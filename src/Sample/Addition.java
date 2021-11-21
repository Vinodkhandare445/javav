package Sample;

public class Addition {

	public static void main(String[] args) {
		String s="10abc25xyz54";
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isDigit(ch[i])) {
//				 System.out.print("Digits in the String : " + ch[i]);
//	                System.out.println();
				int n=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
