package precilla;

public class ArrayExample {
	void processData() {
	int arr[]=new int[5];
	arr[0]= 1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
		for(int index=0;index<arr.length;index++) {
			System.out.println(""+arr[index]);
		}
	}
	
	public static void main(String[] args) {
		ArrayExample arrayExample=new ArrayExample();
		arrayExample.processData();
		System.out.println(arrayExample);
	
	}
}
