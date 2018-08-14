package com.sport.restservice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
 
//This is a component so it can provide or consume services
@Component
   
    
@Service
 
public class DistanceImpl implements Distance {
 
    public String getDistance() {
        // TODO Auto-generated method stub
         
        try
        {
			HttpClient httpClient =  HttpClientBuilder.create().build();
            
            String url = "http://maps.googleapis.com/maps/api/distancematrix/json"
            +"?origins=Vancouver%20BC"
            + "&destinations=San%20Francisco"
            + "&sensor=false";
            HttpGet getRequest = new HttpGet("http://maps.googleapis.com/maps/api/distancematrix/json?origins=Vancouver%20BC&destinations=San%20Francisco&sensor=false");
            getRequest.addHeader("accept", "application/json");
 
            HttpResponse response = httpClient.execute(getRequest);
 
            if (response.getStatusLine().getStatusCode() != 200) {
                            throw new RuntimeException("Failed : HTTP error code : "
                                    + response.getStatusLine().getStatusCode());
                        }
 
            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
 
            String output;
             String myJSON="" ;
                while ((output = br.readLine()) != null) {
                    //System.out.println(output);
                    myJSON = myJSON + output;
                }
 
              
            httpClient.getConnectionManager().shutdown();
            return myJSON ;
        }
         
        catch (Exception e)
        {
            e.printStackTrace() ; 
        }
         
        return null;
    }
 
}