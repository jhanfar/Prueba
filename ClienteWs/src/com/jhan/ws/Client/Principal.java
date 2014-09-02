package com.jhan.ws.Client;

import java.rmi.RemoteException;

import com.jhan.ws.beans.LoginWebSer;
import com.jhan.ws.service.ImpIementsIfLogin;
import com.jhan.ws.service.ImpIementsIfLoginProxy;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImpIementsIfLogin imple = new  ImpIementsIfLoginProxy("http://localhost:8181/ServiciosWeb/services/ImpIementsIfLogin");
		LoginWebSer  login = new LoginWebSer();
		login.setUsuario("luis");
		login.setPassword("12346");
		try{
			login =imple.validateLogin(login);
			if(login.getStatus()){
				System.out.println("welcome ....");
			}else {
				System.out.println(login.getMensaje());
				}
				
			
			
		}
		catch(RemoteException re){
			re.printStackTrace();
		}
	}

}
