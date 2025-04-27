import java.net.*;
import java.io.*;
public class UdpFCli
{
         public static void main(String args[]) throws Exception {

		
        byte sdata[] = new byte[1024];
        DatagramSocket dsoc = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");
        FileInputStream inputStream = new FileInputStream("/home/dypiemr-/Desktop/temp.txt");
        int nRead = 0;
        while ((nRead = inputStream.read(sdata)) != -1) {
            dsoc.send(new DatagramPacket(sdata, sdata.length, ip, 9001));
            if (nRead == 0) {
                sdata = "END".getBytes();
                dsoc.send(new DatagramPacket(sdata, sdata.length, ip, 9001));
            }
        }
	System.out.println("File Received...");

    }

}