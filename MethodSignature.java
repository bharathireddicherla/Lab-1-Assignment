import java.util.Arrays;

public class MethodSignature {
	
	public static void main(String[] args) {
		
		int orgArr[] = {1,2,3,4};
		
		int newArr[] = copyOf(orgArr);
		
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
	}
	
	public static int[] copyOf(int[] array) {
		int copyArr[] = Arrays.copyOf(array, array.length);
		
		return copyArr;
	}

}
