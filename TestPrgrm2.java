import java.io.File;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestPrgrm2
{
public static void main(String[] args) throws Exception
{
  Scanner scr=new Scanner(System.in);
  System.out.println("Enter your full path: ");
  String fldr=scr.nextLine();
  File f=new File(fldr);
  if(f.isDirectory())
  {
	     File[] files=f.listFiles();
	     Function<File,Integer> fun=(fl)->{ 
	    	 Long lg=fl.lastModified();
	    	 Date d=new Date(lg);
	         return d.getMonth();
	     };
	     Map<Integer,List<File>> map=Stream.of(files).collect(Collectors.groupingBy(fun));
	     BiConsumer<Integer,List<File>> biConsumer=(intMonth,lst)->
	     {
	    	 String month="";
	    	 DateFormatSymbols dfs=new DateFormatSymbols();
	    	 String[] str_months=dfs.getMonths();
	           for(int i=0;i<str_months.length-1;i++)
	           {
	        	   if(i==intMonth)  
	        	      month=str_months[i];
	    	   }
	         System.out.println("Files created in "+month+" are :");
	         lst.forEach((fl)->{
	        	 System.out.println("  "+fl.getName());});
	        };
	     map.forEach(biConsumer);
    }
    else
	  System.out.println("No such type of directory");
  scr.close();
   }
}