package me.deepak.demo.java.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
		for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
			Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
			for (InetAddress inetAddress : Collections.list(inetAddresses)) {
				String hostName = inetAddress.getHostName();
				String hostIp = inetAddress.getHostAddress();
				System.out.println("hostName = " + hostName + ", hostIp = " + hostIp);
			}
		}
	}

}
