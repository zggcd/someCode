package com.ccssoft.rsas.common;

/**
 * <p>ģ������: OBJSerializable </p>
 * <p>ģ��������ʵ���˶������л����ļ��ͻظ����� </p>
 * <p>��Ȩ���У� ��̫������Ϣ���û���ҵ���� 2003</p>
 * ���ߣ�Joy.L
 * �汾�� V2.5
 * ʱ�䣺2003-6-16
 */

import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.util.Random;

public class OBJSerializable
{
//   private static final runtime s_runtime = runtime.getruntime (); 
//   
//   private static long usedmemory () { 
//      return s_runtime.totalmemory () - s_runtime.freememory (); 
//   } 
//   
//   private static void rungc () throws exception { 
//      long usedmem1 = usedmemory (), usedmem2 = long.max_value; 
//      for (int i = 0; (usedmem1 < usedmem2) && (i < 500); ++ i) { 
//         s_runtime.runfinalization (); 
//         s_runtime.gc (); 
//         thread.currentthread ().yield (); 
//         usedmem2 = usedmem1; 
//         usedmem1 = usedmemory (); 
//      } 
//   }

   /** @param fileName
    *  @param obj
    * ������obj���л�Ϊ�ļ�������fileName��
    * */
   public synchronized  int ObjSerialToFile(String fileName,Object obj) {

     try {
       //���л����ݰ�
       FileOutputStream fos = new FileOutputStream(fileName);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(obj);
       oos.close();
       fos.close();
      }
     catch (IOException ex) {
       ex.printStackTrace();
       return -1;
     }
     return 0;
   }

   //���������л���bytes
   public synchronized static ByteArrayOutputStream ObjSerialToBytes(Object obj) {
     ByteArrayOutputStream bos=new ByteArrayOutputStream();
     try {
       ObjectOutputStream oos = new ObjectOutputStream(bos);
       oos.writeObject(obj);
       oos.close();
      }
     catch (IOException ex) {ex.printStackTrace();
     }
     return bos;
   }


// ���ļ�ϵͳ�л�ö���
// objFile �ǰ���·�����ļ������ļ�����
   public synchronized  Object getObjFromFile(String objFile) throws
     Exception{
     if (objFile.trim() ==null) {
       System.out.println("��ָ��������ȷ�ļ�����");
       return null;
     }
      FileInputStream fis = new FileInputStream(objFile);

      //GZIPInputStream gs = new GZIPInputStream(fis);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Object obj = (Object) ois.readObject();
      ois.close();
      fis.close();

//      File file=new File(objFile);
//     if (file.delete())
//       System.out.println("ɾ���ļ�999��");

      return obj;
   }


// ��byte���л�ö���
   public synchronized static Object getObjFromBytes(byte[] buf) throws  Exception{
     if (buf.length<1) {
       System.out.println("�������");
       return null;
     }
      ByteArrayInputStream bis = new ByteArrayInputStream(buf);
      //GZIPInputStream gs = new GZIPInputStream(bis);
      ObjectInputStream ois = new ObjectInputStream(bis);
      Object obj = (Object) ois.readObject();
      ois.close();
      bis.close();
      return obj;
   }




// ���ļ�ϵͳ��ɾ�������ļ�
// objFile �ǰ���·�����ļ������ļ�����
   public synchronized static void delelteFile(String objFile) throws  Exception{
     if (objFile.trim() ==null) {
       System.out.println("��ָ����ȷ�ļ�����");
       return ;
     }
     File file =new File(objFile);
     if (file.delete())
       System.out.println("ɾ���ļ���");
      return ;
   }

// ���ļ�ϵͳ��ɾ�������ļ�
// sourceFile,destinationFile�ǰ���·�����ļ������ļ�����
   public synchronized static void bakUpFile(String sourceFile,String destinationFile) throws  Exception{
     if (sourceFile.trim() ==null) {
       System.out.println("��ָ����ȷ�ļ�����");
       return ;
     }

     File file =new File(sourceFile);
     FileInputStream fis=new FileInputStream(sourceFile);
     FileOutputStream fos=new FileOutputStream(destinationFile);

     byte[] bytes = new byte[1024];
     int c;
     while ( (c = fis.read(bytes)) != -1) {
       fos.write(bytes, 0, c);
     }
     fos.flush();
     fos.close();
     fis.close();

     if (file.delete())
       System.out.println("ɾ���ļ���");
      return ;
   }



// д�����б�
  public synchronized void writeJobs(Vector jobs) throws IOException {

    Properties props=new Properties();
    FileOutputStream fos=null;
    File fileJob=null;

    try {
      FileInputStream in = new FileInputStream("./transfer/job_list");
      props.load(in);
      in.close();
      fileJob=new File("./transfer/job_list");
       fos=new FileOutputStream(fileJob);
    }
    catch (FileNotFoundException fnfex) {
      fileJob=new File("./transfer/job_list");
      fos=new FileOutputStream(fileJob);
    }
    catch (IOException ioex) {
    }
 /*
    File fileJob=new File("./transfer/job_list");
    FileWriter JobWriter =null;

    JobWriter = new FileWriter(fileJob,true);
    PrintWriter jobPrinter=null;
    jobPrinter = new PrintWriter(JobWriter, true);
    */
   int count=0;
   int count1=0;
   String s =null;
   try{
     s=props.getProperty("count");
     if (s!=null){
       count1 = Integer.parseInt(s);
       count = count1 + jobs.size()-1;
       props.setProperty("count", String.valueOf(count));
     }else{
       count = jobs.size()-1;
       props.setProperty("count", String.valueOf(count));
     }

   }catch(Exception es){
     es.printStackTrace();
     props.setProperty("count",Integer.toString(jobs.size()-1));
   }

   int leg= Integer.parseInt((String)jobs.elementAt(0));
   String sRow=null;
   String head=null;

   for(int i=1;i<jobs.size();i++){
      sRow=(String)jobs.elementAt(i);
      props.setProperty(sRow.substring(19),sRow);
    }
    props.store(fos,"");
    fos.close();
  }



  public synchronized Vector getProps() throws IOException {
    Properties props=new Properties();
    FileOutputStream fos=null;
    File fileJob=null;
    Vector v=new Vector();

    try {
      FileInputStream in = new FileInputStream("./transfer/job_list");
      props.load(in);
      in.close();
      Enumeration eum= props.propertyNames();
      while (eum.hasMoreElements()){
        String nameList=(String)eum.nextElement();
        if (!nameList.equalsIgnoreCase("count")){
//          props.getProperty(nameList);
          v.add(props.getProperty(nameList));
          //log.info("---->" + nameList);
        }
      }
    }
    catch (FileNotFoundException fnfex) {
      //ExceptionPrint.error("No found file");
    }

    return v;
  }

 public synchronized void InToOut() throws IOException {

    File sfile = new File("./transfer/A000001/789.txt");

    FileInputStream fis = new FileInputStream(sfile);
    FileOutputStream fos = new FileOutputStream(sfile);

    byte[] bs = new byte[1024];
    int len = 0;
    while ( (len = fis.read(bs)) != -1) {
      fos.write(bs, 0, len);
    }

    fis.close();
    fos.flush();
    fos.close();

 /*InputStreamֱ������
    AudioInputStream
    ByteArrayInputStream
    FileInputStream
    FilterInputStream
    InputStream
    ObjectInputStream
    PipedInputStream
    SequenceInputStream
    StringBufferInputStream
 */

 }


   public synchronized static String generatePassWord(){
     Random rd=new Random();
     Random rd1=new Random(rd.nextInt());
     return  String.valueOf(rd1.nextLong());
   }


//   public static void main(String args[]){
//     //OBJSerializable O=new OBJSerializable();
//     DES des=new DES();
 //
//     des.generateKey().getEncoded();
 //
//     for (int i=0;i<100;i++){
//       System.out.println("passwords " + i + "=" + OBJSerializable.generatePassWord());
//     }
 //
//     try {
 //
//       //sg
 //
//     }
//     catch (Exception ex) {
//       ex.printStackTrace();
//     }
//   }
   
}
