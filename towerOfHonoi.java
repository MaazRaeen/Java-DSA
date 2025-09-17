public class towerOfHonoi {
    public static void towrOfHonoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towrOfHonoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towrOfHonoi(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        int n=5;
        towrOfHonoi(n, "S","H","D");
    }
}