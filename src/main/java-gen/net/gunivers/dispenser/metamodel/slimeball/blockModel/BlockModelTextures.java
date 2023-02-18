/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures#getParticle <em>Particle</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelTextures()
 * @model
 * @generated
 */
public interface BlockModelTextures extends EObject {
	/**
	 * Returns the value of the '<em><b>Particle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particle</em>' attribute.
	 * @see #setParticle(String)
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelTextures_Particle()
	 * @model unique="false"
	 * @generated
	 */
	String getParticle();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures#getParticle <em>Particle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Particle</em>' attribute.
	 * @see #getParticle()
	 * @generated
	 */
	void setParticle(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' map.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage#getBlockModelTextures_Variables()
	 * @model mapType="net.gunivers.dispenser.metamodel.slimeball.blockModel.KeyValuePair&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getVariables();

} // BlockModelTextures
