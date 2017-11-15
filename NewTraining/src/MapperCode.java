import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MapperCode extends Mapper<LongWritable,Text,Text,IntWritable> 
{

	@Override
	protected void map(LongWritable key, Text value,Context context)
			throws IOException, InterruptedException {
		IntWritable v2=new IntWritable(1);
		

		context.write(value,v2);
		
	}

	
}
