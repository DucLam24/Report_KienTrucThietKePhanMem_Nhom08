package client;

import service.InputOIS;

import service.OutputOOS;
import service.Service;

public class MainClient {
	public static void main(String[] args) {
		Service.getInstance().start();
		//InputOutput.getInstance().start(Service.getInstance().getSocket());
//		OutputDOS.getInstance().start(Service.getInstance().getSocket());
		InputOIS.getInstance().start(Service.getInstance().getSocket());
//		InputDIS.getInstance().start(Service.getInstance().getSocket());
		OutputOOS.getInstance().start(Service.getInstance().getSocket());
//		
//		InputDIS.getInstance().start(Service.getInstance().getSocket());
		
	}
}
