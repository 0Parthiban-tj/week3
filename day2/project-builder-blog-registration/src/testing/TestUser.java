package testing;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import model.User;

public class TestUser {
	LocalDateTime ld = LocalDateTime.of(2005, 4, 9, 22, 05, 12);
	User user = new User ( "amin@gmail.com","Amin@556",ld);
	
	@Test
	public void testSetterGetter() {
		user.setdate(ld);
		user.setemail("amin@gmail.com");
		user.setpassword("Amin@556");
		assertEquals("amin@gmail.com",user.getemail());
		assertEquals("Amin@556",user.getpassword());
		assertEquals(ld,user.getdate());
		try {
			user.setdate(null);
			user.setemail(null);
			user.setpassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
