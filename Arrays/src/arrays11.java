11)
import java.util.Random;

public class arrays11
{

	public static void main(String[] args)
	{
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0; i < (arr.length / 2); ++i)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int j : arr)
		{
			System.out.println(j);
		}
	}
}