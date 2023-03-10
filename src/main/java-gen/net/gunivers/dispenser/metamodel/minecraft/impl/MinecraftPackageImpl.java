/**
 */
package net.gunivers.dispenser.metamodel.minecraft.impl;

import net.gunivers.dispenser.metamodel.minecraft.Minecraft;
import net.gunivers.dispenser.metamodel.minecraft.MinecraftFactory;
import net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinecraftPackageImpl extends EPackageImpl implements MinecraftPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minecraftEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinecraftPackageImpl() {
		super(eNS_URI, MinecraftFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MinecraftPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinecraftPackage init() {
		if (isInited) return (MinecraftPackage)EPackage.Registry.INSTANCE.getEPackage(MinecraftPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMinecraftPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MinecraftPackageImpl theMinecraftPackage = registeredMinecraftPackage instanceof MinecraftPackageImpl ? (MinecraftPackageImpl)registeredMinecraftPackage : new MinecraftPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BlockModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMinecraftPackage.createPackageContents();

		// Initialize created meta-data
		theMinecraftPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinecraftPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinecraftPackage.eNS_URI, theMinecraftPackage);
		return theMinecraftPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinecraft() {
		return minecraftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinecraft_BlockModel() {
		return (EReference)minecraftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinecraftFactory getMinecraftFactory() {
		return (MinecraftFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		minecraftEClass = createEClass(MINECRAFT);
		createEReference(minecraftEClass, MINECRAFT__BLOCK_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlockModelPackage theBlockModelPackage = (BlockModelPackage)EPackage.Registry.INSTANCE.getEPackage(BlockModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(minecraftEClass, Minecraft.class, "Minecraft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinecraft_BlockModel(), theBlockModelPackage.getBlockModel(), null, "blockModel", null, 0, 1, Minecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MinecraftPackageImpl
