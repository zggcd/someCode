package com.ccssoft;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import com.ccssoft.rsas.common.TransBaseCodeString;

public class Test
{

   private static String WindowsCmd = "cmd.exe /c echo %PROCESSOR_IDENTIFIER%";  //windows������ NUMBER_OF_PROCESSORS
   private static String[] SolarisCmd = {"/bin/sh", "-c", "/usr/sbin/psrinfo | wc -l"};
   private static String[] AIXCmd = {"/bin/sh", "-c", "/usr/sbin/lsdev -Cc processor | wc -l"};
   private static String[] HPUXCmd = {"/bin/sh", "-c", "echo \"map\" | /usr/sbin/cstm | grep CPU | wc -l "};
   private static String[] LinuxCPUModel = {"/bin/sh", "-c", "cat /proc/cpuinfo | grep ^model"};   
   private static String[] LinuxCPUFlags = {"/bin/sh", "-c", "cat /proc/cpuinfo | grep ^flags"};
   private static String[] LinuxCPUInfo = {"/bin/sh", "-c", "cat /proc/cpuinfo"};
   private static String[] LinuxHDInfo = {"/bin/sh", "-c", "hdparm -i /dev/hda"};
   
   /***************************************
    * 
    * @param args
    * @throws IOException 
    ***************************************/
   public static void main(String[] args) throws IOException
   {
      // TODO Auto-generated method stub
//      String s = "";
//      java.io.File filein = new java.io.File("E:/RSAS/Demo/Trans/report.html");
//      FileInputStream fin = new FileInputStream(filein);
//      System.out.println("===========encode html================");
//      s = TransBaseCodeString.encodeString(fin, 1024);
//      java.io.File fileOut = new java.io.File("E:/RSAS/Demo/Trans/report.txt");
//      FileOutputStream os = new FileOutputStream(fileOut);
//      OutputStreamWriter dos = new OutputStreamWriter(os);
//      dos.write(s, 0, s.length());
//      dos.close();
//      os.close();
//
//      //test lzx 2009-2-13 14:15
//      String JpgFile = "IMG_0059.jpg";
//      java.io.File binFile = new java.io.File("E:/RSAS/Demo/Trans/"+JpgFile);
//      FileInputStream binfin = new FileInputStream(binFile);
//      //s = TransBaseCodeString.encodeBinaryToBase64(binfin, binFile.length());
//      java.io.File file_Out = new java.io.File("E:/RSAS/Demo/Trans/IMG_0059.txt");
//      FileOutputStream o_s = new FileOutputStream(file_Out);
//      OutputStreamWriter d_os = new OutputStreamWriter(o_s);
//      d_os.write(s, 0, s.length());
//      d_os.close();
//      o_s.close();
      //System.out.println(s2);
      
//      System.out.println("===========decode html================");
      /*String outstr = TransBaseCodeString.decodeString(s2);
      java.io.File fout = new java.io.File("E:/RSAS/Demo/Trans/IMG.jpg");
      FileOutputStream fos = new FileOutputStream(fout);
      OutputStreamWriter fdos = new OutputStreamWriter(fos);
      fdos.write(outstr, 0, outstr.length());
      fdos.close();
      fos.close();*/
      //System.out.println(outstr);
      
//      java.io.File file_in = new java.io.File("E:/RSAS/Demo/Trans/home2_10.gif");
//      if (file_in.isFile())
//      {
//         FileInputStream is = new FileInputStream(file_in);
//         String expStr = TransBaseCodeString.byteStreamToString(is, 1024);
//         System.out.println("====================================");
//         System.out.println(expStr);
//      }
      String os = System.getProperty("os.name");
      System.out.println(os);
      Process model = null;
      InputStreamReader in_model = null;
      LineNumberReader input_model = null;
      Process flags = null;
      InputStreamReader in_flags = null;
      LineNumberReader input_flags = null;
      if(os.indexOf("Windows") > -1)
      {
         model = Runtime.getRuntime().exec(WindowsCmd); //WindowsCmd);
         in_model = new InputStreamReader(model.getInputStream());
         input_model = new LineNumberReader(in_model);
      }
      if(os.indexOf("Linux") > -1)
      {
//         model = Runtime.getRuntime().exec(LinuxCPUModel); //WindowsCmd);
//         in_model = new InputStreamReader(model.getInputStream());
//         input_model = new LineNumberReader(in_model);      

         model = Runtime.getRuntime().exec(LinuxCPUInfo); //WindowsCmd);
         in_model = new InputStreamReader(model.getInputStream());
         input_model = new LineNumberReader(in_model);  
         flags = Runtime.getRuntime().exec(LinuxHDInfo); //WindowsCmd);
         in_flags = new InputStreamReader(flags.getInputStream());
         input_flags = new LineNumberReader(in_flags);
      }
      
      if(model != null)
      {
         String str = "";
         String outStr = "";
         for(int i = 1; i < 100; i++)
         {
            str = input_model.readLine();
            if(str != null)
               outStr = outStr + str;
            else
               break;          
         }
         if(input_flags !=null)
         {
            for(int j = 1; j < 100; j++)
            {
               str = input_flags.readLine();
               if(str != null)
                  outStr = outStr + str;
               else
                  break;
            }
         }
         
         System.out.println(outStr);
      }
      
      
   }

}
