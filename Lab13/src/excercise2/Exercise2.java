package excercise2;

interface Space
{
	public String getSpace(String s);
}


public class Exercise2 {
	public static void main(String args[])
	{
		Space sp=(s)->{
			StringBuilder res= new StringBuilder();
			for (int i=0;i<s.length();i++) {
			   if(i>0){
			      res.append(" ");
			    }

			   res.append(s.charAt(i));
			}

			
		return res.toString();
		};
		
		String res=sp.getSpace("Capgemini");
		System.out.println(res);
	}
}
