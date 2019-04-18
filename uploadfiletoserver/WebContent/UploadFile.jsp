<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import = "javax.servlet.http.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "org.apache.commons.io.output.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
File file;
int maxFileSize=5000*1024;
int maxMemSize=5000*1024;
ServletContext context=pageContext.getServletContext();
String filePath=context.getInitParameter("file-upload");
String contentType=request.getContentType();
if((contentType.indexOf("multipart/formdata")>=0)){
	DiskFileItemFactory factory = new DiskFileItemFactory();
	factory.setSizeThreshold(maxMemSize);
	factory.setRepository(new File("c:\\temp"));
	ServletFileUpload upload=new ServletFileUpload(factory);
	upload.setSizeMax(maxFileSize);
	try{
		 List fileItems = upload.parseRequest(request);
		 Iterator i=fileItems.iterator();
		 out.println("<html>");
         out.println("<head>");
         out.println("<title>JSP File upload</title>");  
         out.println("</head>");
         out.println("<body>");
         while(i.hasNext()){
        	 FileItem fi=(FileItem)i.next();
        	 if(!fi.isFormField()){
        		 String fieldName = fi.getFieldName();
                 String fileName = fi.getName();
                 boolean isInMemory = fi.isInMemory();
                 long sizeInBytes = fi.getSize();
                 if( fileName.lastIndexOf("\\") >= 0 ) {
                     file = new File( filePath + 
                     fileName.substring( fileName.lastIndexOf("\\"))) ;
                  } else {
                     file = new File( filePath + 
                     fileName.substring(fileName.lastIndexOf("\\")+1)) ;
                  }
                  fi.write( file ) ;
                  out.println("Uploaded Filename: " + filePath + 
                  fileName + "<br>");
        	 }
         }
         out.println("</body>");
         out.println("</html");
	}
	catch(Exception ex){
		out.println(ex.getMessage());
	}
	
}
else{
	out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet upload</title>");  
    out.println("</head>");
    out.println("<body>");
    out.println("<p>No file uploaded</p>"); 
    out.println("</body>");
    out.println("</html>");
}
%>
</body>
</html>