public class quadratic{
	public static void main(String[]args){
    int a=8;
    int b=-5;
    int c=1;
    double x1,x2,D;

    D=(b*b)-4*a*c;
    x1=(-b+Math.sqrt(D))/2*a;
    x2=(-b-Math.sqrt(D))/2*a;

    if(D>=0)
        System.out.println(" the roots are: "+x1+" "+x2);
    else
        System.out.println(" there are no real solutions ");
    }
}
    
    
