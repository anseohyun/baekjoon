import java.util.Scanner;

public class 괄호 {

	public static void main(String[] args) {
		
		
		int num = 0;
		int left = 0;
		int right = 0;
        String text;
        String r = "(";
        String l = ")";
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 0 ; i <= num ; i++) {
			text = sc.next();
			
			for(int j = 0 ; j <text.length() ; j++) {
                
				if(text.substring(j,j+1).equals(r))
				{
					left++;
				}
				else if(text.substring(j,j+1).equals(l))
				{
					right++;
				}
			}
			
			if(right == left)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			right = 0;
			left = 0;
		}
	}

	

}
