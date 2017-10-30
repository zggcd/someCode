package com.ccssoft.rsas.common.tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import oracle.sql.BLOB;

import com.ccssoft.rsas.common.log.RLogger;


/**
 * �ļ�������
 * <p>����: ����д���ļ����ļ�д������Ĳ���</p> 
 * <p>��Ȩ: Copyright (c) 2009 </p>
 * <p>��˾: ��Ѷ���ͨ�ż������޹�˾</p>
 * @�汾: 1.0
 * @����: ���ʻ�
 * @����: 2009-03-31
 */
public class OperFile 
{
	/**
	 * ������д�����ļ���
	 * @param outObject -- Ҫ����Ķ���
	 * @param fileName -- ��������·��
	 */
	public synchronized static void ObjectToFile(Object outObject, String fileName)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(outObject);
			oos.flush();
		}
		catch (FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			RLogger.logError("·�������ڣ�");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			RLogger.logError("�ļ�·���쳣��");
		}
		finally
		{
			try
			{
				oos.close();
				fos.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ������뵽�������
	 * @param obj -- Ҫ�����Ķ���
	 * @return -- �����������
	 */
	public static OutputStream ObjectToStream(Object obj)
	{
	   OutputStream out = new ByteArrayOutputStream();
	   ObjectOutputStream oos = null;
	   try
	   {
	      oos = new ObjectOutputStream(out);
	      oos.writeObject(obj);
	   }
	   catch (Exception e) 
	   {
	      e.printStackTrace();
       }
	   finally
	   {
	       try
	       {
	          oos.close();
	       }
	       catch (Exception ex) 
	       {
	          ex.printStackTrace();
	       }
	   }
	   
	   return out;
	}
	
	/**
	 * ���������д������
	 * @param ins -- ����������
	 * @return Object -- ����Ķ���
	 */
	public static Object StreamToObject(InputStream ins)
	{
	   Object obj = null;
	   ObjectInputStream ois = null;
	   
	   try
	   {
	      ois = new ObjectInputStream(ins);
	      obj = ois.readObject();
	   }
	   catch (Exception e) 
	   {
         e.printStackTrace(); 
       }
	   finally
       {
           try
           {
              if(ois != null)
              {
                 ois.close();
              }
           }
           catch (Exception ex) 
           {
              ex.printStackTrace();
           }
       }
	   
	   return obj;
	}
	
	/**
	 * ���ļ���ȡ��������
	 * @param fileName -- Ҫ��ȡ���ļ���
	 * @return
	 */
	public synchronized static Object FileToObject(String fileName)
	{
		Object out = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
		{
		    File f = new File(fileName);
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			out = ois.readObject();
		}
		catch (FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			RLogger.logError("·�������ڣ�");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			RLogger.logError("�ļ�·���쳣��");
		}
		catch (ClassNotFoundException ce)
		{
			ce.printStackTrace();
			RLogger.logError("�Ҳ����࣡");
		}
		finally
		{
			try
			{
				ois.close();
				fis.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return out;
	}
	
	/**
	 * ����ѹ��Ϊ�ļ�����д�뵽Blob��, ����IO
	 * @param destObject -- Ҫ�����Ķ���
	 * @param blob -- Ҫд�뵽��blob
	 * @param path -- ���󱣴�Ϊʱ��ŵ�·��
	 * @param zipFileName -- ѹ���ļ���
	 */
	public synchronized static void ObjectToBlob(Object destObject, BLOB blob, String path, String zipFileName)
	{
		File file = null;
		File objFile = null;
		FileInputStream fis = null;
		OutputStream os = null;
		try
		{
			//�����󱣴浽�ļ���
			file = new File(path);
			if (!file.isDirectory())
			{
				//����Ŀ¼�Ա㽫�ļ����ɵ�Ŀ¼��
				file.mkdir();
			}
			ObjectToFile(destObject, path + "/out");
			//ѹ���ļ�
			Zip.zip(zipFileName, path);
			objFile = new File(zipFileName);
			fis = new FileInputStream(objFile);
			os = blob.getBinaryOutputStream();
			byte[] buffer = new byte[8196];
			int length = -1;
			while (((length = fis.read(buffer)) != -1))
			{
				os.write(buffer, 0, length);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				os.close();
				fis.close();
				file.delete();
				objFile.delete();
				deleteDirectory(path);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * �����Խ������л��Ķ���ѹ����Blob��, ������IO
	 * @param blob -- Ҫ���뵽��blob
	 * @param destObj -- Ҫѹ���Ķ��� 
	 */
	public static void setObjectToBlob(Object destObj, BLOB blob)
	{
	   OutputStream out = null;
	   ByteArrayOutputStream bos = null;
	   InputStream ins = null;
	   OutputStream os = null;
	   try
       {
	      os = new ByteArrayOutputStream();
	      //������ת�����������
	      out = OperFile.ObjectToStream(destObj);
	      bos = (ByteArrayOutputStream) out;
	      //��������·��뵽��������׼��ѹ��
	      ins = new ByteArrayInputStream(bos.toByteArray());
	      out.close();
	      //ѹ��������
          out = Zip.zip(ins);
          ins.close();
          //��������·��뵽��������׼��д����blob
          bos = (ByteArrayOutputStream) out;
          ins = new ByteArrayInputStream(bos.toByteArray());
          //д�뵽blob
          os = blob.getBinaryOutputStream();
          byte[] buffer = new byte[8196];
          int b;
          while ((b = ins.read(buffer)) != -1)
          {
             os.write(buffer, 0, b);
          }
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       finally
       {
          try
          {
             out.close();
             bos.close();
             ins.close();
             os.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
	}
	
	/**
	 * �����Խ������л��Ķ�����ͬ�丽���������ļ�һ��ѹ����Blob��, ����IO
	 * @param destObj -- Ҫ�����Ķ���
	 * @param blob -- Ҫд��Ĵ��ֶ�
	 * @param virPath -- �����ļ����ڵ��ļ�·��
	 * @param zipFileName -- ѹ������ļ���
	 */
	public static void setObjectToBlob(Object destObj, BLOB blob, String virPath, String zipFileName)
	{
	   File f = null;
	   OutputStream os = null;
	   FileInputStream fis = null;
	   try
	   {
	      //�Ƚ��������л�����ʱ�ļ�����
	      OperFile.ObjectToFile(destObj, virPath + "/out");
	      //ѹ���ļ���
	      Zip.zip(zipFileName, virPath);
	      //���ļ�д�뵽blob
	      f = new File(zipFileName);
	      fis = new FileInputStream(f);
	      os = blob.getBinaryOutputStream();
	      byte[] buffer = new byte[8196];
          int b;
          while ((b = fis.read(buffer)) != -1)
          {
             os.write(buffer, 0, b);
          }
	   }
	   catch (Exception e) 
	   {
           e.printStackTrace();
       }
	   finally
	   {
	      try
	      {
	         fis.close();
	         os.close();
	         f.delete();
	         deleteDirectory(virPath);
	      }
	      catch (Exception e) 
	      {
             e.printStackTrace();
          }
	   }
	}
    
     /**
     * ��������ѹ����д�뵽Blob��, ������IO
     * @param ins -- ����������
     * @param blob -- Ҫд�뵽��BLOB
     */
    public static InputStream setStreamToBlob(InputStream ins) {
        OutputStream out = null;
        ByteArrayOutputStream bos = null;
        InputStream is = null;
        try {
            //������������ѹ��
            out = Zip.zip(ins);
            //��out���·��뵽��������׼��д�뵽blob
            bos = (ByteArrayOutputStream) out;
            is = new ByteArrayInputStream(bos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                bos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return is;
    }

	
	/**
	 * ��������ѹ����д�뵽Blob��, ������IO
	 * @param ins -- ����������
	 * @param blob -- Ҫд�뵽��BLOB
	 */
	public static void setStreamToBlob(InputStream ins, BLOB blob)
	{
	   OutputStream out = null;
	   OutputStream os = null;
	   ByteArrayOutputStream bos = null;
	   InputStream is = null;
	   try
	   {
//	      ������������ѹ��
	      out = Zip.zip(ins);
	      //��out���·��뵽��������׼��д�뵽blob
	      bos = (ByteArrayOutputStream) out;
	      is = new ByteArrayInputStream(bos.toByteArray());
          
	      //д�뵽blob
          os = blob.getBinaryOutputStream();
          byte[] buffer = new byte[8196];
          int b;
          while ((b = is.read(buffer)) != -1)
          {
             os.write(buffer, 0, b);
             for (int i = 0; i < b; i++)
                System.out.print(buffer[i]);
          }
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
	      {
	         
	         os.close();
	         bos.close();
	         is.close();
             out.close();
	      }
	      catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	}
	
	/**
	 * ���ļ�ѹ����д�뵽Blob��
	 * @param filename -- �ļ���
	 * @param blob -- Ŀ��Blob
	 */
	public static void setFileToBlob(String filename, BLOB blob)
	{
	   OutputStream os = null;
	   
	   try
       {
	      os = blob.getBinaryOutputStream();
	      Zip.zip(filename, os);
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       finally
       {
          try
          {
             os.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
	}
	
	/**
	 * �����ֶν�ѹ������, ������IO
	 * @param blob -- Ҫд����blob
	 * @return object
	 */
	public static Object getBlobToObject(BLOB blob)
	{
	   Object obj = null;
	   OutputStream out = null;
	   ByteArrayOutputStream bos = null;
       InputStream ins = null;
       InputStream is = null;
	   try
	   {
	      if (blob.length() == 0)
	      {
	         return null;
	      }
	      out = new ByteArrayOutputStream();
	      //��blob�ж�ȡ������д�뵽out��
	      is = blob.getBinaryStream();
	      byte[] buffer = new byte[8196];
	      int b = -1;
	      while ((b = is.read(buffer)) != -1)
	      {
	         out.write(buffer, 0, b);
	      }
	      is.close();
	      //��out���·Żص���������׼����ѹ
	      bos = (ByteArrayOutputStream) out;
	      ins = new ByteArrayInputStream(bos.toByteArray());
	      out.close();
	      //��ѹ������
	      out = Zip.unzip(ins);
	      ins.close();
	      //��out���·Żص���������׼��д�뵽����
          bos = (ByteArrayOutputStream) out;
          ins = new ByteArrayInputStream(bos.toByteArray());
          obj = OperFile.StreamToObject(ins);
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
	      {
	         if (out != null)
	           out.close();
	         if (bos != null)
	           bos.close();
	         if (ins != null)
	           ins.close();
	         if (is != null)
	           is.close();
	      }
	      catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	   return obj;
	}
	
	private synchronized static Object unzipAndGetObject(String zipFileName, String virPath)
	{
	   Object obj = null;
	   try
	   {
	      Zip.unzip(zipFileName , virPath);
          obj = OperFile.FileToObject(virPath + "/out");
          deleteFile(virPath + "/out");
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   return obj;
	}
	
	/**
	 * �Ӵ��ֶ���ȡ�����������ļ��Ķ���, ����IO
	 * @param blob -- Ҫ��ȡ�Ĵ��ֶ�
	 * @param virPath -- ��ѹ���ļ����õ�·��, ԭѹ����·��Ϊ: "./virdata/rptResultID_virdata"
	 * @param rootDir -- �Ӵ��ֶζ���ѹ���ļ�ʱ��ʱ��ŵ�·��, ԭѹ��·��Ϊ: "./virdata"
	 * @return Object -- ��Ӧ�Ķ���
	 */
	public static Object getBlobToObject(BLOB blob, String virPath, String rootDir)
	{
	   Object obj = null;
	   FileOutputStream fos = null;
	   InputStream is = null;
	   File fzip = null;
	   try
	   {
	      if (blob.length() == 0)
	      {
	         return null;
	      }
	      File fp = new File(rootDir);
	      if (!fp.isDirectory())
	      {
	         fp.mkdir();
	      }
	      //�Ӵ��ֶλ��ѹ���ļ�
	      String zipFileName = rootDir + "/rptobj.zip";
	      fzip = new File(zipFileName);
	      fos = new FileOutputStream(fzip);
	      is = blob.getBinaryStream();
	      byte[] buffer = new byte[8196];
          int b = -1;
          while ((b = is.read(buffer)) != -1)
          {
             fos.write(buffer, 0, b);
          }
          fos.close();
          //��ѹ�ļ�, Ϊ�����ļ���ͻ, ת��synchronized��ִ��
          //obj = unzipAndGetObject(zipFileName, virPath);
          Zip.unzip(zipFileName , virPath);
          obj = OperFile.FileToObject(virPath + "/out");
          deleteFile(virPath + "/out");
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
	      {
	         if (fos != null)
	           fos.close();
	         if (is != null)
	           is.close();
	      }
	      catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	   return obj;
	}
	
	/**
	 * ��BLOB��ȡ��ѹ���ļ���д�뵽�������, ������IO
	 * @param blob -- Ҫ��ȡ��BLOB
	 * @return OutputStream -- �����
	 */
	public static OutputStream getBlobToStream(BLOB blob)
	{
	   OutputStream out = null;
	   OutputStream os = null;
	   InputStream ins = null;
	   ByteArrayOutputStream bos = null;
	   
	   try
	   {
	      if (blob.length() == 0)
	      {  
	         return null;
	      }
	      os = new ByteArrayOutputStream();
	      //��blob��ȡ��������
	      ins = blob.getBinaryStream();
	      byte[] buffer = new byte[8196];
          int b = -1;
          while (((b = ins.read(buffer)) != -1))
          {
              os.write(buffer, 0, b);
          }
          ins.close(); //�ر�BLOB
          //��os�Żص���������׼����ѹ
          bos = (ByteArrayOutputStream) os;
          ins = new ByteArrayInputStream(bos.toByteArray());
          //��ѹ������
          out = Zip.unzip(ins);
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   catch(OutOfMemoryError e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
          {
	         if (ins != null) ins.close();
	         if (bos != null) bos.close();
	         if (os != null)  os.close(); 
          }
	      catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	   
	   return out;
	}
	
	/**
	 * ��Blob�е����ݽ�ѹ������ļ���
	 * @param blob -- BLOG
	 * @param filename -- �ļ���
	 */
	public static void getBlobToFile(BLOB blob, String filename)
	{
	   //OutputStream os = null;
	   InputStream is = null;
	   //ByteArrayInputStream bis = null;
	   
	   try
	   {
	      if (blob.length() == 0)
	      {
	         File file = new File(filename);
	         file.createNewFile();
	         return;
	      }
	      //os = new ByteArrayOutputStream();
	      is = blob.getBinaryStream();
	      /*
	      byte[] buffer = new byte[8196];
          int b = -1;
          while (((b = is.read(buffer)) != -1))
          {
              os.write(buffer, 0, b);
          }
          is.close();
          os.flush();
          
          bis = new ByteArrayInputStream(((ByteArrayOutputStream) os).toByteArray());
          */
          Zip.upzip(is, filename);
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
	      {
	         //os.close();
	         if (is != null)  is.close();
	         //bis.close();
	      }
	      catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	}
	
	/**
	 * ��ѹ�������뵽Blob��
	 * @param dir -- Ҫѹ����Ŀ¼
	 * @param blob -- Ҫд�뵽��blob
	 * @param zipFileName -- ѹ���ļ���
	 */
	public synchronized static void DirectoryToBlob(String dir, BLOB blob, String zipFileName)
	{
		FileInputStream fis = null;
		OutputStream os = null;
		File objFile = null;
		try
		{
			//ѹ���ļ�
			Zip.zip(zipFileName, dir);
			objFile = new File(zipFileName);
			fis = new FileInputStream(objFile);
			os = blob.getBinaryOutputStream();
			byte[] buffer = new byte[8196];
			int length = -1;
			while (((length = fis.read(buffer)) != -1))
			{
				os.write(buffer, 0, length);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				os.close();
				objFile.delete();
				deleteDirectory(dir);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ����ȡ���Ĵ��ֶν�ѹ��װ�뵽������, ����IO
	 * @param blob -- �������Ĵ��ֶ�
	 * @return Object ����
	 */
	public synchronized static Object BlobToObject(BLOB blob)
	{
		Object out = null;
		FileOutputStream fos = null;
		InputStream is = null;
		String zipFileName = "out.zip";
		String path = "./outdata";
		File file = null;
		try
		{
			fos = new FileOutputStream(zipFileName);
			is = blob.getBinaryStream();
			byte[] buffer = new byte[2048];
			int length = -1;
			while (((length = is.read(buffer)) != -1))
			{
				fos.write(buffer, 0, length);
			}
			
			file = new File(zipFileName);
			if (file.exists())
			{
				Zip.unzip(zipFileName, path);
			}
			out = FileToObject(path + "/out");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		   try
		   {
		      is.close();
		      fos.close();
		      File f = new File(path + "/out");
		      f.delete();
		   }
		   catch (Exception e)
		   {
		      e.printStackTrace();
		   }
		}
		
		return out;
	}
	
	/**
	 * ����ȡ���Ĵ��ֶν�ѹ���ļ�����
	 * @param blob -- �������Ĵ��ֶ�
	 * @param path -- ��ѹ���ļ���ŵ�·��
	 * @return Object ����
	 */
	public synchronized static void BlobToDirectory(BLOB blob, String path)
	{
		FileOutputStream fos = null;
		InputStream is = null;
		String zipFileName = "outfile.zip";
		File file = null;
		try
		{
			fos = new FileOutputStream(zipFileName);
			is = blob.getBinaryStream();
			byte[] buffer = new byte[2048];
			int length = -1;
			while (((length = is.read(buffer)) != -1))
			{
				fos.write(buffer, 0, length);
			}
			
			file = new File(zipFileName);
			if (file.exists())
			{
				Zip.unzip(zipFileName, path);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		   try
		   {
		      is.close();
		      fos.close();
		   }
		   catch (Exception e)
		   {
		      e.printStackTrace();
		   }
		}
	}
	
	/**
     * ����ȡ���Ĵ��ֶν�ѹ��װ���������
     * @param blob -- �������Ĵ��ֶ�
     * @param reportID -- �����ID
     * @param extName -- �������ļ�����չ��, ExcelʱΪ.xls, PDFʱΪ.pdf, CSVʱΪ.csv
     * @return OutputStream ������
     */
    public synchronized static OutputStream BlobToStream(BLOB blob, String reportID, String extName)
    {
        OutputStream out = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStream is = null;
        String zipFileName = "out.zip";
        String path = "./exportfile";
        File file = null;
        try
        {
            byte[] buffer = new byte[2048];
            int length = -1;
            
            //���ļ���ѹ
            fos = new FileOutputStream(zipFileName);
            is = blob.getBinaryStream();
            while (((length = is.read(buffer)) != -1))
            {
                fos.write(buffer, 0, length);
            }
            
            file = new File(zipFileName);
            if (file.exists())
            {
                Zip.unzip(zipFileName, path);
            }
            
            //���ļ���������������
            File fl = new File(path + "/" + reportID + extName);
            fis = new FileInputStream(fl);
            out = new ByteArrayOutputStream();  
            while ((length = fis.read(buffer)) != -1)
            {
               out.write(buffer, 0, length);
            }
            fis.close();
            fl.delete();
            //ɾ��Ŀ¼
            deleteDirectory(path);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
           try
           {
              is.close();
              fos.close();
           }
           catch (Exception e)
           {
              e.printStackTrace();
           }
        }
        return out;
    }
    
    /**  
     * ɾ��Ŀ¼���ļ��У��Լ�Ŀ¼�µ��ļ�  
     * @param   sPath ��ɾ��Ŀ¼���ļ�·��  
     * @return  Ŀ¼ɾ���ɹ�����true�����򷵻�false  
     */  
    public static boolean deleteDirectory(String sPath) 
    {   
        //���sPath�����ļ��ָ�����β���Զ�����ļ��ָ���   
        if (!sPath.endsWith(File.separator)) 
        {   
            sPath = sPath + File.separator;   
        }   
        File dirFile = new File(sPath);   
        //���dir��Ӧ���ļ������ڣ����߲���һ��Ŀ¼�����˳�   
        if (!dirFile.exists() || !dirFile.isDirectory()) 
        {   
            return false;   
        }   
        boolean flag = true;   
        //ɾ���ļ����µ������ļ�(������Ŀ¼)   
        File[] files = dirFile.listFiles();   
        for (int i = 0; i < files.length; i++) 
        {   
            //ɾ�����ļ�   
            if (files[i].isFile()) 
            {   
                flag = deleteFile(files[i].getAbsolutePath());   
                if (!flag) break;   
            } //ɾ����Ŀ¼   
            else 
            {   
                flag = deleteDirectory(files[i].getAbsolutePath());   
                if (!flag) break;   
            }   
        }   
        if (!flag) return false;   
        //ɾ����ǰĿ¼   
        if (dirFile.delete()) 
        {   
            return true;   
        } else {   
            return false;   
        }   
    }  
    
    /**  
     * ɾ�������ļ�  
     * @param   sPath  ��ɾ���ļ����ļ���  
     * @return �����ļ�ɾ���ɹ�����true�����򷵻�false  
     */  
    public static boolean deleteFile(String sPath) 
    {   
        boolean flag = false;   
        File file = new File(sPath);   
        // ·��Ϊ�ļ��Ҳ�Ϊ�������ɾ��   
        if (file.isFile() && file.exists()) 
        {   
            file.delete();   
            flag = true;   
        }   
        return flag;   
    }  
    
    /**
     * �����ֶν�ѹ������, ������IO
     * @param blob -- Ҫд����blob
     * @return object
     */
    public static Object getBlobToObject(byte[] data)
    {
       Object obj = null;
       OutputStream out = null;
       ByteArrayOutputStream bos = null;
      InputStream ins = null;
       try
       {
          if (data == null || data.length == 0)
          {
             return null;
          }
          ins = new ByteArrayInputStream(data);
          //��ѹ������
          out = Zip.unzip(ins);
          ins.close();
          //��out���·Żص���������׼��д�뵽����
         bos = (ByteArrayOutputStream) out;
         ins = new ByteArrayInputStream(bos.toByteArray());
         obj = OperFile.StreamToObject(ins);
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       finally
       {
          try
          {
             if (out != null)
               out.close();
             if (bos != null)
               bos.close();
             if (ins != null)
               ins.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
       return obj;
    }
    /**
     * ��BLOB��ȡ��ѹ���ļ���д�뵽�������, ������IO
     * @param blob -- Ҫ��ȡ��BLOB
     * @return OutputStream -- �����
     */
    public static OutputStream getBlobToStream(byte[] data)    
    {
       OutputStream out = null;
       InputStream ins = null;
       try
       {
          if (data == null || data.length == 0)
          {  
             return null;
          }
          ins = new ByteArrayInputStream(data);
          //��ѹ������
          out = Zip.unzip(ins);
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       catch(OutOfMemoryError e)
       {
          e.printStackTrace();
       }
       finally
       {
          try
          {
             if (ins != null) ins.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
       
       return out;
    }
    
    public static void getBlobToFile(byte[] data, String filename)
    {
       InputStream is = null;
       try
       {
          if (data == null || data.length == 0)
          {
             File file = new File(filename);
             file.createNewFile();
             return;
          }
          is = new ByteArrayInputStream(data);
          Zip.upzip(is, filename);
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       finally
       {
          try
          {
             if (is != null)  is.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
    }
    
    /**
     * �����Խ������л��Ķ�����ͬ�丽���������ļ�һ��ѹ����Blob��, ����IO
     * @param destObj -- Ҫ�����Ķ���
     * @param blob -- Ҫд��Ĵ��ֶ�
     * @param virPath -- �����ļ����ڵ��ļ�·��
     * @param zipFileName -- ѹ������ļ���
     */
    public static byte[] setObjectToBlob(Object destObj, String virPath,
            String zipFileName) {
        StringBuffer sb = new StringBuffer();
        File f = null;
        FileInputStream fis = null;
        try {
            //�Ƚ��������л�����ʱ�ļ�����
            OperFile.ObjectToFile(destObj, virPath + "/out");
            //ѹ���ļ���
            Zip.zip(zipFileName, virPath);
            //���ļ�д�뵽blob
            f = new File(zipFileName);
            fis = new FileInputStream(f);
            byte[] buffer = new byte[8196];
            int b;
            while ((b = fis.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                f.delete();
                OperFile.deleteDirectory(virPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.toString().getBytes();
    }

    /**
     * �����Խ������л��Ķ���ѹ����Blob��, ������IO
     * @param blob -- Ҫ���뵽��blob
     * @param destObj -- Ҫѹ���Ķ��� 
     */
    public static InputStream setObjectToBlob(Object destObj) {
       OutputStream out = null;
       ByteArrayOutputStream bos = null;
       InputStream ins = null;
       try {
           //������ת�����������
           out = OperFile.ObjectToStream(destObj);
           bos = (ByteArrayOutputStream) out;
           //��������·��뵽��������׼��ѹ��
           ins = new ByteArrayInputStream(bos.toByteArray());
           out.close();
           //ѹ��������
           out = Zip.zip(ins);
           ins.close();
           //��������·��뵽��������׼��д����blob
           bos = (ByteArrayOutputStream) out;
           ins = new ByteArrayInputStream(bos.toByteArray());
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               out.close();
               bos.close();
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       }
       return ins;
       
//        OutputStream out = null;
//        ByteArrayOutputStream bos = null;
//        InputStream ins = null;
//        StringBuffer sb = new StringBuffer();
//        try {
//            //������ת�����������
//            out = OperFile.ObjectToStream(destObj);
//            bos = (ByteArrayOutputStream) out;
//            //��������·��뵽��������׼��ѹ��
//            ins = new ByteArrayInputStream(bos.toByteArray());
//            out.close();
//            //ѹ��������
//            out = Zip.zip(ins);
//            ins.close();
//            //��������·��뵽��������׼��д����blob
//            bos = (ByteArrayOutputStream) out;
//            ins = new ByteArrayInputStream(bos.toByteArray());
//            byte[] buffer = new byte[8196];
//            int b;
//            while ((b = ins.read(buffer)) != -1) {
//                sb.append(new String(buffer, 0, b));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                out.close();
//                bos.close();
//                ins.close();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//        return sb.toString().getBytes();
    }


//    public static void main(String[] args)
//   {
//       try
//       {
//          long et = 0;
//          long st = 0;
//          st =  System.currentTimeMillis();
//          String driver = "oracle.jdbc.driver.OracleDriver";
//          String url = "jdbc:oracle:thin:@199.3.0.5:1521:jiradb";
//          Class.forName(driver);
//          Connection conn = DriverManager.getConnection(url, "rsas2", "rsas2");
//          conn.setAutoCommit(false);
//          String s = "select t.FDTREPORTOBJECT from TBTASKRESULTMAP t where t.FDURPTRESULTID =  'A642292D-34CF-7031-F93B-A58B41D346B8' for update";
//          PreparedStatement sps = conn.prepareStatement(s);
//          ResultSet srs = sps.executeQuery(s);
//          BLOB blob = null;
//          while (srs.next())
//          {
//              blob = (BLOB) srs.getBlob(1);
//          }
//          et = System.currentTimeMillis();
//          System.out.println("��ѯ��ʱ: " + (et - st));
//          st =  System.currentTimeMillis();
//          //JasperPrint jp = new JasperPrint();
//          //ObjectToFile(jp, "./virdata/out");
//          //Object o = FileToObject("./virdata/out");
//          //Object o = OperFile.getBlobToObject(blob, "./virdata/A642292D-34CF-7031-F93B-A58B41D346B8_virdata", "./virdata");
//          Object o = OperFile.FileToObject("./virdata/out");
//          //JasperPrint jp = (JasperPrint) getBlobToObject(blob);
//          //Object o = OperFile.getBlobToObject(blob);
////          OutputStream out = OperFile.getBlobToStream(blob);
////          et = System.currentTimeMillis();
////          System.out.println("ת��Ϊ������ʱ: " + (et - st));
////          File f = new File("./ca.xls");
////          FileOutputStream fo = new FileOutputStream(f);
////          ByteArrayOutputStream bos = (ByteArrayOutputStream) out;
////          InputStream ins = new ByteArrayInputStream(bos.toByteArray());
////          int b;
////          while ((b = ins.read()) != -1)
////          {
////             fo.write(b);
////          }
//          et = System.currentTimeMillis();
//          System.out.println("ת��Ϊ������ʱ: " + (et - st));
//          System.out.println(o);
//       }
//       catch (Exception e) {
//         e.printStackTrace();
//      }
////       try
////       {
////          Zip.zip("./virdata/a.zip", "./virdata/bb");
////       }catch (Exception e) {
////         // TODO: handle exception
////      }
//   }
}
