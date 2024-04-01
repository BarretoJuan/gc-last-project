package proyecto.verifications;

public class ContentVerifications {
	
	public boolean verifyUsername(String username) {
		if (username.length() > 30 || username.length() < 1) {
			return false;
		}
		
		return true;
	}

	public boolean verifyPassword(String password) {
		if (password.length() > 50 || password.length() < 1) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyName(String name) {
		if (name.length() > 50 || name.length() < 1) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyCedula(String cedula) {
		if (cedula.length() > 9 || cedula.length() < 1) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyEmail(String email) {
		if (email.length() > 50 || email.length() < 1) {
			return false;
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if (!email.matches(emailRegex)) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyTelephone(String telephone) {
		String telefonoRegex = "^(\\+[0-9]{1,3})?-?([0-9]{10,11})$";
		if (!telephone.matches(telefonoRegex)) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyTitle(String title) {
		if (title.length() > 50 || title.length() < 1) {
			return false;
		}
		
		return true;
	}
	
	public boolean verifyBodyAndAnswer(String body) {
		if (body.length() > 500 || body.length() < 1) {
			return false;
		}
		
		return true;
	}
	
}
