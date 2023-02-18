/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage
 * @generated
 */
public interface BlockModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockModelFactory eINSTANCE = net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Model</em>'.
	 * @generated
	 */
	BlockModel createBlockModel();

	/**
	 * Returns a new object of class '<em>Textures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textures</em>'.
	 * @generated
	 */
	BlockModelTextures createBlockModelTextures();

	/**
	 * Returns a new object of class '<em>Display Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Place</em>'.
	 * @generated
	 */
	BlockModelDisplayPlace createBlockModelDisplayPlace();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	BlockModelElement createBlockModelElement();

	/**
	 * Returns a new object of class '<em>Element Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Rotation</em>'.
	 * @generated
	 */
	BlockModelElementRotation createBlockModelElementRotation();

	/**
	 * Returns a new object of class '<em>Element Face</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Face</em>'.
	 * @generated
	 */
	BlockModelElementFace createBlockModelElementFace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockModelPackage getBlockModelPackage();

} //BlockModelFactory
