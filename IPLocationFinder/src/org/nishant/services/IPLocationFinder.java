package org.nishant.services;

import net.webservicex.*;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("You need to send one IP address");
		}
		else{
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			
			//This is our stub
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.print(geoIP.getCountryName());

		}

	}

}
