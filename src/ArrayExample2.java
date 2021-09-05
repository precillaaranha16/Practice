package precilla;

public class ArrayExample2 {
	int getMaxCount(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[index];
			//System.out.println(count);
		}	
		return sum;	
	}
	void getNumbers(int num) {
		int index;
		int output[]=new int[5];
		for(index=0;index<output.length;index++) {
			num--;
			output[index]=num;
			
		}
		System.out.print(output[index]+" ");
	}
	int getLength(String[] arr) {
		int lengthSum = 0;
		for(int index=0;index<arr.length;index++) {
			lengthSum+=arr[index].length();
		}
		return lengthSum;
	}
	int getSumofOddEven(String[] arr) {
		int evenLength=0;
		int oddLength=0;
		int sum=0;
		//difference between even length and odd length
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()%2==0) 
				evenLength+=arr[index].length();
			else
				oddLength+=arr[index].length();	
			sum=evenLength-oddLength;
			}
		return sum;
		}
	int getSumofEvenNumbersandOddNumbers(int[] arr) {
		int evenSum=0;
		int oddSum=0;
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0) 
				evenSum=evenSum+arr[index];
			else
				oddSum=oddSum+arr[index];
			sum=evenSum-oddSum;
		}
		return sum;
	}
	char[] middleChar(String[] arr) {
		char[] output=new char[arr.length];
		for(int index=0;index<arr.length;index++)
		{
			int mCharIndex;
			if((arr[index].length()%2)==0)
				mCharIndex=arr[index].length()/2-1+1;
			else
				mCharIndex=arr[index].length()/2;
			output[index]=arr[index].charAt(mCharIndex);
		}
	return output;
	}
	int[] getNumbers1(int num) {
		int[] output=new int[5];
		for(int index=0;index<5;index++) {
			num--;
			output[index]=num;
		//System.out.println(output);
		}
		return output;
	}
	
	
	int processData() {
		int[] array=new int[5];
		array[0]=2;
		array[1]=3;
		array[2]=4;
		array[3]=44;
		array[4]=1;
		
		String[] arr=new String[4];
		arr[0]="Precilla";
		arr[1]="Aranha";
		arr[2]="Hi";
		arr[3]="Hello";
		System.out.println(getMaxCount(array));
		
		//array1.getNumbers(50);
		System.out.println(getLength(arr));
		System.out.println(getSumofOddEven(arr));
		System.out.println(getSumofEvenNumbersandOddNumbers(array));
		System.out.println(middleChar(arr));
		return 0;
	}
	
	public static void main(String[] args) {
	ArrayExample2 array1=new ArrayExample2();
	array1.processData();
	System.out.println(array1.getNumbers1(50));
	//System.out.println(array1.middleChar(50));

	}
}
