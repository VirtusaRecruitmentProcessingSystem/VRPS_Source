package com.virtusa.helper;
import com.virtusa.dao.TRDAO;
import com.virtusa.dao.TrDAOImp;
import com.virtusa.services.TRServices;

public class FactoryTrHelper {
			
			public static TRDAO createTRDAO(){
				TRDAO trDAO=new TrDAOImp();
				return trDAO;
				
			}
			public static TRServices createTRService(){
				TRServices trService=new TRServicesImp();
				return trService;
			}

		}

	}

}
