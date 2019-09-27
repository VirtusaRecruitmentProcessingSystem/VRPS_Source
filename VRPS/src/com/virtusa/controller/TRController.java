package com.virtusa.controller;

import com.virtusa.services.TRServices;

public class TRController {

	
		private TRServices trService;
		public TRController(){
			this.trService=factorytrService.createtrService();
			
		}
		public void userAuthentication(String userName, String password) {
			// TODO Auto-generated method stub
			
		}
		

}
