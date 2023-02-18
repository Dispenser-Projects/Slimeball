/**
 */
package net.gunivers.dispenser.metamodel.slimeball;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slimeball</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.Slimeball#getBlockModel <em>Block Model</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.SlimeballPackage#getSlimeball()
 * @model
 * @generated
 */
public interface Slimeball extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Model</em>' reference.
	 * @see #setBlockModel(BlockModel)
	 * @see net.gunivers.dispenser.metamodel.slimeball.SlimeballPackage#getSlimeball_BlockModel()
	 * @model
	 * @generated
	 */
	BlockModel getBlockModel();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.Slimeball#getBlockModel <em>Block Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Model</em>' reference.
	 * @see #getBlockModel()
	 * @generated
	 */
	void setBlockModel(BlockModel value);

} // Slimeball
