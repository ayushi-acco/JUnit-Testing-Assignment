package accolite_learning.learning;

public class AuthenticatorClass {
	 private AuthenticatorInterface authenticator;
	 public AuthenticatorClass(AuthenticatorInterface authenticator) {
	        this.authenticator = authenticator;
	    }
	 public boolean authenticate(String username, String password) {
	        boolean authenticated;
	         
	        authenticated = this.authenticator.authenticateUser(username, password);
	         
	        return authenticated;
	    }
}
