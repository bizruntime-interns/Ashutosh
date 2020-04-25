using System;

namespace FILE
{
    using System;
    using System.IO;

    class StringRW
    {
        static void Main()
        {
            string textReaderText = "TextReader is the abstract base " +
                "class of StreamReader and StringReader, which read " +
                "characters from streams and strings, respectively.\n\n";
            Console.WriteLine("Original text:\n\n{0}", textReaderText);

            
            string aLine, aParagraph = null;
            StringReader strReader = new StringReader(textReaderText);
            while (true)
            {
                aLine = strReader.ReadLine();
                if (aLine != null)
                {
                    aParagraph = aParagraph + aLine + " ";
                }
                else
                {
                    aParagraph = aParagraph + "\n";
                    break;
                }
            }
            Console.WriteLine("Modified text:\n\n{0}", aParagraph);


            int intCharacter;
            char convertedCharacter;
            StringWriter strWriter = new StringWriter();
            strReader = new StringReader(aParagraph);
            while (true)
            {
                intCharacter = strReader.Read();
                if (intCharacter == -1) break;

                convertedCharacter = Convert.ToChar(intCharacter);
                if (convertedCharacter == '.')
                {
                    strWriter.Write(".\n\n");

                    strReader.Read();
                    strReader.Read();
                }
                else
                {
                    strWriter.Write(convertedCharacter);
                }
            }
            Console.WriteLine("\nOriginal text:\n\n{0}",
                strWriter.ToString());
        }
    }
}
