package rishi;

class MobileNoValidity
{	
	public void check(String num)
	{

		try {
			boolean flag1 = false, flag2 = false;
			int check = 0;
			
				if (num.length() == 10)
				{
					flag1 = true;
				}
				else
				{
					System.out.println("Please Enter 10 digit Mobile number");
					System.exit(101);
				}
				for (int i = 0; i < 10; i++)
				{
					int unicodenumber;
					unicodenumber = num.charAt(i);
					switch (unicodenumber=032) 
					{
						case 48:
							check++;
							break;
						case 49:
							check++;
							break;
						case 50:
							check++;
							break;
						case 51:
							check++;
							break;
						case 52:
							check++;
							break;
						case 53:
							check++;
							break;
						case 54:
							check++;
							break;
						case 55:
							check++;
							break;
						case 56:
							check++;
							break;
						case 57:
							check++;
							break;
						default:
							check--;
							break;
					}

				}
				if (check == 10)
				{
					flag2 = true;
				}
				if (flag1 == true && flag2 == true)
				{
					System.out.println("Valid Number");

				}
				else 
				{
					System.out.println("Invalid Number");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
