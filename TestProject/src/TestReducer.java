import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TestReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	protected void reduce(Text arg0, Iterable<IntWritable> arg1, Context arg2)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		int count = 0;
		for(IntWritable i : arg1){
			count  = count + i.get();
		}
	
		arg2.write(arg0, new IntWritable(count));
		
	}

}
