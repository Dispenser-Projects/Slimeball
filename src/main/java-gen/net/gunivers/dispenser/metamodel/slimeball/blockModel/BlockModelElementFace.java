/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getUv <em>Uv</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getTexture <em>Texture</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getTintIndex <em>Tint Index</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getCullface <em>Cullface</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace()
 * @model
 * @generated
 */
public interface BlockModelElementFace extends EObject {
	/**
	 * Returns the value of the '<em><b>Uv</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uv</em>' attribute list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace_Uv()
	 * @model unique="false" lower="3" upper="3"
	 * @generated
	 */
	EList<Float> getUv();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' attribute.
	 * @see #setTexture(String)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace_Texture()
	 * @model unique="false"
	 * @generated
	 */
	String getTexture();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Integer)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace_Rotation()
	 * @model unique="false"
	 * @generated
	 */
	Integer getRotation();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Integer value);

	/**
	 * Returns the value of the '<em><b>Tint Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tint Index</em>' attribute.
	 * @see #setTintIndex(Integer)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace_TintIndex()
	 * @model unique="false"
	 * @generated
	 */
	Integer getTintIndex();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getTintIndex <em>Tint Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tint Index</em>' attribute.
	 * @see #getTintIndex()
	 * @generated
	 */
	void setTintIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>Cullface</b></em>' attribute.
	 * The literals are from the enumeration {@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementCullface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cullface</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementCullface
	 * @see #setCullface(BlockModelElementCullface)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelElementFace_Cullface()
	 * @model unique="false"
	 * @generated
	 */
	BlockModelElementCullface getCullface();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace#getCullface <em>Cullface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cullface</em>' attribute.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementCullface
	 * @see #getCullface()
	 * @generated
	 */
	void setCullface(BlockModelElementCullface value);

} // BlockModelElementFace
