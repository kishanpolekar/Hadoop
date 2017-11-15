import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;


public class CityWritable implements WritableComparable<CityWritable> {
	
	private Text cityName ;
	private IntWritable year;
	
	 public CityWritable() {
		// TODO Auto-generated constructor stub
		 cityName = null;
		 year = null;
	}
	
	public Text getCityName() {
		return cityName;
	}
	public void setCityName(Text cityName) {
		this.cityName = cityName;
	}
	public IntWritable getYear() {
		return year;
	}
	public void setYear(IntWritable year) {
		this.year = year;
	}
	
	
	@Override
	public void readFields(DataInput arg0) throws IOException {
		// TODO Auto-generated method stub
		cityName.readFields(arg0);
		year.readFields(arg0);
	}
	
	
	@Override
	public void write(DataOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		cityName.write(arg0);
		year.write(arg0);
	}
	
	@Override
	public int compareTo(CityWritable o) {
		// TODO Auto-generated method stub
		if(cityName.compareTo(o.cityName) == 0)
		{
			return year.compareTo(o.year);
		}
		
		else				
			return cityName.compareTo(o.cityName);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cityName.toString() + "::" + year.get(); 
	}
	

}
