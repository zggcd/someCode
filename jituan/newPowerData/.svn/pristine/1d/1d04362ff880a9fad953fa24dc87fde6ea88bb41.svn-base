package com.ccssoft.rsas.common.tool;

import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import java.io.*;

/**
 * ѹ���ļ���������������
 * <p>����: �����ṩѹ���ļ��к��������ķ���</p> 
 * <p>��Ȩ: Copyright (c) 2009 </p>
 * <p>��˾: ��Ѷ���ͨ�ż������޹�˾</p>
 * @�汾: 1.0
 * @����: ���ʻ�
 * @����: 2009-03-21
 */
public class Zip
{

    /**
     * Ŀ¼ѹ�����ļ�
     * @param zipFileName
     * @param inputPath
     * @throws Exception
     */
	public synchronized static void zip(String zipFileName, String inputPath) throws Exception
	{
		zip(zipFileName, new File(inputPath));
	}

	private static void zip(String zipFileName, File inputFile) throws Exception
	{
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
		zip(out, inputFile, "");
		out.close();
	}
	
	private static void zip(ZipOutputStream out, File f, String base) throws Exception
	{
		if (f.isDirectory())
		{
			File[] fl = f.listFiles();
			out.putNextEntry(new ZipEntry(base + "/"));
			base = base.length() == 0 ? "" : base + "/";
			for (int i = 0; i < fl.length; i++)
			{
				zip(out, fl[i], base + fl[i].getName());
			}
		}
		else
		{
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			byte[] buffer = new byte[8196];
			int b;
			while ((b = in.read(buffer)) != -1)
			{
				out.write(buffer, 0, b);
			}
			in.close();
		}

	}
	
	/**
	 * ѹ��������
	 * @param ins -- �����������
	 * @return OutputStream -- ѹ��������������
	 * @throws Exception
	 */
	public static OutputStream zip(InputStream ins) throws Exception
	{
	   OutputStream out = new ByteArrayOutputStream();
	   ZipOutputStream zout = new ZipOutputStream(out);
	   
	   try
	   {
	      zout.putNextEntry(new ZipEntry("/"));
	      byte[] buffer = new byte[8196];
	      int b;
          while ((b = ins.read(buffer)) != -1)
          {
              zout.write(buffer, 0, b);
          }
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
	      zout.close();
	   }
	   
	   return out;
	}
	
	/**
	 * ���ļ�ѹ��������������
	 * @param filename -- �ļ���
	 * @return ѹ����������
	 * @throws Exception
	 **************************************
	 */
	public static void zip(String filename, OutputStream out) throws Exception
	{
	   File file = null;
	   FileInputStream fis = null;
       ZipOutputStream zout = null;
	   
	   try
	   {
	       zout = new ZipOutputStream(out);
      	   file = new File(filename);
      	   fis = new FileInputStream(file);

      	   zout.putNextEntry(new ZipEntry("/"));
           byte[] buffer = new byte[8196];
           int b;
           while ((b = fis.read(buffer)) != -1)
           {
               zout.write(buffer, 0, b);
           }
           zout.flush();
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
             zout.close();
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
	}
	
	/**
	 * ��ѹ������
	 * @param ins -- Ҫ��ѹ��������
	 * @return OutputStream -- ��ѹ������������
	 * @throws Exception
	 */
	public static OutputStream unzip(InputStream ins) throws Exception
    {
	   OutputStream out = new ByteArrayOutputStream();
	   ZipInputStream zin = new ZipInputStream(ins);
	   try
       {
	      ZipEntry z;
	      while ((z = zin.getNextEntry()) != null)
          {
	         byte[] buffer = new byte[8196];
	         int b;
	         while ((b = zin.read(buffer)) != -1)
	         {
	            out.write(buffer, 0, b);
	         }
          }
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
	   
	   return out;
    }
	
	/**
	 * �����������н�ѹ�����浽�ļ���
	 * @param ins -- ������
	 * @param filename -- �ļ���
	 */
	public static void upzip(InputStream ins, String filename)
	{
	   File file = new File(filename);
	   OutputStream out = null;
	   
       ZipInputStream zin = new ZipInputStream(ins);
       try
       {
          if (file.createNewFile())
          {
             out = new FileOutputStream(file);
             
          }
          ZipEntry z;
          while ((z = zin.getNextEntry()) != null)
          {
             byte[] buffer = new byte[8196];
             int b;
             while ((b = zin.read(buffer)) != -1)
             {
                out.write(buffer, 0, b);
             }
             out.flush();
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
          }
          catch (Exception ex)
          {
             ex.printStackTrace();
          }
       }
       
    }

	/**
	 * ��ѹ�ļ����ļ���
	 * @param zipFileName -- Ҫ��ѹ���ļ�
	 * @param outputDir -- �ļ���ѹ�������ļ���
	 * @throws Exception
	 */
	public synchronized static void unzip(String zipFileName, String outputDir) throws Exception
	{
		ZipInputStream in = new ZipInputStream(new FileInputStream(zipFileName));
		ZipEntry z;
		while ((z = in.getNextEntry()) != null)
		{
			if (z.isDirectory())
			{
				String name = z.getName();
				name = name.substring(0, name.length() - 1);
				File f = new File(outputDir + File.separator + name);
				f.mkdir();
			}
			else
			{
				File f = new File(outputDir + File.separator + z.getName());
				f.createNewFile();
				FileOutputStream out = new FileOutputStream(f);
				byte[] buffer = new byte[8196];
				int b;
				while ((b = in.read(buffer)) != -1)
				{
					out.write(buffer, 0, b);
				}
				out.close();
			}
		}

		in.close();
	}
}
