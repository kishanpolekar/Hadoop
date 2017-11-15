import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class HelloReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable>{

	

	
	@Override
	protected void reduce(Text arg0, Iterable<DoubleWritable> arg1,	Context arg2)
			throws IOException, InterruptedException {
		
		
		String city = arg0.toString();
		double max = 0;
		for(DoubleWritable temp :arg1)
		{
			double t = temp.get();
			if(t>max)
			{
				max = t;
			}
			
		}
		
		arg2.write(new Text(city), new DoubleWritable(max));
		
		
		
	}
	
	
}
