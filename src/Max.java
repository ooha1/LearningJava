public class Max {
    static void maximum(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
    static void minimum(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        maximum(a);
        minimum(a);
        int sum = 0;
        for(int i= 0; i<a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("sum is  " +sum);
    }
}
