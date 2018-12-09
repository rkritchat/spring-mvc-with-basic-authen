package com.rkritchat.soapclient;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import org.springframework.stereotype.Component;



@Component
public class SoapClient {
	
	public String convertNumberToWord(String number) {
		NumberConversion service = new NumberConversion();
		NumberConversionSoapType stub = service.getNumberConversionSoap();
		String reuslt = stub.numberToWords(new BigInteger(number));
		return reuslt;
	}
}
