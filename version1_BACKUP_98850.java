public class version1{
    private boolean isSaying(){
        int n = 0;
        n++;
            return true;
    }
    public static void main(String[] agrs){
<<<<<<< HEAD
        System.out.println("this is merge from master");
=======
        System.out.println("this is on merge comflict branch test2");
        System.out.println("this is on merge comflict branch dev test3");
>>>>>>> dev
        version1 version = new version1();
        version.isSaying();
    }
}