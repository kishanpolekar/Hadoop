import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;


public class CityPartitioner extends Partitioner<Text, IntWritable> {
	
	
	@Override
	public int getPartition(Text arg0, IntWritable arg1, int arg2) {
		// TODO Auto-generated method stub
		String cityName = arg0.toString();
		
		if(cityName.equalsIgnoreCase("pune") || cityName.equalsIgnoreCase("Mumbai"))
		{     
			return 0;
		}
		
		else if(cityName.equalsIgnoreCase("Indore") || cityName.equalsIgnoreCase("Bhopal"))
		{
			return 1;
		}
		
		else if(cityName.equalsIgnoreCase("jaipur") || cityName.equalsIgnoreCase("udaipur"))
		{
			return 2;
		}
		
		else
			return 3;
		
	}
	

}
