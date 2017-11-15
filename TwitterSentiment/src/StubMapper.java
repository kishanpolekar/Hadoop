import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StubMapper extends Mapper<LongWritable, Text, LongWritable, Text> {
	
	String helpingVerbs[] = {"is","are","am","was","were","has","have","been","did"};
	List <String> helpingList = Arrays.asList(helpingVerbs); 

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    /*
     * TODO implement
     */
	  String tweet = value.toString();
	  StringTokenizer st = new StringTokenizer(tweet, " ");
	  String cleanTweet = "";
	  while(st.hasMoreTokens())
	  {
		  String k2= st.nextToken();
		  if(! doCompare(k2))
			  cleanTweet = cleanTweet + " " + k2;	
		  	  
	  }
	  
	  context.write(key, new Text(cleanTweet));
	  
  }
  
  private boolean doCompare(String s)
  {
	 for(String hv :helpingVerbs)
	 {
		 if(hv.equalsIgnoreCase(s))
			 return true;
	 }
	  return false;
  }
  
}
