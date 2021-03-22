package net.stafftrack.aws.util;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.pinpoint.AmazonPinpoint;
import com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PublicAccessBlockConfiguration;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.SetPublicAccessBlockRequest;

public class AmazonS3Utility {
	
	

	static Log log = LogFactory.getLog(AmazonS3Utility.class);
		
		public static String APP_ID = "PINPOINT_APPID";
		public static String ACCESSKEY = "PINPOINT_ACCESSKEY";
		public static String SECRET_ACCESSKEY = "PINPOINT_SECRET_ACCESSKEY";
		public static String REGION = "PINPOINT_REGION";

		public  String appId = "";
		public  String accessKey = "";
		public  String secretAccessKey = "";
		public  String region = "";
		public  AWSCredentials credentials = null;
		public  AWSCredentialsProvider credentialsProvider =null; 
		public  static AmazonS3Utility instance = null;
		
		
		//This is a singleton class as we need only one instance.
		 public static AmazonS3Utility getInstance() 
		    { 
		        if (instance == null) 
		        	instance = new AmazonS3Utility(); 
		  
		        return instance; 
		    } 
		 
		 
		
			
		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAccessKey() {
			return accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getSecretAccessKey() {
			return secretAccessKey;
		}

		public void setSecretAccessKey(String secretAccessKey) {
			this.secretAccessKey = secretAccessKey;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public AWSCredentials getCredentials() {
			return credentials;
		}

		public void setCredentials(AWSCredentials credentials) {
			this.credentials = credentials;
		}

		public AWSCredentialsProvider getCredentialsProvider() {
			return credentialsProvider;
		}

		public void setCredentialsProvider(AWSCredentialsProvider credentialsProvider) {
			this.credentialsProvider = credentialsProvider;
		}

		public void setInstance(AmazonS3Utility instance) {
			this.instance = instance;
		}

		public AWSCredentialsProvider getAWSCredentialProvider()
		{
			AWSCredentials credentials = new BasicAWSCredentials(accessKey,secretAccessKey);
			AWSCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(credentials);		
			return credentialsProvider;		
		}
		
		public AmazonPinpoint getPinPointClient()
		{
			AmazonPinpoint pinpoint = AmazonPinpointClientBuilder.standard().withRegion(region).build();
			return pinpoint;
		}
		
		
		
		public static void listS3Documents()
		{
		
			AWSCredentials credentials = new BasicAWSCredentials("AKIAYWDKNOXQAEDG3XAM","14mnv/TUJO4Is5sbKcDfw9iOTlzD06EagvOdZDIxoog=");
			AWSCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(credentials);		
			
			 AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
	                 .withCredentials(credentialsProvider)
	                 .withRegion("us-west-2")
	                 .build();
			 
			 s3Client.setPublicAccessBlock(new SetPublicAccessBlockRequest()
					 
						.withBucketName("stafftrack-documents")						
						.withPublicAccessBlockConfiguration(new PublicAccessBlockConfiguration()
								));
			 
			 
			 ListObjectsRequest listRequest = new ListObjectsRequest().withBucketName("stafftrack-documents").withMaxKeys(2);
	         ObjectListing objects = s3Client.listObjects(listRequest);
	         while (true) {
	             List<S3ObjectSummary> summaries = objects.getObjectSummaries();
	             for (S3ObjectSummary summary : summaries) {
	                 System.out.printf("Object \"%s\" retrieved with size %d\n", summary.getKey(), summary.getSize());
	             }
	             if (objects.isTruncated()) {
	                 objects = s3Client.listNextBatchOfObjects(objects);
	             } else {
	                 break;
	             }
	         }
		}
		
		
		
		
		

}
