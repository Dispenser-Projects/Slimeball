/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getFrom <em>From</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getTo <em>To</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getShade <em>Shade</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getFaces <em>Faces</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement()
 * @model
 * @generated
 */
public interface BlockModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement_From()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement_To()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getTo();

	/**
	 * Returns the value of the '<em><b>Shade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shade</em>' attribute.
	 * @see #setShade(Boolean)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement_Shade()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShade();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getShade <em>Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shade</em>' attribute.
	 * @see #getShade()
	 * @generated
	 */
	void setShade(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(BlockModelElementRotation)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	BlockModelElementRotation getRotation();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(BlockModelElementRotation value);

	/**
	 * Returns the value of the '<em><b>Faces</b></em>' map.
	 * The key is of type {@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFaceEnum},
	 * and the value is of type {@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faces</em>' map.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElement_Faces()
	 * @model mapType="net.gunivers.dispenser.metamodel.slimeball.blockModel.FacePair&lt;net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFaceEnum, net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace&gt;"
	 * @generated
	 */
	EMap<BlockModelElementFaceEnum, BlockModelElementFace> getFaces();

} // BlockModelElement
