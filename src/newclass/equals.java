package newclass;
public class equals {
    public static void main(String[] args){
      String a="a";
      String b="b";
      if(a.equals(b)){
          System.out.print("Hello");
      }
      String c=new String("x");
      String d=new String("x");
      if(c.equals(d)){
          System.out.println("World");
      }
    }
}
