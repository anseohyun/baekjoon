import java.util.Scanner;

public class 괄호 {

	public static void main(String[] args) {
		
		
		int num;
		int left = 0;
		int right = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			String text = sc.nextLine();
			
			for(int j = 0 ; j <text.length() ; j++) {
				if(text.substring(j) == "(");
				{
					left++;
				}
				if(text.substring(j) == ")")
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
