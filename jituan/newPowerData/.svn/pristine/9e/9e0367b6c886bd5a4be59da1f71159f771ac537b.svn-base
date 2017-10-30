package com.ccssoft.rsas.common.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 * FTP�ļ����乤����
 * @���� 
 * @��˾ �������ͨ�ż������޹�˾
 * @���� ���ʻ�
 * @����ʱ�� 8 13, 2010 
 */
public class FTPTransfer
{
   private FTPClient ftpClient;
   public static final int BINARY_FILE_TYPE = FTP.BINARY_FILE_TYPE;
   public static final int ASCII_FILE_TYPE = FTP.ASCII_FILE_TYPE;

   private String    server;          //FTP��������
   private int       port;            //�˿�
   private String    user;            //FTP��¼�û���
   private String    password;        //FTP��¼����
   
   /**
    * ���캯��
    */
   public FTPTransfer()
   {
      this.server = "172.16.29.56";
      this.port = 21;
      this.user = "admin";
      this.password = "admin";
   }
   
   /**
    * ���캯��������ʼ����
    * @param server -- FTP������
    * @param port -- ���Ӷ˿�
    * @param user -- ��¼�û�
    * @param password --��¼����
    */
   public FTPTransfer(String server, int port, String user, String password)
   {
      this.server = server;
      this.port = port;
      this.user = user;
      this.password = password;
   }
   
   public void connectServer(String path) throws SocketException, IOException
   {
      connectServer(this.server, this.port, this.user, this.password, path);
   }

   private void connectServer(String server, int port, String user, String password, String path)
         throws SocketException, IOException
   {
      ftpClient = new FTPClient();
      ftpClient.connect(server, port);
      System.out.println("Connected to " + server + ".");
      if (ftpClient.login(user, password))
      {
         //������ʽ��Ϊ��������
         this.setFileType(BINARY_FILE_TYPE);
         //����ģʽ
         //ftpClient.enterLocalPassiveMode();
         // ·��Ӧ��ΪFTP����Ŀ¼
         if (path.length() != 0)
         {
            ftpClient.changeWorkingDirectory(path);
         }
      }else{
         System.out.println("Connected to " + server + ". fault");
      }
   }

   /**
    * ���ô��䷽ʽ��������ı��ļ�ʱҪ�ö��������ķ�ʽ����
    * @param fileType
    * @throws IOException
    */
   public void setFileType(int fileType) throws IOException
   {
      ftpClient.setFileType(fileType);
   }

   /**
    * �Ͽ�����
    * @throws IOException
    */
   public void closeServer() throws IOException
   {
      
      if (ftpClient.isConnected())
      {
         ftpClient.completePendingCommand();
         ftpClient.logout();
         ftpClient.disconnect();
      }
   }

   /**
    * �ı乤��·��
    * @param path
    * @return
    * @throws IOException
    */
   public boolean changeDirectory(String path) throws IOException
   {
      return ftpClient.changeWorkingDirectory(path);
   }

   /**
    * ����Ŀ¼
    * @param pathName
    * @return
    * @throws IOException
    */
   public boolean createDirectory(String pathName) throws IOException
   {
      return ftpClient.makeDirectory(pathName);
   }

   /**
    * ɾ��Ŀ¼
    * @param path
    * @return
    * @throws IOException
    */
   public boolean removeDirectory(String path) throws IOException
   {
      return ftpClient.removeDirectory(path);
   }

   /**
    * ɾ��Ŀ¼��ͬʱɾ��Ŀ¼�µ���Ŀ¼���ļ�
    * @param path
    * @param isAll
    * @return
    * @throws IOException
    */
   public boolean removeDirectory(String path, boolean isAll) throws IOException
   {

      if (!isAll)
      {
         return removeDirectory(path);
      }

      FTPFile[] ftpFileArr = ftpClient.listFiles(path);
      if (ftpFileArr == null || ftpFileArr.length == 0)
      {
         return removeDirectory(path);
      }
      // 
      for (FTPFile ftpFile : ftpFileArr)
      {
         String name = ftpFile.getName();
         if (ftpFile.isDirectory())
         {
            System.out.println("* [sD]Delete subPath [" + path + "/" + name + "]");
            removeDirectory(path + "/" + name, true);
         }
         else if (ftpFile.isFile())
         {
            System.out.println("* [sF]Delete file [" + path + "/" + name + "]");
            deleteFile(path + "/" + name);
         }
         else if (ftpFile.isSymbolicLink())
         {

         }
         else if (ftpFile.isUnknown())
         {

         }
      }
      return ftpClient.removeDirectory(path);
   }

   /**
    * ���Ŀ¼�Ƿ����
    * @param path
    * @return
    * @throws IOException
    */
   public boolean existDirectory(String path) throws IOException
   {
      /*boolean flag = false;
      FTPFile[] ftpFileArr = ftpClient.listFiles(path);
      for (FTPFile ftpFile : ftpFileArr)
      {
         if (ftpFile.isDirectory() && ftpFile.getName().equalsIgnoreCase(path))
         {
            flag = true;
            break;
         }
      }
      return flag;*/
      
      return this.changeDirectory(path);
   }

   /**
    * ����FTP�������ϵ��ļ���Ŀ¼�б� 
    * @param path
    * @return
    * @throws IOException
    */
   public List<String> getFileList(String path) throws IOException
   {
      FTPFile[] ftpFiles = ftpClient.listFiles(path);

      List<String> retList = new ArrayList<String>();
      if (ftpFiles == null || ftpFiles.length == 0)
      {
         return retList;
      }
      for (FTPFile ftpFile : ftpFiles)
      {
         if (ftpFile.isFile())
         {
            retList.add(ftpFile.getName());
         }
      }
      return retList;
   }

   /**
    * ɾ���ļ�
    * @param pathName
    * @return
    * @throws IOException
    */
   public boolean deleteFile(String pathName) throws IOException
   {
      return ftpClient.deleteFile(pathName);
   }

   /**
    * �ϴ��ļ�, ���µ��ļ����ϴ�
    * @param fileName
    * @param newName
    * @return
    * @throws IOException
    */
   public boolean uploadFile(String fileName, String newName) throws IOException
   {
      boolean flag = false;
      InputStream iStream = null;
      try
      {
         File f = new File(fileName);
         iStream = new FileInputStream(f);
         flag = ftpClient.storeFile(newName, iStream);
      }
      catch (IOException e)
      {
         flag = false;
         e.printStackTrace();
         throw  e;
      }
      finally
      {
         if (iStream != null)
         {
            iStream.close();
         }
      }
      return flag;
   }

   /**
    * �ϴ��ļ��������ļ�������
    * @param fileName
    * @return
    * @throws IOException
    */
   public boolean uploadFile(String fileName) throws IOException
   {
      return uploadFile(fileName, fileName);
   }

   /**
    * �ϴ�������
    * @param iStream
    * @param newName
    * @return
    * @throws IOException
    */
   public boolean uploadFile(InputStream iStream, String newName) throws IOException
   {
      boolean flag = false;
      try
      {
         // can execute [OutputStream storeFileStream(String remote)]
         // Above method return's value is the local file stream.
         flag = ftpClient.storeFile(newName, iStream);
      }
      catch (IOException e)
      {
         flag = false;
         return flag;
      }
      finally
      {
         if (iStream != null)
         {
            iStream.close();
         }
      }
      return flag;
   }

   /**
    * �����ļ�
    * @param remoteFileName
    * @param localFileName
    * @return
    * @throws IOException
    */
   public boolean download(String remoteFileName, String localFileName) throws IOException
   {
      boolean flag = false;
      File outfile = new File(localFileName);
      OutputStream oStream = null;
      try
      {
         oStream = new FileOutputStream(outfile);
         flag = ftpClient.retrieveFile(remoteFileName, oStream);
      }
      catch (IOException e)
      {
         flag = false;
         e.printStackTrace();
         //return flag;
         throw e;
      }
      finally
      {
         oStream.close();
      }
      return flag;
   }

   /**
    * �����ļ�
    * @param sourceFileName
    * @return
    * @throws IOException
    */
   public InputStream downFile(String sourceFileName) throws IOException
   {
      return ftpClient.retrieveFileStream(sourceFileName);
   }
   
   public static void main(String[] args)
   {
      try
      {
         FTPTransfer ftp = new FTPTransfer();
         ftp.connectServer("/");
         System.out.println(ftp.changeDirectory("/pph1/pph2"));;
         ftp.uploadFile("c:\\abc.txt", "abc.txt");
         if (!ftp.existDirectory("pph")){
            ftp.createDirectory("pph1");
            ftp.changeDirectory("pph1");
            ftp.createDirectory("pph2");
            ftp.uploadFile("c:\\ftp.jar", "ftp.jar");
         }
         //ftp.download("KuGou2010.exe", "c:\\TestFTP\\KuGou2010.exe");
         ftp.closeServer();
      } catch (Exception e) 
      {
         System.out.println(e.getMessage());
      }
   }
   public  int getReplyCode(){
      return ftpClient.getReplyCode();
   }
}