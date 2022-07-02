public class method4 {
    public static void main(String[] args) {


        String version1 = "Ahmet";
        String result = "";

        int lengthOfWord = version1.length();//5

        for(int i = lengthOfWord-1;i >= 0;i--){
            result += version1.substring(i,i+1);
        }

        System.out.println("version1 = " + version1);
        System.out.println("result = " + result);

    }
}
