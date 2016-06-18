import org.junit.Test;
import static org.junit.Assert.*;
import UnitTest.JunitBoolean;


public class TestBool 
{
	@Test
	public void shouldBeTrue()
	{
		JunitBoolean jBool=new JunitBoolean();
		 assertFalse(jBool.getBool());
	}
}
