package HandsOn3;

class Degree{
    void getdegree(){
        System.out.println("I got a degree");}}
class Undergraduate extends Degree{
    void getdegree(){
        System.out.println("I am an Undergraduate ");}}
class postgraduate extends Degree{
    void getdegree(){
        System.out.println("I am an postgraduate ");}}

public class Main
{
	public static void main(String[] args) {
		Degree d1=new Degree();
		d1.getdegree();
		Undergraduate d2=new Undergraduate();
		d2.getdegree();
		postgraduate d3=new postgraduate();
		d3.getdegree();
	}
}