public class TryCatch{
    public static void main(String [] args){
        try{
        String str="Welcome";
        char [] chars=str.toCharArray();
        char lastChar=chars[chars.length];
        System.out.println("last char: "+lastChar);
        } catch(Exception e){
            e.printStackTrace();
        }
    
    }
}