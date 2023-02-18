/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Cullface</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementCullface()
 * @model
 * @generated
 */
public enum BlockModelElementCullface implements Enumerator {
	/**
	 * The '<em><b>Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(0, "down", "down"),

	/**
	 * The '<em><b>Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(0, "up", "up"),

	/**
	 * The '<em><b>North</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(0, "north", "north"),

	/**
	 * The '<em><b>South</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(0, "south", "south"),

	/**
	 * The '<em><b>West</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(0, "west", "west"),

	/**
	 * The '<em><b>East</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(0, "east", "east"),

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM(0, "bottom", "bottom");

	/**
	 * The '<em><b>Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model name="down"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 0;

	/**
	 * The '<em><b>Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model name="up"
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 0;

	/**
	 * The '<em><b>North</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model name="north"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 0;

	/**
	 * The '<em><b>South</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model name="south"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 0;

	/**
	 * The '<em><b>West</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model name="west"
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 0;

	/**
	 * The '<em><b>East</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model name="east"
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 0;

	/**
	 * The '<em><b>Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @model name="bottom"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_VALUE = 0;

	/**
	 * An array of all the '<em><b>Element Cullface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BlockModelElementCullface[] VALUES_ARRAY =
		new BlockModelElementCullface[] {
			DOWN,
			UP,
			NORTH,
			SOUTH,
			WEST,
			EAST,
			BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Element Cullface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BlockModelElementCullface> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Cullface</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockModelElementCullface get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlockModelElementCullface result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Cullface</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockModelElementCullface getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlockModelElementCullface result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Cullface</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockModelElementCullface get(int value) {
        if (value == DOWN_VALUE) {
            return DOWN;
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
    BlockModelElementCullface(int value, String name, String literal) {
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
	
} //BlockModelElementCullface
