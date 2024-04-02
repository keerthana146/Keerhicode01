package StringArray;

public class Copyofarraytoanotherarray {

	public static void main(String[] args) {
	
		int num01[]=new int[5];
		int number[]=new int[5];
		number[0]=23;
		number[1]=76;
		number[2]=33;
		number[3]=213;
		number[4]=7;
		number[5]=43;
		for(int i=0;i<number.length;i++)
		{
			num01[i]=number[i];
			
		}
		
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(num01));
		

	}

}
