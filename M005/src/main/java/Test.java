public class Test {

    public static void main(String[] args) {
        String result="Total is 45";
        //I want to increase 5 total

        String newResult= result.substring(0,result.lastIndexOf(" "))+(Integer.parseInt(result.substring(result.lastIndexOf(" ")))+5);

        System.out.println(newResult);

    }
}
