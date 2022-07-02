public class method1 {
    public static void main(String[] args) {

        String version1 = "Ahmet";
        String result = "";

        String[] arr = version1.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }

        System.out.println("version1 = " + version1);
        System.out.println("result = " + result);



    }
}
