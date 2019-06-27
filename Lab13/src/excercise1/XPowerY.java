package excercise1;

import java.util.Scanner;

interface Power
{
	public int calculatePower(int x,int y);
}
public class XPowerY {

	public static void main(String[] args) {
		
		
		
		Power p=(int x,int y)->{
			int res=1;
			while(y>0)
			{
				res=res*x;
				y=y-1;
			}
			return res;
		};
		
		int po=p.calculatePower(2,3);
		System.out.println(po);
	}

}
