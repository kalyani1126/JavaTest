import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestPrgrm2
{
  // This method is to print files names one by one which are in List 
	public static void print(List<String> lst)
	{
	    for(String name:lst)
	    {
	    	System.out.println(name); 
	    }
	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream to read data from console 
		 System.out.print("Enter your full path: ");  
		String path=sc.nextLine();//reads string i.e in our point of view folder path
        File dir = new File(path);
        File [] files = dir.listFiles(); 

        List<String> jan_lst=new ArrayList(); List<String> feb_lst=new ArrayList();
        List<String> mar_lst=new ArrayList(); List<String> apr_lst=new ArrayList();
        List<String> may_lst=new ArrayList(); List<String> jun_lst=new ArrayList();
        List<String> jul_lst=new ArrayList(); List<String> aug_lst=new ArrayList();
        List<String> sep_lst=new ArrayList(); List<String> oct_lst=new ArrayList();
        List<String> nov_lst=new ArrayList(); List<String> dec_lst=new ArrayList();
        
         for(File f:files)
          {
        	  Date d=new Date(f.lastModified());
        	  SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        	  String month=sdf.format(d);
        	   switch(month) 
        	    {
        	        case "Jan":  
        	        	jan_lst.add(f.getName());
        	        case "Feb":  
        	        	feb_lst.add(f.getName());
        	        case "Mar":  
        	        	mar_lst.add(f.getName());
        	        case "Apr":  
        	        	apr_lst.add(f.getName());
        	        case "May":  
        	        	may_lst.add(f.getName());
        	        case "Jun":  
        	        	jun_lst.add(f.getName());
        	        case "Jul":  
        	        	jul_lst.add(f.getName());
        	        case "Aug":  
        	        	aug_lst.add(f.getName());
        	        case "Sep":  
        	        	sep_lst.add(f.getName());
        	        case "Oct":  
        	        	oct_lst.add(f.getName());
        	        case "Nov":  
        	        	nov_lst.add(f.getName());
        	        case "Dec":  
        	        	dec_lst.add(f.getName());
			    }	   
          }
  // Below code is to print month names and it's files
       if(!jan_lst.isEmpty())
    	   System.out.println("---January created files---"); print(jan_lst);
       if(!feb_lst.isEmpty())
    	   System.out.println("---February created files---"); print(feb_lst);
       if(!mar_lst.isEmpty())
    	   System.out.println("---March created files---"); print(mar_lst);
       if(!apr_lst.isEmpty())
    	   System.out.println("---April created files---");print(apr_lst);
       if(!may_lst.isEmpty())
           System.out.println("--May created files--");print(may_lst);
       if(!jun_lst.isEmpty())
           System.out.println("---June created files---");print(jun_lst);
       if(!jul_lst.isEmpty())
           System.out.println("---July created files---");print(jul_lst);
       if(!aug_lst.isEmpty())
           System.out.println("---August created files---");print(aug_lst);
       if(!sep_lst.isEmpty())
           System.out.println("---September created files---");print(sep_lst);
       if(!oct_lst.isEmpty())
           System.out.println("---October created files---");print(oct_lst);
       if(!nov_lst.isEmpty())
           System.out.println("---November created files---");print(nov_lst);
       if(!dec_lst.isEmpty())
           System.out.println("---December created files---");print(dec_lst);
	}
}
