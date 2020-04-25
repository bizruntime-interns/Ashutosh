using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

namespace ServerFirst
{
    class Program
    {
        static void Main(string[] args)
        {
            Socket sck = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
            
            //binfing socket to port
            sck.Bind(new IPEndPoint(0, 1994));
            //listening to connections
            sck.Listen(0);

            Socket acc = sck.Accept();
            byte[] buffer = Encoding.Default.GetBytes("Hello Client");
            acc.Send(buffer, 0, buffer.Length, 0);

            buffer = new byte[255];
            int rec = acc.Receive(buffer, 0, buffer.Length, 0);

            //to resize array to remove whitespace
            Array.Resize(ref buffer, rec);

            Console.WriteLine("Recived:{0}",Encoding.Default.GetString(buffer));

            sck.Close();
            acc.Close();

            Console.Read();

        }
    }
}
