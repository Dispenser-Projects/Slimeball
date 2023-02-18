/**
 */
package net.gunivers.dispenser.metamodel.slimeball.impl;

import net.gunivers.dispenser.metamodel.slimeball.Slimeball;
import net.gunivers.dispenser.metamodel.slimeball.SlimeballFactory;
import net.gunivers.dispenser.metamodel.slimeball.SlimeballPackage;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;

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
public class SlimeballPackageImpl extends EPackageImpl implements SlimeballPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slimeballEClass = null;

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
	 * @see net.gunivers.dispenser.metamodel.slimeball.SlimeballPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SlimeballPackageImpl() {
		super(eNS_URI, SlimeballFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SlimeballPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SlimeballPackage init() {
		if (isInited) return (SlimeballPackage)EPackage.Registry.INSTANCE.getEPackage(SlimeballPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSlimeballPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SlimeballPackageImpl theSlimeballPackage = registeredSlimeballPackage instanceof SlimeballPackageImpl ? (SlimeballPackageImpl)registeredSlimeballPackage : new SlimeballPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BlockModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSlimeballPackage.createPackageContents();

		// Initialize created meta-data
		theSlimeballPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSlimeballPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SlimeballPackage.eNS_URI, theSlimeballPackage);
		return theSlimeballPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlimeball() {
		return slimeballEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlimeball_BlockModel() {
		return (EReference)slimeballEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlimeballFactory getSlimeballFactory() {
		return (SlimeballFactory)getEFactoryInstance();
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
		slimeballEClass = createEClass(SLIMEBALL);
		createEReference(slimeballEClass, SLIMEBALL__BLOCK_MODEL);
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
		initEClass(slimeballEClass, Slimeball.class, "Slimeball", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlimeball_BlockModel(), theBlockModelPackage.getBlockModel(), null, "blockModel", null, 0, 1, Slimeball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SlimeballPackageImpl
