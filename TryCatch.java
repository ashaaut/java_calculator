public class TryCatch{
    public static void main(String [] args){
        try{
        String str="Welcome";
        char [] chars=str.toCharArray();
        char lastChar=chars[chars.length];
        System.out.println("last char: "+lastChar);
        String str1=null;
        System.out.println(str1.length());
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    
    }
}