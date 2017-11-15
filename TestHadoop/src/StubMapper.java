import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StubMapper extends Mapper<LongWritable, Text, CityWritable, IntWritable> {

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
		  String city= st.nextToken();
		  String year= st.nextToken();
		  String temp = st.nextToken();
		  
		  IntWritable y = new IntWritable(Integer.parseInt(year));
		  CityWritable cityWritable = new CityWritable();
		  cityWritable.setCityName(new Text(city));
		  cityWritable.setYear(y);		  
		  
		  int t = Integer.parseInt(temp);
		  
		  context.write(cityWritable, new IntWritable(t));
	  }
	  
  }
}
