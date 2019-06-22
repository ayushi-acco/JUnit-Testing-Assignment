package accolite_learning.learning;

import org.junit.Test;
import org.mockito.Mockito;
 
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
public class AuthenticatorTest {
 
    @Test
    public void testAuthenticate() {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorClass authenticator;
        String username = "MSTRAINING";
        String password = "myPassword";
         
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorClass(authenticatorMock);
         
        when(authenticatorMock.authenticateUser(username, password))
            .thenReturn(true);
         
        boolean actual = authenticator.authenticate(username, password);
        boolean wrong=authenticator.authenticate(username,"i m wrong password");
         
        assertEquals(actual,true);
        assertEquals(wrong,false);
       
    }

	
}