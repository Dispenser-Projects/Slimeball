/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getRescale <em>Rescale</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementRotation()
 * @model
 * @generated
 */
public interface BlockModelElementRotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementRotation_Origin()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getOrigin();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(Float)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementRotation_Angle()
	 * @model unique="false"
	 * @generated
	 */
	Float getAngle();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Float value);

	/**
	 * Returns the value of the '<em><b>Rescale</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale</em>' attribute.
	 * @see #setRescale(Boolean)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementRotation_Rescale()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getRescale();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getRescale <em>Rescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rescale</em>' attribute.
	 * @see #getRescale()
	 * @generated
	 */
	void setRescale(Boolean value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis
	 * @see #setAxis(Axis)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModelElementRotation_Axis()
	 * @model unique="false"
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

} // BlockModelElementRotation
