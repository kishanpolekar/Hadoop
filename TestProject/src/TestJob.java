import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TestJob {

	public static void main(String args[]) {

		try {
			Job job = new Job();
			job.setJobName("Test Project");
			job.setMapperClass(TestMapper.class);
			job.setReducerClass(TestReducer.class);
			FileInputFormat.addInputPath(job, new Path(args[0]));
			FileOutputFormat.setOutputPath(job, new Path(args[1]));
			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(IntWritable.class);
			job.setJarByClass(TestJob.class);

			boolean success = job.waitForCompletion(true);
			System.exit(success ? 0 : 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
