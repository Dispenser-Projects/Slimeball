/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel.impl;

import java.util.Map;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelFactory;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class BlockModelPackageImpl extends EPackageImpl implements BlockModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockModelDisplayPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockModelElementRotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockModelElementFaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockModelElementCullfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockModelElementFaceEnumEEnum = null;

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
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockModelPackageImpl() {
		super(eNS_URI, BlockModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BlockModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockModelPackage init() {
		if (isInited) return (BlockModelPackage)EPackage.Registry.INSTANCE.getEPackage(BlockModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBlockModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BlockModelPackageImpl theBlockModelPackage = registeredBlockModelPackage instanceof BlockModelPackageImpl ? (BlockModelPackageImpl)registeredBlockModelPackage : new BlockModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBlockModelPackage.createPackageContents();

		// Initialize created meta-data
		theBlockModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlockModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockModelPackage.eNS_URI, theBlockModelPackage);
		return theBlockModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Value() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacePair() {
		return facePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacePair_Key() {
		return (EAttribute)facePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacePair_Value() {
		return (EReference)facePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockModel() {
		return blockModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModel__name() {
		return (EAttribute)blockModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModel_Parent() {
		return (EAttribute)blockModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModel_Ambientocclusion() {
		return (EAttribute)blockModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockModel_Textures() {
		return (EReference)blockModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockModel_Display() {
		return (EReference)blockModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockModel_Elements() {
		return (EReference)blockModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockModelDisplayPlace() {
		return blockModelDisplayPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelDisplayPlace_Rotation() {
		return (EAttribute)blockModelDisplayPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelDisplayPlace_Translation() {
		return (EAttribute)blockModelDisplayPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelDisplayPlace_Scale() {
		return (EAttribute)blockModelDisplayPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelDisplayPlace_Position() {
		return (EAttribute)blockModelDisplayPlaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockModelElement() {
		return blockModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElement_From() {
		return (EAttribute)blockModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElement_To() {
		return (EAttribute)blockModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElement_Shade() {
		return (EAttribute)blockModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockModelElement_Rotation() {
		return (EReference)blockModelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockModelElement_Faces() {
		return (EReference)blockModelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockModelElementRotation() {
		return blockModelElementRotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementRotation_Origin() {
		return (EAttribute)blockModelElementRotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementRotation_Angle() {
		return (EAttribute)blockModelElementRotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementRotation_Rescale() {
		return (EAttribute)blockModelElementRotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementRotation_Axis() {
		return (EAttribute)blockModelElementRotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockModelElementFace() {
		return blockModelElementFaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementFace_Uv() {
		return (EAttribute)blockModelElementFaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementFace_Texture() {
		return (EAttribute)blockModelElementFaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementFace_Rotation() {
		return (EAttribute)blockModelElementFaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementFace_Tintindex() {
		return (EAttribute)blockModelElementFaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockModelElementFace_Cullface() {
		return (EAttribute)blockModelElementFaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayPosition() {
		return displayPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxis() {
		return axisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockModelElementCullface() {
		return blockModelElementCullfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockModelElementFaceEnum() {
		return blockModelElementFaceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelFactory getBlockModelFactory() {
		return (BlockModelFactory)getEFactoryInstance();
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
		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		facePairEClass = createEClass(FACE_PAIR);
		createEAttribute(facePairEClass, FACE_PAIR__KEY);
		createEReference(facePairEClass, FACE_PAIR__VALUE);

		blockModelEClass = createEClass(BLOCK_MODEL);
		createEAttribute(blockModelEClass, BLOCK_MODEL__NAME);
		createEAttribute(blockModelEClass, BLOCK_MODEL__PARENT);
		createEAttribute(blockModelEClass, BLOCK_MODEL__AMBIENTOCCLUSION);
		createEReference(blockModelEClass, BLOCK_MODEL__TEXTURES);
		createEReference(blockModelEClass, BLOCK_MODEL__DISPLAY);
		createEReference(blockModelEClass, BLOCK_MODEL__ELEMENTS);

		blockModelDisplayPlaceEClass = createEClass(BLOCK_MODEL_DISPLAY_PLACE);
		createEAttribute(blockModelDisplayPlaceEClass, BLOCK_MODEL_DISPLAY_PLACE__ROTATION);
		createEAttribute(blockModelDisplayPlaceEClass, BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION);
		createEAttribute(blockModelDisplayPlaceEClass, BLOCK_MODEL_DISPLAY_PLACE__SCALE);
		createEAttribute(blockModelDisplayPlaceEClass, BLOCK_MODEL_DISPLAY_PLACE__POSITION);

		blockModelElementEClass = createEClass(BLOCK_MODEL_ELEMENT);
		createEAttribute(blockModelElementEClass, BLOCK_MODEL_ELEMENT__FROM);
		createEAttribute(blockModelElementEClass, BLOCK_MODEL_ELEMENT__TO);
		createEAttribute(blockModelElementEClass, BLOCK_MODEL_ELEMENT__SHADE);
		createEReference(blockModelElementEClass, BLOCK_MODEL_ELEMENT__ROTATION);
		createEReference(blockModelElementEClass, BLOCK_MODEL_ELEMENT__FACES);

		blockModelElementRotationEClass = createEClass(BLOCK_MODEL_ELEMENT_ROTATION);
		createEAttribute(blockModelElementRotationEClass, BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN);
		createEAttribute(blockModelElementRotationEClass, BLOCK_MODEL_ELEMENT_ROTATION__ANGLE);
		createEAttribute(blockModelElementRotationEClass, BLOCK_MODEL_ELEMENT_ROTATION__RESCALE);
		createEAttribute(blockModelElementRotationEClass, BLOCK_MODEL_ELEMENT_ROTATION__AXIS);

		blockModelElementFaceEClass = createEClass(BLOCK_MODEL_ELEMENT_FACE);
		createEAttribute(blockModelElementFaceEClass, BLOCK_MODEL_ELEMENT_FACE__UV);
		createEAttribute(blockModelElementFaceEClass, BLOCK_MODEL_ELEMENT_FACE__TEXTURE);
		createEAttribute(blockModelElementFaceEClass, BLOCK_MODEL_ELEMENT_FACE__ROTATION);
		createEAttribute(blockModelElementFaceEClass, BLOCK_MODEL_ELEMENT_FACE__TINTINDEX);
		createEAttribute(blockModelElementFaceEClass, BLOCK_MODEL_ELEMENT_FACE__CULLFACE);

		// Create enums
		displayPositionEEnum = createEEnum(DISPLAY_POSITION);
		axisEEnum = createEEnum(AXIS);
		blockModelElementCullfaceEEnum = createEEnum(BLOCK_MODEL_ELEMENT_CULLFACE);
		blockModelElementFaceEnumEEnum = createEEnum(BLOCK_MODEL_ELEMENT_FACE_ENUM);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(keyValuePairEClass, Map.Entry.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValuePair_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facePairEClass, Map.Entry.class, "FacePair", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacePair_Key(), this.getBlockModelElementFaceEnum(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacePair_Value(), this.getBlockModelElementFace(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockModelEClass, BlockModel.class, "BlockModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockModel__name(), theEcorePackage.getEString(), "_name", null, 0, 1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModel_Parent(), theEcorePackage.getEString(), "parent", null, 0, 1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModel_Ambientocclusion(), theEcorePackage.getEBooleanObject(), "ambientocclusion", "true", 0, 1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockModel_Textures(), this.getKeyValuePair(), null, "textures", null, 0, -1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockModel_Display(), this.getBlockModelDisplayPlace(), null, "display", null, 0, 1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockModel_Elements(), this.getBlockModelElement(), null, "elements", null, 1, -1, BlockModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockModelDisplayPlaceEClass, BlockModelDisplayPlace.class, "BlockModelDisplayPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockModelDisplayPlace_Rotation(), theEcorePackage.getEFloatObject(), "rotation", null, 3, 3, BlockModelDisplayPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelDisplayPlace_Translation(), theEcorePackage.getEFloatObject(), "translation", null, 3, 3, BlockModelDisplayPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelDisplayPlace_Scale(), theEcorePackage.getEFloatObject(), "scale", null, 3, 3, BlockModelDisplayPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelDisplayPlace_Position(), this.getDisplayPosition(), "position", null, 0, 1, BlockModelDisplayPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockModelElementEClass, BlockModelElement.class, "BlockModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockModelElement_From(), theEcorePackage.getEFloatObject(), "from", null, 3, 3, BlockModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElement_To(), theEcorePackage.getEFloatObject(), "to", null, 3, 3, BlockModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElement_Shade(), theEcorePackage.getEBooleanObject(), "shade", "true", 0, 1, BlockModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockModelElement_Rotation(), this.getBlockModelElementRotation(), null, "rotation", null, 0, 1, BlockModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockModelElement_Faces(), this.getFacePair(), null, "faces", null, 1, -1, BlockModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockModelElementRotationEClass, BlockModelElementRotation.class, "BlockModelElementRotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockModelElementRotation_Origin(), theEcorePackage.getEFloatObject(), "origin", null, 3, 3, BlockModelElementRotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementRotation_Angle(), theEcorePackage.getEFloatObject(), "angle", null, 0, 1, BlockModelElementRotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementRotation_Rescale(), theEcorePackage.getEBooleanObject(), "rescale", "false", 0, 1, BlockModelElementRotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementRotation_Axis(), this.getAxis(), "axis", null, 0, 1, BlockModelElementRotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockModelElementFaceEClass, BlockModelElementFace.class, "BlockModelElementFace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockModelElementFace_Uv(), theEcorePackage.getEFloatObject(), "uv", null, 3, 3, BlockModelElementFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementFace_Texture(), theEcorePackage.getEString(), "texture", null, 0, 1, BlockModelElementFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementFace_Rotation(), theEcorePackage.getEIntegerObject(), "rotation", "0", 0, 1, BlockModelElementFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementFace_Tintindex(), theEcorePackage.getEIntegerObject(), "tintindex", "-1", 0, 1, BlockModelElementFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockModelElementFace_Cullface(), this.getBlockModelElementCullface(), "cullface", null, 0, 1, BlockModelElementFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(displayPositionEEnum, DisplayPosition.class, "DisplayPosition");
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.THIRDPERSON_RIGHTHAND);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.THIRDPERSON_LEFTHAND);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.FIRSTPERSON_RIGHTHAND);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.FIRSTPERSON_LEFTHAND);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.GUI);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.HEAD);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.GROUND);
		addEEnumLiteral(displayPositionEEnum, DisplayPosition.FIXED);

		initEEnum(axisEEnum, Axis.class, "Axis");
		addEEnumLiteral(axisEEnum, Axis.X);
		addEEnumLiteral(axisEEnum, Axis.Y);
		addEEnumLiteral(axisEEnum, Axis.Z);

		initEEnum(blockModelElementCullfaceEEnum, BlockModelElementCullface.class, "BlockModelElementCullface");
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.DOWN);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.UP);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.NORTH);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.SOUTH);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.WEST);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.EAST);
		addEEnumLiteral(blockModelElementCullfaceEEnum, BlockModelElementCullface.BOTTOM);

		initEEnum(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.class, "BlockModelElementFaceEnum");
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.DOWN);
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.UP);
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.NORTH);
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.SOUTH);
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.WEST);
		addEEnumLiteral(blockModelElementFaceEnumEEnum, BlockModelElementFaceEnum.EAST);

		// Create resource
		createResource(eNS_URI);
	}

} //BlockModelPackageImpl
