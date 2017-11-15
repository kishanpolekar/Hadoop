import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<CityWritable, IntWritable, CityWritable
, IntWritable> {

	
  @Override
  public void reduce(CityWritable key, Iterable<IntWritable> values, Context context)
      throws IOException, InterruptedException {
	  
	  int max = 0;
	  for(IntWritable i :values)
	  {
		 int temp = i.get();
		  if(temp >max)
		  {
			  max = temp; 
		  }
			  
		  
	  }
	  
	  context.write(key, new IntWritable(max));
  }
     

  
}