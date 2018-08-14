package com.sport.restservice.client.helloservice;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.jcr.api.SlingRepository;
//import com.aem.ws.* ;//import the web servce classes

//import foo.service.aem.webservice.HelloService;

/**
* One implementation of the {@link HelloService}. Note that
* the repository is injected, not retrieved.
*/
@Service
@Component(metatype = false)
public class HelloServiceImpl implements HelloService {
    /*

public String getCountryBasedonIP(String ipAddress) {
        
       try
       {
            
           //Create Objects based on WEB Service
           com.aem.ws.GeoIPService global = new com.aem.ws.GeoIPService(); 
               
           com.aem.ws.GeoIPServiceSoap geoIPSOAP = global.getGeoIPServiceSoap12();
             
           com.aem.ws.GeoIP ip = geoIPSOAP.getGeoIPContext();
                             
           ip.setIP(ipAddress) ; 
            
           return ip.getCountryName() ; 
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return ""; 
   }
  */
   
}