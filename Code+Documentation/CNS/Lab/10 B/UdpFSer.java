import java.net.*;
import java.io.*;
public class UdpFSer
{
            public static void main(String args[]) throws IOException {
        byte b[] = new byte[1024];
        DatagramSocket dsoc = new DatagramSocket(9000);
        FileWriter fileWriter = new FileWriter("/home/dypiemr-/Desktop/temp.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        while (true) {
            DatagramPacket dp = new DatagramPacket(b, b.length);
            dsoc.receive(dp);
            String str = new String(new String(dp.getData(), 0, dp.getLength()));
            if (str.trim().equals("END"))
                break;
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
System.out.println("File Send...");
    }
}