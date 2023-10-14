import java.util.*;
class ReverseArray{
public static void rA(int n[]){
    int first=0;
    int last=n.length-1;
    while(first<last){
        //swap
        int temp=n[last];
        n[last]=n[first];
        n[first]=temp;
        first ++;
        last --;
    }
    System.out.println("Reversed array is: \n");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
}
    public static void main(String args []) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int n[] = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                n[i] = sc.nextInt();
            }
        }
       rA(n);
    }
}
