package java_quick_sort;

public class Test {

	public static void quick_sort(int a[], int left, int right){
		
		if(left>=right){
			return;
		}
		
		int head, tail;
		int flag;
		head = left;
		tail = right;
		flag = a[left];
		
		
		
		while(head<tail){
			while(head<tail){
				if(a[tail]>=flag)
					tail--;
				else
					break;
			}
			a[head] = a[tail];
//			System.out.print(a[head]+"  "+a[tail]);
			while(head<tail){
				if(a[head]<=flag)
					head++;
				else
					break;
			}
			a[tail] = a[head];
		}
		
		a[head] = flag;
		quick_sort(a, left, head-1);
		quick_sort(a, head+1, right);
	}
	
	public static void display(int a[]){
		int k = 0;
		while(k<=9){
			System.out.print(a[k]+"  ");
			k++;
		}
		System.out.println("\n");
	}
	
	public static void main(String args[]){
		int array[] = {45, 32, 72, 13, 89, 27, 38, 66, 51, 8};
		display(array);
		quick_sort(array, 0, 9);
		system.out.println("快速排序后：");
		display(array);		
	}
	
}
