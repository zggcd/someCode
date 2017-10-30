<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.regaltec.baf.pub.attach.AttachCommander"%>
<%@ page import="com.regaltec.baf.pub.attach.AttachConnection"%>
<%@ page import="java.net.*"%>
<%@ page import="java.io.*"%>

<%
       try{
            String type=request.getParameter("type")==null?"":request.getParameter("type");
            String path=request.getParameter("fileURL")==null?"":request.getParameter("fileURL");
            String fileName=request.getParameter("fileName")==null?"":request.getParameter("fileName");
			if("1".equals(type)){
			  fileName = URLEncoder.encode(fileName, "UTF-8");
         	  response.setContentType("application/x-download");//x-download octet-stream
			  response.setCharacterEncoding("UTF-8");
			  response.setHeader("Content-Disposition","attachment;filename="+fileName);
		      AttachConnection connection=new AttachConnection();
        	  connection.connect();
       	      AttachCommander commander = connection.createCommander();
			  commander.fetch(path, response.getOutputStream());
			  connection.disconnect();
			}else if("2".equals(type)){

			  OutputStream outp = null;
		      InputStream in = null;
		      try
		      {
		          URL Url = new URL(path);
		          HttpURLConnection conn = (HttpURLConnection) Url.openConnection();
				  response.setContentType("application/x-download");//x-download octet-stream
			      response.setCharacterEncoding("UTF-8");
				  int ret = conn.getResponseCode();
				  //fileName=URLDecoder.decode(conn.getURL().toString(),"UTF-8");
				  in=conn.getInputStream();
				  BufferedInputStream  bis = new BufferedInputStream(in); 
                  String fileType=HttpURLConnection.guessContentTypeFromStream(bis);
                  String exName="";
                  if("image/gif".equalsIgnoreCase(fileType))
                    exName=".gif";
                  if("image/jpeg".equalsIgnoreCase(fileType))
                    exName=".jpg";
                  if("image/png".equalsIgnoreCase(fileType))
                    exName=".png";   
			      response.setHeader("Content-Disposition","attachment;filename=get"+exName);
		          outp = response.getOutputStream();
		          byte[] b = new byte[8196];
		          int i = 0;
		          while ((i = bis.read(b, 0, b.length) )>0)
                  {
                     outp.write(b, 0, i);
                   }
		          outp.flush();
		          conn.disconnect();
		      }
		      catch(Exception e)
		      {
		            //response.setContentType("text/html"); 
		    		//response.setCharacterEncoding("UTF-8");
		    		//response.setContentType("application/xml;charset=UTF-8");
		    		//response.setHeader("Cache-Control", "no-cache");
		          	PrintWriter pout = response.getWriter();
		            String   pstrScript   =   "<script   language='javascript'>";   
		            pstrScript   +="window.alert('文件下载失败')";   
		            pstrScript   +="</script>";   
		            pout.print(pstrScript); 
		      }
		      finally
		      {
		          if(in != null)
		          {
		              in.close();
		              in = null;
		          }
		          if(outp != null)
		          {
		              outp.close();
		              outp = null;
		          }
		      }		  
			}
		}catch(Exception e){
		   // response.getOutputStream().close();
			//response.setContentType("text/html"); 
    		//response.setCharacterEncoding("UTF-8");
    		//response.setContentType("application/xml;charset=UTF-8");
    		//response.setHeader("Cache-Control", "no-cache");
    		PrintWriter pout = response.getWriter();
            String   pstrScript   =   "<script   language='javascript'>";   
            pstrScript   +="window.alert('文件下载失败')";   
            pstrScript   +="</script>";   
            pout.print(pstrScript); 


		}

 %>
