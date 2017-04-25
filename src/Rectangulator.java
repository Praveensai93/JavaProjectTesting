public class Rectangulator
{
public static void main(String args[])
{
int length=Integer.parseInt(args[0]);
int width=Integer.parseInt(args[1]);
Rectangle myRectangle=new Rectangle(length,width);
String output=String.format("***Your Retangle ***\n\n Length: %d\n Width : %d\nArea:%d\n Perimeter %d \n\n",myRectangle.Length,myRectangle.width,myRectangle.getArea(),myRectangle.getPerimeter());
System.out.println(output);
}
}
