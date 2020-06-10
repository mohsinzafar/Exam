package pk.cui.sc.exam.lab;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.*;
import org.junit.Test;


public class LabTest {

	@Test
	public void TestFarenhiteToCentigrade() {
		assertEquals(10,Lab.fahrenheitToCentigrade(50));
	}
	
	@Test
	public void TestCentigradeToFarehite() {
		assertEquals(68,Lab.centigradeToFahrenheit(20));
	}
	
	@Test
	public void TestRemoveSignOfExclemation() {
		assertEquals("Mohsin",Lab.removeSignOfExclaimation("Mohsin!"));
	}
	
	@Test
	public void TestCurrentDay() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		assertEquals( calendar.get(Calendar.DAY_OF_MONTH),Lab.getCurrentDay());
	}
	
	@Test
	public void TestCurrentMonth() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		assertEquals(calendar.get(Calendar.MONTH)+1,Lab.getCurrentMonth());
	}
	
	@Test
	public void TestCurrentYear() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		assertEquals(calendar.get(Calendar.YEAR),Lab.getCurrentYear());
	}
}
