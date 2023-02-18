/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

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
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#get_name <em>name</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getParent <em>Parent</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getAmbientocclusion <em>Ambientocclusion</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getTextures <em>Textures</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel()
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
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel__name()
	 * @model unique="false"
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel_Parent()
	 * @model unique="false"
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Ambientocclusion</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientocclusion</em>' attribute.
	 * @see #setAmbientocclusion(Boolean)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel_Ambientocclusion()
	 * @model default="true" unique="false"
	 * @generated
	 */
	Boolean getAmbientocclusion();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getAmbientocclusion <em>Ambientocclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambientocclusion</em>' attribute.
	 * @see #getAmbientocclusion()
	 * @generated
	 */
	void setAmbientocclusion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Textures</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textures</em>' map.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel_Textures()
	 * @model mapType="net.gunivers.dispenser.metamodel.minecraft.blockModel.KeyValuePair&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getTextures();

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(BlockModelDisplayPlace)
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel_Display()
	 * @model containment="true"
	 * @generated
	 */
	BlockModelDisplayPlace getDisplay();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(BlockModelDisplayPlace value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#getBlockModel_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockModelElement> getElements();

} // BlockModel
