/**
 */
package net.gunivers.dispenser.metamodel.minecraft;

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
 * @see net.gunivers.dispenser.metamodel.minecraft.MinecraftFactory
 * @model kind="package"
 * @generated
 */
public interface MinecraftPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minecraft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "net.gunivers.dispenser.metamodel.minecraft";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minecraft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinecraftPackage eINSTANCE = net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftImpl <em>Minecraft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftPackageImpl#getMinecraft()
	 * @generated
	 */
	int MINECRAFT = 0;

	/**
	 * The feature id for the '<em><b>Block Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINECRAFT__BLOCK_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Minecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINECRAFT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Minecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINECRAFT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.Minecraft <em>Minecraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minecraft</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.Minecraft
	 * @generated
	 */
	EClass getMinecraft();

	/**
	 * Returns the meta object for the reference '{@link net.gunivers.dispenser.metamodel.minecraft.Minecraft#getBlockModel <em>Block Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block Model</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.Minecraft#getBlockModel()
	 * @see #getMinecraft()
	 * @generated
	 */
	EReference getMinecraft_BlockModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinecraftFactory getMinecraftFactory();

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
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftImpl <em>Minecraft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftPackageImpl#getMinecraft()
		 * @generated
		 */
		EClass MINECRAFT = eINSTANCE.getMinecraft();

		/**
		 * The meta object literal for the '<em><b>Block Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINECRAFT__BLOCK_MODEL = eINSTANCE.getMinecraft_BlockModel();

	}

} //MinecraftPackage
