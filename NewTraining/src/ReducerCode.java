import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class ReducerCode extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	@Override
	protected void reduce(Text arg0, Iterable<IntWritable> arg1,Context arg2)
			throws IOException, InterruptedException {


	}
}
