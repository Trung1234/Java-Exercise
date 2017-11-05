
import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by My PC on 05/11/2017.
 */
public class ArrayUtil {
	int n;
	int array[]= new int[n];
	
	public ArrayUtil(int n) {
		this.n = n;
		Random rd = new Random();
		System.out.println("random 1 number bettween 50");
		for (int i = 0; i < n; i++) {
			System.out.println("Item " + (i + 1) + ":" + rd.nextInt(50));
		}
	}
	public  void findTraingle(){
		System.out.println("Các bộ cạnh tam giác là: ");
		for(int i=0;i<n-2;i++){
			//Giả sử: array[i] là cạnh a, array[i+1] là cạnh b, array[i+2] là cạnh c
			//Nếu cạnh a + cạnh b > cạnh c
			boolean ab = array[i]+array[i+1]>array[i+2];
			//Nếu cạnh a + cạnh c > cạnh b
			boolean ac = array[i]+array[i+2]>array[i+1];
			//Nếu cạnh b + cạnh c > cạnh a
			boolean bc = array[i+1]+array[i+2]>array[i];
			if(ab && ac && bc){
				//In ra bộ 3 cạnh a,b,c thỏa mãn là 3 cạnh tam giác
				System.out.println(array[i]+"," +array[i+1]+","+array[i+2]);
			}
		}
	}

}
