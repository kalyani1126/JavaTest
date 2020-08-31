import java.util.ArrayList;
import javax.sound.midi.Soundbank;

public class TestPrgrm 
{ 
       static ArrayList al=new ArrayList<>();
          public String getFstStr()
             {  
                    String final_str="";
                    String dot_str=".";
                    int arrList_size=al.size();    
	      for(int i=0;i<al.size();i++)
	       {
	            String s=(String)al.get(i); 
	               if(arrList_size-1==al.lastIndexOf(s))
	    	   {
	                         dot_str="";
	                         final_str=final_str+s;  
	    	   }
	                else
	    	   {
	                          final_str=final_str+s+dot_str;
	                     }
	         }
	      return final_str;
	  }
              public String getScndStr()
	{  
	      String final_str="";
	      String dot_str=".";
	      int arrList_size=al.size();
	      for (int i=al.size()-1;i>=0;i--)
	       {
	             String s=(String)al.get(i); 
	                if(arrList_size==al.lastIndexOf(s))
	    	   {
	                         dot_str="";
	    	       final_str=final_str+s;  
	    	   }
	    	   else
	    	    {
	    	         final_str=final_str+s+dot_str;
	    	    }
	         }
	      
	        return final_str;
	  }
       public static void main(String[] args) 
          {    
                       al.add("a");
	      al.add("b");
	      al.add("c");

	     TestPrgrm tp=new TestPrgrm();
	     
	     String fst_str=tp.getFstStr();
	     String snd_str=tp.getScndStr();
	     System.out.println(fst_str.concat("=")+snd_str.substring(0,snd_str.lastIndexOf(".")).concat(";"));
	      
	 }
}
