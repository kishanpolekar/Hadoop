import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<LongWritable, Text, Text, Text> {

	
  @Override
  public void reduce(LongWritable key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException {
	  	Text v = values.iterator().next();
	
	  context.write(v, new Text("")); 
   
     

  }
}