/**
 */
package net.gunivers.dispenser.metamodel.slimeball;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.slimeball.SlimeballFactory
 * @model kind="package"
 * @generated
 */
public interface SlimeballPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slimeball";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "net.gunivers.dispenser.metamodel.slimeball";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slimeball";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlimeballPackage eINSTANCE = net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballImpl <em>Slimeball</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballImpl
	 * @see net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballPackageImpl#getSlimeball()
	 * @generated
	 */
	int SLIMEBALL = 0;

	/**
	 * The feature id for the '<em><b>Block Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIMEBALL__BLOCK_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Slimeball</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIMEBALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Slimeball</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIMEBALL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.slimeball.Slimeball <em>Slimeball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slimeball</em>'.
	 * @see net.gunivers.dispenser.metamodel.slimeball.Slimeball
	 * @generated
	 */
	EClass getSlimeball();

	/**
	 * Returns the meta object for the reference '{@link net.gunivers.dispenser.metamodel.slimeball.Slimeball#getBlockModel <em>Block Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block Model</em>'.
	 * @see net.gunivers.dispenser.metamodel.slimeball.Slimeball#getBlockModel()
	 * @see #getSlimeball()
	 * @generated
	 */
	EReference getSlimeball_BlockModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlimeballFactory getSlimeballFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballImpl <em>Slimeball</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballImpl
		 * @see net.gunivers.dispenser.metamodel.slimeball.impl.SlimeballPackageImpl#getSlimeball()
		 * @generated
		 */
		EClass SLIMEBALL = eINSTANCE.getSlimeball();

		/**
		 * The meta object literal for the '<em><b>Block Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIMEBALL__BLOCK_MODEL = eINSTANCE.getSlimeball_BlockModel();

	}

} //SlimeballPackage
