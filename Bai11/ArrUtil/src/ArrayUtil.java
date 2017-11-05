
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
		Arrays.sort(array);
		for(int i=0;i<n-2;i++){
			
			if(array[i]+array[i+1]>array[i+2]){
				System.out.println("ta co bo tam giac la "+array[i]+"   " +array[i+1]+"  "+array[i+2]);
			}
			
		}
	}

}
