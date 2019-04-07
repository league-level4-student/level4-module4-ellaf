package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.

	public void setItemsReceived(int a) {
		if (a < 0) {
			itemsReceived = 0;
		} else {
			itemsReceived = a;
		}
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.

	public void setDegreesTurned(float a) {
		if (a > 360.0) {
			float b = a % 360.0f;
			degreesTurned = b;
		} else if (a < 0) {
			float c = 360.0f - a;
			float d = c % 360.0f;
			float e = 360.0f - d;
			degreesTurned = e;
		} else {
			degreesTurned = a;
		}
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space

	public void setNomenclature(String a) {
		if (a.equals("")) {
			nomenclature = " ";
		} else {
			nomenclature = a;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	private Object memberObj; // can be any object type except String. Strings get turned into objects.

	public void setMemberObj(Object a) {
		if (a instanceof String) {
			memberObj = new Object();
		} else {
			memberObj = a;
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public static void main(String[] args) {

	}

	@Test
	public void testItems() {
		setItemsReceived(-2);
		assertEquals(itemsReceived, 0);
		setItemsReceived(3);
		assertEquals(getItemsReceived(), 3);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDegrees() {
		setDegreesTurned(370.0f);
		assertEquals(degreesTurned, 10.0f, 0.0);
		setDegreesTurned(-30.0f);
		assertEquals(degreesTurned, 330.0f, 0.0);
		setDegreesTurned(40.0f);
		assertEquals(degreesTurned, 40.0f, 0.0);
		assertEquals(getDegreesTurned(), 40.0f, 0.0);
	}

	@Test
	public void testNomenclature() {
		setNomenclature("");
		assertEquals(nomenclature, " ");
		setNomenclature("Kevin");
		assertEquals(nomenclature, "Kevin");
		assertEquals(getNomenclature(), "Kevin");
	}

	@Test
	public void testMemberObj() {
		setMemberObj("banana");
		assertFalse(memberObj instanceof String);
		setMemberObj(25);
		assertEquals(memberObj, 25);
		assertEquals(getMemberObj(), 25);
	}

}
