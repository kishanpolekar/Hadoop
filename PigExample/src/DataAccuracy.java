import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;


public class DataAccuracy extends FilterFunc{
	
	@Override
	public Boolean exec(Tuple arg0) throws IOException {
		// TODO Auto-generated method stub
		
		if(arg0!=null)
		{
			Object obj = arg0.get(0);
			if(obj!=null)
			{
				 int temprature = (Integer)obj;
				 if(temprature<20 || temprature >30)
				 {
					 return false;
				 }
				 else
				 {
					 return true;
				 }
			}
			
		}
			
		return false;
	}

}
