/* Subnet Addressing. Finding the number of 1's in Subnet Mask */

import java.util.Scanner;
class Subnet{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the ip address: ");
String ip = sc.nextLine();
String checkclass = ip.substring(0, 3);
String split_ip[] = ip.split("\\."); //SPlit the string after every .
String split_bip[] = new String[4]; //split binary ip
String bip = "";
for(int i=0;i<4;i++)
{
split_bip[i] = appendZeros(Integer.toBinaryString(Integer.parseInt(split_ip[i]))); // "18" => 18 => 10010 => 00010010
bip += split_bip[i];
}
System.out.println("IP in binary is "+bip);
System.out.print("Enter the number of Subnets: ");
int n = sc.nextInt();

//Calculation of mask
int bits = (int)Math.ceil(Math.log(n)/Math.log(2)); /*eg if address = 120, log 120/log 2 gives log to the base 2 => 6.9068, ceil gives us upper integer */
System.out.println("Number of bits required for address = "+bits);
int mask;

int cc = Integer.parseInt(checkclass);
      String maskc = null;
	         if(cc>0)
        {
            if(cc<=127)
            {
                maskc = "255.0.0.0";
				mask = 8+bits;
				System.out.println("Class A IP Address");
        System.out.println("SUBNET MASK:\n"+maskc);
		System.out.println("Number of 1's in subnet mask = "+mask);
            }
            if(cc>=128 && cc<=191)
            {
                maskc = "255.255.0.0";
				mask = 16+bits;
        System.out.println("Class B IP Address");
        System.out.println("SUBNET MASK:\n"+maskc);
		System.out.println("Number of 1's in subnet mask = "+mask);
            }
            if(cc>=192 && cc<=223)
            {
                maskc = "255.255.255.0";
				mask = 24+bits;
        System.out.println("Class C IP Address");
        System.out.println("SUBNET MASK:\n"+maskc);
		System.out.println("Number of 1's in subnet mask = "+mask);
            }
       
        }

}
static String appendZeros(String s)
{
String temp = new String("00000000");
return temp.substring(s.length())+ s;
}
}