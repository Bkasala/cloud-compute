package poshmark.test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Assignment {
	
	private final static Logger LOG = Logger.getLogger(Assignment.class.getName());
	
	private final static String region_config = "region";
	private final static String cpu_config = "cpu";
	
	public static void main(String[] args) {
		LOG.info("**********Start process*************");
		
		JsonObject cpuNode = getAppConfig(cpu_config);
		JsonObject regionNode = getAppConfig(region_config);
		
		//default values for execute the program.
		int hrs=24, cpus=10, price=45;
		getCosts(hrs, cpus, price, cpuNode, regionNode);
		
		LOG.info("**********End process*************");
    }
	
	private static void getCosts(
      int hrs, int cpus, int price, JsonObject cpuNode, JsonObject regionNode) {
		
		
    
  }

  public static JsonObject getAppConfig(String filename) {
	    InputStream inputStream =
	    		Assignment.class.getResourceAsStream(
	            String.format("/%s/%s", "input", filename));
	    JsonElement element = new JsonParser().parse(new InputStreamReader(inputStream));
	    return element.getAsJsonObject();
	  }
}