package HandsOn3;


public class PrintNumber {

   public void printn(int num) {

       System.out.println("Integer number: " + num);

   }

   public void printn(float num) {

       System.out.println("Float number: " + num);

   }

   public void printn(double num) {

       System.out.println("Double number: " + num);

   }

   public void printn(long num) {

       System.out.println("Long number: " + num);

   }

   public void printn(short num) {

       System.out.println("Short number: " + num);

   }

   public void printn(byte num) {

       System.out.println("Byte number: " + num);

   }

   public static void main(String[] args) {

       PrintNumber obj = new PrintNumber();

       obj.printn(10);

       obj.printn(10.0f);

       obj.printn(10.0);

       obj.printn(10000000000L);

       obj.printn((short) 10);

       obj.printn((byte) 1);

   

}

}
