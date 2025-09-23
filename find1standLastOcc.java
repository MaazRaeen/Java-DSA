public class find1standLastOcc {
    public static int first=-1;
    public static int last=-1;
    public static void findOcc(String str, int idx, char el){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currCh = str.charAt(idx);
        if(currCh==el){
            if(first==-1){
                first=idx;
            }else{
            last=idx;
            }
        }
        findOcc(str, idx+1, el);
    }
    public static void main(String[] args) {
        String str="maaz";
        findOcc(str, 0, 'a');
    }
}
