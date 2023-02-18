/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Display Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getDisplayPosition()
 * @model
 * @generated
 */
public enum DisplayPosition implements Enumerator {
	/**
	 * The '<em><b>Thirdperson righthand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDPERSON_RIGHTHAND_VALUE
	 * @generated
	 * @ordered
	 */
	THIRDPERSON_RIGHTHAND(0, "thirdperson_righthand", "thirdperson_righthand"),

	/**
	 * The '<em><b>Thirdperson lefthand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDPERSON_LEFTHAND_VALUE
	 * @generated
	 * @ordered
	 */
	THIRDPERSON_LEFTHAND(0, "thirdperson_lefthand", "thirdperson_lefthand"),

	/**
	 * The '<em><b>Firstperson righthand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTPERSON_RIGHTHAND_VALUE
	 * @generated
	 * @ordered
	 */
	FIRSTPERSON_RIGHTHAND(0, "firstperson_righthand", "firstperson_righthand"),

	/**
	 * The '<em><b>Firstperson lefthand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTPERSON_LEFTHAND_VALUE
	 * @generated
	 * @ordered
	 */
	FIRSTPERSON_LEFTHAND(0, "firstperson_lefthand", "firstperson_lefthand"),

	/**
	 * The '<em><b>Gui</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUI_VALUE
	 * @generated
	 * @ordered
	 */
	GUI(0, "gui", "gui"),

	/**
	 * The '<em><b>Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(0, "head", "head"),

	/**
	 * The '<em><b>Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND(0, "ground", "ground"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(0, "fixed", "fixed");

	/**
	 * The '<em><b>Thirdperson righthand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDPERSON_RIGHTHAND
	 * @model name="thirdperson_righthand"
	 * @generated
	 * @ordered
	 */
	public static final int THIRDPERSON_RIGHTHAND_VALUE = 0;

	/**
	 * The '<em><b>Thirdperson lefthand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDPERSON_LEFTHAND
	 * @model name="thirdperson_lefthand"
	 * @generated
	 * @ordered
	 */
	public static final int THIRDPERSON_LEFTHAND_VALUE = 0;

	/**
	 * The '<em><b>Firstperson righthand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTPERSON_RIGHTHAND
	 * @model name="firstperson_righthand"
	 * @generated
	 * @ordered
	 */
	public static final int FIRSTPERSON_RIGHTHAND_VALUE = 0;

	/**
	 * The '<em><b>Firstperson lefthand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTPERSON_LEFTHAND
	 * @model name="firstperson_lefthand"
	 * @generated
	 * @ordered
	 */
	public static final int FIRSTPERSON_LEFTHAND_VALUE = 0;

	/**
	 * The '<em><b>Gui</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUI
	 * @model name="gui"
	 * @generated
	 * @ordered
	 */
	public static final int GUI_VALUE = 0;

	/**
	 * The '<em><b>Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD
	 * @model name="head"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 0;

	/**
	 * The '<em><b>Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND
	 * @model name="ground"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_VALUE = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Display Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisplayPosition[] VALUES_ARRAY =
		new DisplayPosition[] {
			THIRDPERSON_RIGHTHAND,
			THIRDPERSON_LEFTHAND,
			FIRSTPERSON_RIGHTHAND,
			FIRSTPERSON_LEFTHAND,
			GUI,
			HEAD,
			GROUND,
			FIXED,
		};

	/**
	 * A public read-only list of all the '<em><b>Display Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisplayPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Display Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayPosition get(int value) {
        if (value == THIRDPERSON_RIGHTHAND_VALUE) {
            return THIRDPERSON_RIGHTHAND;
        }
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    DisplayPosition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DisplayPosition
