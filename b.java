

public class b {
    public static void main(String[] args) {
        int[] arrNum = {45,12,78,34,67,8};
        int temp = 0;
        System.out.println("Sorted array elements:");
        for(int i=0;i<arrNum.length;i++) {
            for(int j=i+1;j<arrNum.length;j++) {
                if(arrNum[i] > arrNum[j]) {
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
            System.out.println(arrNum[i]);
        }
    }
    }

