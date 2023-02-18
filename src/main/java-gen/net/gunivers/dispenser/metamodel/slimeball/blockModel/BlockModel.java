/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#get_name <em>name</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getParent <em>Parent</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getAmbientOcclusion <em>Ambient Occlusion</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getTextures <em>Textures</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel()
 * @model
 * @generated
 */
public interface BlockModel extends EObject {
	/**
	 * Returns the value of the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>name</em>' attribute.
	 * @see #set_name(String)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel__name()
	 * @model unique="false"
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(BlockModel)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel_Parent()
	 * @model
	 * @generated
	 */
	BlockModel getParent();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BlockModel value);

	/**
	 * Returns the value of the '<em><b>Ambient Occlusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Occlusion</em>' attribute.
	 * @see #setAmbientOcclusion(Boolean)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel_AmbientOcclusion()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAmbientOcclusion();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getAmbientOcclusion <em>Ambient Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Occlusion</em>' attribute.
	 * @see #getAmbientOcclusion()
	 * @generated
	 */
	void setAmbientOcclusion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Textures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textures</em>' containment reference.
	 * @see #setTextures(BlockModelTextures)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel_Textures()
	 * @model containment="true"
	 * @generated
	 */
	BlockModelTextures getTextures();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getTextures <em>Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textures</em>' containment reference.
	 * @see #getTextures()
	 * @generated
	 */
	void setTextures(BlockModelTextures value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(BlockModelDisplayPlace)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel_Display()
	 * @model containment="true"
	 * @generated
	 */
	BlockModelDisplayPlace getDisplay();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(BlockModelDisplayPlace value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModel_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockModelElement> getElements();

} // BlockModel
