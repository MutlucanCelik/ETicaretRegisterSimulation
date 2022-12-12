package eTicaretRegister.core.concretes;

import eTicaretRegister.core.abstracts.GoogleUserInformationService;
import eTicaretRegister.jRegisterWithGoogleAccount.GoogleUserInformation;

public class GoogleUserInformationManagerAdapter implements GoogleUserInformationService {

	

		@Override
		public GoogleUserInformation getUserInfo() {
			GoogleUserInformation info = new GoogleUserInformation();
			return info;
		}

		
		
	
	
}
