import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StubMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    /*
     * TODO implement
     */
	  String newKey = value.toString();
	  StringTokenizer st = new StringTokenizer(newKey, " ");
	  
	  while(st.hasMoreTokens())
	  {
		  String k2= st.nextToken();
		  context.write(new Text(k2), new IntWritable(1));
	  }
	  
  }
}
