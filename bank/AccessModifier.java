package bank;
class Account1{
    public String name;
    protected String Email;
    private String passWord;
    //getter and setter 
    public String getPassword(){
        return this.passWord;
    }
    public void setPassword(String pass){
        this.passWord=pass;
    }
}
    
public class AccessModifier {
    public static void main(String[] args) {
        Account1 acc1= new Account1();
        acc1.name="maaz";
        acc1.Email="MaazRaeen@gmail.com";
        // acc1.passWord="ab293";   --> we can not access private class by just calling them we have to use getter and setter for that;
        acc1.setPassword("Abier3");
        System.out.println(acc1.getPassword());

    }
}
