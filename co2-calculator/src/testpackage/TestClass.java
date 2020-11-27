package testpackage;

public class TestClass {
	
	//replacing ' ' by '%45'
	static char[] arr = new char[7];
	
	public static void main(String[] args) {
		replaceSpace(arr);
	}
	
	public static void replaceSpace(char[] arr) {
		arr[0] = 'r';
		arr[1] = 'u';
		arr[2] = ' ';
		arr[3] = 'e';
		arr[4] = 'n';
		
		int size = arr.length;
		int actualLength = 5;
		int j = size-1;
		
		for(int i=actualLength-1; i>=0; i--) {
			if(arr[i] == ' ') {
				arr[j--] = '5';
				arr[j--] = '4';
				arr[j--] = '%';
				
			}
			else {
				arr[j--] = arr[i];
			}
				
		}
		for(int i=0; i<7;i++)
			System.out.println(arr[i]);
		
		
	
		
	}

}
