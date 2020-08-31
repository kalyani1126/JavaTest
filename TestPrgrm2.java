/* Output
January created files
file1
file2
file3
February created files
file11
file45
file6
March created files
file7
file8
file9

etc
*/
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestPrgm2 
{
        public static void main(String[] args) throws Exception
           {
	Scanner sc= new Scanner(System.in);   //System.in is a standard input stream to read data from console 
	System.out.print("Enter your full path: ");  
	String path=sc.nextLine();       //reads string i.e in our point of view folder path
                    File dir = new File(path);
                    File [] files = dir.listFiles(); 
        
        System.out.println("*** January  created files ***");    
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("jan"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** February created files ***");  
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("feb"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** March created files ***");   
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("mar"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** April created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("apr"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** May created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("may"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** June created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("jun"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** July created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("jul"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** August created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("aug"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** September created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("sep"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** October created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("oct"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** November created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("nov"))
        		   System.out.println(f.getName());
          }
         System.out.println("*** December created files ***"); 
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   if(month.equalsIgnoreCase("dec"))
        		   System.out.println(f.getName());
          }
         
      }
}
