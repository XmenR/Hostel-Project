/**
 * 
 */
package rishi;

/**
 * @author XmenR
 * Program To check Validity of a person name :
 * 1: Name must contain Surname
 *
 */
public class NameValidity {
	public void NameCheck (String name) {
		boolean flag1=false;
		for(int i=0;i< name.length();i++) {
			int unicodenumber;
			unicodenumber= name.charAt(i);
			if (unicodenumber=20){
				flag1=true;
			}
			else {
				
				System.out.println("Please Input Surname after Space");
			}
		}
	}

}
