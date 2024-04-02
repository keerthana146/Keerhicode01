package StringArray;

public class avaregeofstring ////Lets find of the avarage value present in given string.
{

	public static void main(String[] args)
	{
		int numbers[]=new int[5];
		numbers[0]=76;
		numbers[1]=21;
		numbers[2]=34;
		numbers[3]=66;
		numbers[4]=11;
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum + numbers[i];
			
		}
		System.out.println(sum);
		double average=sum/numbers.length;
		System.out.println(average);
		}
		

	}

