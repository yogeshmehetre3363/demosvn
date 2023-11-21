//package flentas.senp.updatelan.utility;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.server.reactive.HttpHeadResponseDecorator;
//import org.springframework.stereotype.Component;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestTemplate;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//
//import flentas.senp.updatelan.dto.UserContext;
//
//import flentas.senp.updatelan.messages.Messages;
//import flentas.senp.updatelan.utility.Constants;
//import flentas.senp.updatelan.utility.ResponseEntityGenerator;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//public class ApiCalling {
//	@Autowired
//	UserContext userContext;
//	@Autowired
//	ResponseEntityGenerator responseEntityGenerator;
//	@Autowired
//	Messages messages;
//	
//	
//	
//	@Value("${aws.bucketName}")
//	private String bucketName;
//	@Value("${aws.accessKey}")
//	private String accessKeyId;
//	@Value("${aws.secretKey}")
//	private String accessKeySecret;
//	@Value("${aws.regionName}")
//	private String s3RegionName;
//
////	public String x_karza_key_value = Constants.x_karza_key_value;
//	
//	private final Logger logger=LoggerFactory.getLogger(this.getClass());
//	
//	public  ResponseEntity<String> make_request(String Url , String Method ,String data) {
//		
//	   try {
//		   logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
//	                + new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Utility" + "|" + "karzaApiCalling"
//	                + "|" + "make_request");
//		   RestTemplate restTemplate = new RestTemplate();
//	       HttpHeaders headers = new HttpHeaders();
////	       headers.add("x-karza-key", x_karza_key_value);
//	       headers.setContentType(MediaType.APPLICATION_JSON);
//	       HttpEntity <String> entity=new HttpEntity<String>(data, headers);
//	       ResponseEntity<String> response = restTemplate.exchange(Url,HttpMethod.POST ,entity, String.class);
////	   	logger.info("response"+response);
//	   	//System.out.println(response.getBody());
//	  	//System.out.println(response.getStatusCodeValue());
//	  	return response;
//	  	
//	   }catch (Exception e) {
//		   logger.error("ERROR" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
//	                + new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Utility" + "|" + "karzaApiCalling"
//	                + "|" + "make_request"+e.getMessage());
//		
//	   }
//	   return null;
//	
//   }
//
//
//	
//}
//
