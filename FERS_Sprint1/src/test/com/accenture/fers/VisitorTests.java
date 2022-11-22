package test.com.accenture.fers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.accenture.fers.entity.Visitor;

class VisitorTests {
	

	Visitor v;
	
	//Se ejecuta antes de ejecutar un test
	//Se suele usar para crear los objetos y darles valores
	@BeforeEach
	void setUp() {
		v = new Visitor();

	}
	
	//Se ejecuta después de ejecutar un test
	@AfterEach
	void tearDown() {
		//se usa para borrar conexion a base de datos , ficheros creados , conexion api etc
		//se usa también para borrar objetos y ponerlos a null
		
		v=null;
	}
	

	@Test
	void testVisitorVisitor() {
		
	Visitor v2 = new Visitor(v);
		assertEquals(v, v2);
	
	}

	@Test
	void testSetVisitorId() {
		int id = 1;
		v.setVisitorId(1);
		int result=v.getVisitorId();
		assertEquals(id, result);
		assertNotNull(id);
		
	}

	@Test
	void testSetUserName() {
		
		//User normal
		
		String user="LedoTheCat";
		
		v.setUserName(user);
		
		String result=v.getUserName();
		
		assertEquals(user,result);
		assertNotNull(user);
		
		//User con minimo
		
		String user2="LedoTh";
		
		v.setUserName(user2);
		
		String result2=v.getUserName();
		
		assertEquals(user2,result2);
		assertNotNull(user2);
		
	}
	

	@Test
	void testSetPassword() {
		String pass="12345678898";
		
		v.setPassword(pass);
		
		String result=v.getPassword();
		
		assertEquals(pass,result);
		assertNotNull(pass);
		
	}

	@Test
	void testSetAddress() {
		
		String address="Avenida 8789";
		
		v.setAddress(address);
		
		String result=v.getAddress();
		
		assertEquals(address,result);
		assertNotNull(address);
	}

	@Test
	void testSetFirstName() {
		String name="Ledo";
		
		v.setFirstName(name);
		
		String result=v.getFirstName();
		
		assertEquals(name,result);
		assertNotNull(name);
	}

	@Test
	void testSetLastName() {
		
		String last="Thecat";
		
		v.setLastName(last);
		
		String result=v.getLastName();
		
		assertEquals(last,result);
		assertNotNull(last);
	}

	@Test
	void testSetEmail() {
		String mail="djd@jdjd.com";
		
		v.setEmail(mail);
		
		String result=v.getEmail();
		
		assertEquals(mail,result);
		assertNotNull(mail);
	}

	@Test
	void testSetPhoneNumber() {
		String phone="123456789";
		
		v.setPhoneNumber(phone);
		
		String result=v.getPhoneNumber();
		
		assertEquals(phone,result);
		assertNotNull(phone);
	}

	@Test
	void testSetDni() {
		
		String dni="29506789G";
		
		v.setDni(dni);
		
		String result=v.getDni();
		
		assertEquals(dni,result);
		assertNotNull(dni);
	}

}