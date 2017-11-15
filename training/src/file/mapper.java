package file;

import java.io.IOException;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;



public class mapper extends Mapper<LongWritable,Text,Text,IntWritable>
{
	@Override
		public void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			IntWritable v2=new IntWritable(1);
			context.write(value,v2);
		}
}

/*


public class StubMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

   
	  String newKey = value.toString();
	  Text k2 = new Text(newKey);
	  IntWritable v2 = new IntWritable(1);
	  
	  context.write(k2, v2);*/

  
