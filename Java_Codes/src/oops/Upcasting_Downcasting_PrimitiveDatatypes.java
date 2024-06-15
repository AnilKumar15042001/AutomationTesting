package oops;

public class Upcasting_Downcasting_PrimitiveDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logic-1:-upcasting using primitive datatype
		
		byte b=127;
		short sh=4354;
		int n=313331;
		long l=34543544354354554l;
		
		float f=245.235435f;
		double d=211231.313135435435355;
		
//		upcasting
		
		int a=b;  //int
		a=sh;
		
		sh=b;   //short
		
		d=l;
		System.out.println(d);
		l=b;    //long
		l=sh;
		l=n;
		
		d=f;
		d=n;
		d=l;
		System.out.println(a);
		System.out.println(sh);
		System.out.println(l);
		System.out.println(d);
		
		//downcasting
		
		int x=21131;
		short s=(short) x;
		System.out.println(s);
		
		
		long z=1354353543543543535l;
		s=(short) z;
		x=(int) z;
		System.out.println(s);
		System.out.println(x);
		
		double dol=12.13435435435;
		float ft=(float) dol;
		System.out.println(ft);
		
		
		
	}

}
