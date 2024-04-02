package StringArray;

public class Arrayoflen4_check6ispresent   //create array of length 4  and check given number 6 is present in array or not
{
	public static void main(String[] args)
	{
		int roll_no[]=new int[4];
		roll_no[0]=90;
		roll_no[1]=21;
		roll_no[2]=6;
		roll_no[3]=76;
		
		int number_to_check=6;
		
		for(int i=0;i<roll_no.length;i++)
		{
			if(roll_no[i]==number_to_check)
			{
				System.out.println("we found the number"+number_to_check + " At the index position "+ i);
			}
			else
			{
				System.out.println("Sorry we couldn found the numer" +number_to_check+" At the index Position"+6);
			}
		}
		
		
	}

}
