import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


public class MyReverse extends UDF {

	public Text evaluate(Text input)
	{
		String s = input.toString();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		s = sb.toString();
		return new Text(s);
		
	}
	
	
}
