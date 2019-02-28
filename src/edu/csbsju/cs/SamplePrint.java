/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author jbrakob001
 *
 */
public class SamplePrint {

	/**
	 * 
	 */
	public SamplePrint() {
		// TODO Auto-generated constructor stub
	}

	private String pName;
	private int pAge;
	
	public SamplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Tyreese");
		System.out.println("Justin");
		for(int i=0; i<args.length;i++)
		{
			System.out.println("args[ " + i + " ] = " + args[i] );
		}
	}

}
