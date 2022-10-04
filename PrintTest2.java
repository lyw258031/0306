public class PrintTest2 {
    public static void main(String[] args) {
        int sum =0;
        int count=0;
        for (int i = 1; i <= 100; i++) {
            if(i%7==0){
                sum+=i;
                count++;
            }
        }
        System.out.println("个数:"+sum+"总和:"+count);
    }
}

