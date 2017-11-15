package file;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class reducer extends Reducer<Text,IntWritable,Text,IntWritable >
{
@Override
public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException
{
int i=0;
for(IntWritable input:values)
{
	i=i+input.get();
	context.write(key,new IntWritable(i));	
}


}
		
}
/*

public class StubReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

  @Override
  public void reduce(Text key, Iterable<IntWritable> values, Context context)
      throws IOException, InterruptedException {
	  
	  int count = 0;
	  for(IntWritable i :values)
	  {
		  count = count + i.get();
		  
	  }
	  
	  context.write(key, new IntWritable(count));
    /*
     * TODO implement
     */

  