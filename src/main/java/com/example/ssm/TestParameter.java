package com.example.ssm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class TestParameter {
	
	
	public String getSomeParamName() {
		return someParamName;
	}

	public void setSomeParamName(String someParamName) {
		this.someParamName = someParamName;
	}

	@Value("${cloud.aws.stack.name}")
	private String someParamName;
	
	
	
	
	

}
