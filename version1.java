public class version1{
    private boolean isSaying(){
            return true;
    }
    public static void main(String[] agrs){
        System.out.println("this is merge from master");
        version1 version = new version1();
        version.isSaying();
    }
}