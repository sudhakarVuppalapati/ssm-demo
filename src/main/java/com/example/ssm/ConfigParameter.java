package com.example.ssm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class ConfigParameter {

	

	@Value("${service.url}")
	public  String SERVICE_URL;

//	@Value("${S3BucketOEMRawRejected}")
//	public static String S3BUCKET_OEM_RAW_REJECTED;
//	
//	@Value("${authTlsCert}")
//	public static String AUTH_TLS_CERT;
//	
//	@Value("${authTlsKey}")
//	public static String AUTH_TLS_KEY;
//	
//	@Value("${authTlsTrustCerts}")
//	public static String AUTH_TLS_TRUST_CERTS;
//	
//	@Value("${mobilitySubscriptionName}")
//	public static String MOBILITY_SUBSCRIPTION_NAME;
//	
//	@Value("${mobilityTopic}")
//	public static String MOBILITY_TOPIC;
//	
//	@Value("${optOutSubscriptionName}")
//	public static String OPT_OUT_SUBSCRIPTION_NAME;
//	
//	@Value("${optOutTopic}")
//	public static String OPT_OUT_TOPIC;
//	
//	@Value("${receiverQueueSize}")
//	public static String RECEIVER_QUEUE_SIZE;
//	
//	@Value("${s3BucketOEMRaw}")
//	public static String S3BUCKET_OEM_RAW;
//
//	@Value("${subscriberSubscriptionName}")
//	public static String SUBSCRIBER_SUBSCRIPTION_NAME;
//	
//	@Value("${subscriberTopic}")
//	public static String  SUBSCRIBER_TOPIC;
//	
	
	
	

}
