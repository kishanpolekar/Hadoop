import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class HelloMapper extends Mapper<LongWritable, Text, Text, DoubleWritable> {
	
	
	@Override
	protected void map(LongWritable key, Text value,
			org.apache.hadoop.mapreduce.Mapper.Context context)
			throws IOException, InterruptedException {
		
		String line = value.toString();
		StringTokenizer st = new StringTokenizer(line, " ");
		st.hasMoreTokens();
		String city = st.nextToken();
		String temp = st.nextToken();
			
			double t = Double.parseDouble(temp);
			DoubleWritable temperature = new DoubleWritable(t);
			context.write(new Text(city),temperature);
		
		
		
	}

}
