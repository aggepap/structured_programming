package gr.aueb.cf.ch8;

public class _04NullPointerApp {
    public static void main(String[] args) {
        String s = null;
if(s== null){
    System.out.println("String is Null");
    return;

}
        if(s.equals("Athens")){
            System.out.println("Equals");
        }
    }
}
