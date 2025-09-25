public class moveX {
    public static void moveXtoEnd(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currCh=str.charAt(idx);
        if(currCh=='x'){
            count++;
            moveXtoEnd(str, idx+1, count, newString);
        }else{
            newString+=currCh;
            moveXtoEnd(str, idx+1, count, newString);
            return ;
        }
    }
    public static void main(String[] args) {
        String str="Maazxmaxxzz";
        String newString="";
        moveXtoEnd(str, 0, 0, newString);
    }
}
