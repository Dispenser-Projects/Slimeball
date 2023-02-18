/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace#getTranslation <em>Translation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace#getScale <em>Scale</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelDisplayPlace()
 * @model
 * @generated
 */
public interface BlockModelDisplayPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelDisplayPlace_Rotation()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getRotation();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelDisplayPlace_Translation()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getTranslation();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelDisplayPlace_Scale()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getScale();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link net.gunivers.dispenser.metamodel.slimeball.blockModel.DisplayPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.DisplayPosition
	 * @see #setPosition(DisplayPosition)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelDisplayPlace_Position()
	 * @model unique="false"
	 * @generated
	 */
	DisplayPosition getPosition();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.DisplayPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(DisplayPosition value);

} // BlockModelDisplayPlace
