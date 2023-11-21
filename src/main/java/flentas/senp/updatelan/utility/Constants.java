package flentas.senp.updatelan.utility;

public class Constants {
	//checkAccess Implementation
		public static String JWK_URl_SUFFIX = "/.well-known/jwks.json";
		public static String JWK_FILE_PREFIX = "/jwk_";
		public static String JWK_FILE_SUFFIX = ".json";
		public static String ISS = "iss";
		public static String getAppId = "appid";
		
		//Authentication URL
		public static String authenticationUrl = "https://login.microsoftonline.com/1675ffb0-1bb2-4326-a219-670dbf57c7b3/discovery/v2.0/keys?appid=5373d4a9-8f74-48b8-b198-5d5a820c1a35";
	//Authentication Exception 

		public static final String EX_TYPE_AUTHENTICATION = "Authentication Error";
		public static final String EX_TYPE_VALIDATION = "Validation Error";
		public static final String EX_TYPE_DB = "Database Error";
		public static final String EX_TYPE_INVALIDINPUTTYPE = "Invalid Input Type";
		public static final String x_karza_key_value = "lkaueM605kzIIuwO";
		public static String customException = "customException";
		
		// string true or false
		public static String IsTrue = "true";
		public static String IsFalse = "false";
		public static boolean booleanTrue = true;
		public static boolean booleanFalse = false;
		/* Get Access token */
		public static String grant_type = "grant_type";
		public static String scope = "scope";
		public static String clinet_id = "client_id";
		public static String client_secret = "client_secret";
		public static String grant_type_value = "client_credentials";
		public static String scope_value = "https://graph.microsoft.com/.default";
		public static String clinet_id_value = "5373d4a9-8f74-48b8-b198-5d5a820c1a35";
		public static String client_secret_value = "EZc8Q~CxsjP7XTm7VJ-dyTuJZrcmJa6oND8RRaUm";
		public static String getTokenUrl = "https://login.microsoftonline.com/1675ffb0-1bb2-4326-a219-670dbf57c7b3/oauth2/token";
		

		// validation status code
				public static String invalid_input_code = "102";
				public static String invalid_input = "Invalid Input";
		
		/* Fda Validation */
		public static String invalidConsent = "Please Provide correct Consent";
		public static String invalidLisence_no = "Please Provide correct Lisence_no ";
		public static String invalidState = "Please Provide correct State";
		
		/* Fssai Validation */
		public static String invalidReg_no = "Please Provide correct Reg_No";
		
		/* Aadhaar Consent Validation */
		public static String invalidConsentText="Please Provide correct ConsentText";
		public static String invalidConsentTime="Please Provide correct ConsentTime";
		public static String invalidName="Please Provide correct Name";
		public static String invalidDeviceInfo="Please Provide correct DeviceInfo";
		public static String invalidDeviceId="Please Provide correct DeviceId";
		public static String invalidIpAddress="Please Provide correct IpAddress";
		public static String invalidLong="Please Provide correct Long";
		public static String invalidLat="Please Provide correct Lat";
		public static String invalidCaseId="Please Provide correct CaseId";
		public static String invalidUserAgent="Please Provide correct UserAgent";
		
		/* Pan Aadhaar Profile Validation */
		public static String invalidAadhaar="Please Provide correct Aadhaar";
		public static String invalidPan="Please Provide correct Pan";
		public static String invalidMonthYearOfBirth="Please Provide correct MonthYearOfBirth";
		public static String invalidAccessKey="Please Provide correct AccessKey";
		
		/* Pan Aadhaar Number Verification */
		public static String invalidAadhaarNo="Please Provide correct AadhaarNo";

		
		
		/* XML Multipart API */
		public static String checkfileextentionxml = "xml";
		public static String checkfileextentionzip = "zip";
		public static String filevalidation = "Please Enter the xml or zip file";
		public static String file_builder = "form-data";
		public static String file = "file";
		public static String image = "image";
		public static String shareCode = "shareCode";
		public static String name = "name";
		public static String dob = "dob";
		public static String address = "address";
		public static String email = "email";
		public static String mobile = "mobile";
		public static String consent = "consent";
		public static String multipart_form_data = "multipart/form-data";
		
		public static String make_request_contentType_key = "content-type";
		public static String make_request_accept_key = "Accept";
		public static String application_json = "application/json";
		public static Object checkFileExtionsxml = "xml";
		public static Object checkFileExtionszip = "zip";
		public static String fileExtention="Please provide xml or zip files";
		
		public static Object checkFileExtionsImagePng = "png";
		public static Object checkFileExtionsImageJPEG = "jpeg";
		public static Object checkFileExtionsImageJPG = "jpg";
			
		public static String fileExtentionImage="Please insert image in JPEG,JPG,PNG format";
		
		public static String ExceptionStatusCode = "400";
		
		
		/* Name Similarity API */
		public static String invalidName1="Please Provide correct Name1";
		public static String invalidName2="Please Provide correct Name2";
		public static String invalidType="Please Provide correct Type";

		/* Address Similarity API */
		public static String invalidAddress1="Please Provide correct Address1";
		public static String invalidAddress2="Please Provide correct Address2";
		
		public static String invalidLan_id="Please Provide correct Lan_id";
		public static String invalidUsername="Please Provide correct Username";
		public static String invalidRequest_id="Please Provide correct Request_id";
		public static String invalidService="Please Provide correct Service";
		public static String invalidServices="Please Provide correct Service";
		public static String invalidCif="Please provide correct cif";
		
		
		
		
}
