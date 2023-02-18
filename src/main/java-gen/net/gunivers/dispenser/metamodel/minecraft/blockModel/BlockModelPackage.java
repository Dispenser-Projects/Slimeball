/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelFactory
 * @model kind="package"
 * @generated
 */
public interface BlockModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "net.gunivers.dispenser.metamodel.minecraft.blockModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockModelPackage eINSTANCE = net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.KeyValuePairImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.FacePairImpl <em>Face Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.FacePairImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getFacePair()
	 * @generated
	 */
	int FACE_PAIR = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Face Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Face Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl <em>Block Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModel()
	 * @generated
	 */
	int BLOCK_MODEL = 2;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Ambientocclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__AMBIENTOCCLUSION = 2;

	/**
	 * The feature id for the '<em><b>Textures</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__TEXTURES = 3;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__DISPLAY = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL__ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Block Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Block Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl <em>Display Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelDisplayPlace()
	 * @generated
	 */
	int BLOCK_MODEL_DISPLAY_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE__ROTATION = 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION = 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE__SCALE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE__POSITION = 3;

	/**
	 * The number of structural features of the '<em>Display Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Display Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_DISPLAY_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElement()
	 * @generated
	 */
	int BLOCK_MODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT__TO = 1;

	/**
	 * The feature id for the '<em><b>Shade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT__SHADE = 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT__ROTATION = 3;

	/**
	 * The feature id for the '<em><b>Faces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT__FACES = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementRotationImpl <em>Element Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementRotationImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementRotation()
	 * @generated
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION = 5;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION__ANGLE = 1;

	/**
	 * The feature id for the '<em><b>Rescale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION__RESCALE = 2;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION__AXIS = 3;

	/**
	 * The number of structural features of the '<em>Element Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_ROTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementFaceImpl <em>Element Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementFaceImpl
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementFace()
	 * @generated
	 */
	int BLOCK_MODEL_ELEMENT_FACE = 6;

	/**
	 * The feature id for the '<em><b>Uv</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE__UV = 0;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE__TEXTURE = 1;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE__ROTATION = 2;

	/**
	 * The feature id for the '<em><b>Tintindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE__TINTINDEX = 3;

	/**
	 * The feature id for the '<em><b>Cullface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE__CULLFACE = 4;

	/**
	 * The number of structural features of the '<em>Element Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_MODEL_ELEMENT_FACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition <em>Display Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getDisplayPosition()
	 * @generated
	 */
	int DISPLAY_POSITION = 7;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 8;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface <em>Element Cullface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementCullface()
	 * @generated
	 */
	int BLOCK_MODEL_ELEMENT_CULLFACE = 9;

	/**
	 * The meta object id for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum <em>Element Face Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementFaceEnum()
	 * @generated
	 */
	int BLOCK_MODEL_ELEMENT_FACE_ENUM = 10;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Face Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Face Pair</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum"
	 *        valueType="net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace" valueContainment="true"
	 * @generated
	 */
	EClass getFacePair();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFacePair()
	 * @generated
	 */
	EAttribute getFacePair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFacePair()
	 * @generated
	 */
	EReference getFacePair_Value();

	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel <em>Block Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Model</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel
	 * @generated
	 */
	EClass getBlockModel();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#get_name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#get_name()
	 * @see #getBlockModel()
	 * @generated
	 */
	EAttribute getBlockModel__name();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getParent()
	 * @see #getBlockModel()
	 * @generated
	 */
	EAttribute getBlockModel_Parent();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getAmbientocclusion <em>Ambientocclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambientocclusion</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getAmbientocclusion()
	 * @see #getBlockModel()
	 * @generated
	 */
	EAttribute getBlockModel_Ambientocclusion();

	/**
	 * Returns the meta object for the map '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getTextures <em>Textures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Textures</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getTextures()
	 * @see #getBlockModel()
	 * @generated
	 */
	EReference getBlockModel_Textures();

	/**
	 * Returns the meta object for the containment reference '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getDisplay()
	 * @see #getBlockModel()
	 * @generated
	 */
	EReference getBlockModel_Display();

	/**
	 * Returns the meta object for the containment reference list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel#getElements()
	 * @see #getBlockModel()
	 * @generated
	 */
	EReference getBlockModel_Elements();

	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace <em>Display Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Place</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace
	 * @generated
	 */
	EClass getBlockModelDisplayPlace();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rotation</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getRotation()
	 * @see #getBlockModelDisplayPlace()
	 * @generated
	 */
	EAttribute getBlockModelDisplayPlace_Rotation();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Translation</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getTranslation()
	 * @see #getBlockModelDisplayPlace()
	 * @generated
	 */
	EAttribute getBlockModelDisplayPlace_Translation();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getScale()
	 * @see #getBlockModelDisplayPlace()
	 * @generated
	 */
	EAttribute getBlockModelDisplayPlace_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace#getPosition()
	 * @see #getBlockModelDisplayPlace()
	 * @generated
	 */
	EAttribute getBlockModelDisplayPlace_Position();

	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement
	 * @generated
	 */
	EClass getBlockModelElement();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>From</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getFrom()
	 * @see #getBlockModelElement()
	 * @generated
	 */
	EAttribute getBlockModelElement_From();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>To</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getTo()
	 * @see #getBlockModelElement()
	 * @generated
	 */
	EAttribute getBlockModelElement_To();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getShade <em>Shade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shade</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getShade()
	 * @see #getBlockModelElement()
	 * @generated
	 */
	EAttribute getBlockModelElement_Shade();

	/**
	 * Returns the meta object for the containment reference '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getRotation()
	 * @see #getBlockModelElement()
	 * @generated
	 */
	EReference getBlockModelElement_Rotation();

	/**
	 * Returns the meta object for the map '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getFaces <em>Faces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Faces</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement#getFaces()
	 * @see #getBlockModelElement()
	 * @generated
	 */
	EReference getBlockModelElement_Faces();

	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation <em>Element Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Rotation</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation
	 * @generated
	 */
	EClass getBlockModelElementRotation();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Origin</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getOrigin()
	 * @see #getBlockModelElementRotation()
	 * @generated
	 */
	EAttribute getBlockModelElementRotation_Origin();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAngle()
	 * @see #getBlockModelElementRotation()
	 * @generated
	 */
	EAttribute getBlockModelElementRotation_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getRescale <em>Rescale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rescale</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getRescale()
	 * @see #getBlockModelElementRotation()
	 * @generated
	 */
	EAttribute getBlockModelElementRotation_Rescale();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementRotation#getAxis()
	 * @see #getBlockModelElementRotation()
	 * @generated
	 */
	EAttribute getBlockModelElementRotation_Axis();

	/**
	 * Returns the meta object for class '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace <em>Element Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Face</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace
	 * @generated
	 */
	EClass getBlockModelElementFace();

	/**
	 * Returns the meta object for the attribute list '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getUv <em>Uv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uv</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getUv()
	 * @see #getBlockModelElementFace()
	 * @generated
	 */
	EAttribute getBlockModelElementFace_Uv();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getTexture()
	 * @see #getBlockModelElementFace()
	 * @generated
	 */
	EAttribute getBlockModelElementFace_Texture();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getRotation()
	 * @see #getBlockModelElementFace()
	 * @generated
	 */
	EAttribute getBlockModelElementFace_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getTintindex <em>Tintindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tintindex</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getTintindex()
	 * @see #getBlockModelElementFace()
	 * @generated
	 */
	EAttribute getBlockModelElementFace_Tintindex();

	/**
	 * Returns the meta object for the attribute '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getCullface <em>Cullface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cullface</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFace#getCullface()
	 * @see #getBlockModelElementFace()
	 * @generated
	 */
	EAttribute getBlockModelElementFace_Cullface();

	/**
	 * Returns the meta object for enum '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition <em>Display Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Position</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition
	 * @generated
	 */
	EEnum getDisplayPosition();

	/**
	 * Returns the meta object for enum '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis
	 * @generated
	 */
	EEnum getAxis();

	/**
	 * Returns the meta object for enum '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface <em>Element Cullface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Cullface</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface
	 * @generated
	 */
	EEnum getBlockModelElementCullface();

	/**
	 * Returns the meta object for enum '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum <em>Element Face Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Face Enum</em>'.
	 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum
	 * @generated
	 */
	EEnum getBlockModelElementFaceEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockModelFactory getBlockModelFactory();

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
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.KeyValuePairImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.FacePairImpl <em>Face Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.FacePairImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getFacePair()
		 * @generated
		 */
		EClass FACE_PAIR = eINSTANCE.getFacePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE_PAIR__KEY = eINSTANCE.getFacePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACE_PAIR__VALUE = eINSTANCE.getFacePair_Value();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl <em>Block Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModel()
		 * @generated
		 */
		EClass BLOCK_MODEL = eINSTANCE.getBlockModel();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL__NAME = eINSTANCE.getBlockModel__name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL__PARENT = eINSTANCE.getBlockModel_Parent();

		/**
		 * The meta object literal for the '<em><b>Ambientocclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL__AMBIENTOCCLUSION = eINSTANCE.getBlockModel_Ambientocclusion();

		/**
		 * The meta object literal for the '<em><b>Textures</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_MODEL__TEXTURES = eINSTANCE.getBlockModel_Textures();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_MODEL__DISPLAY = eINSTANCE.getBlockModel_Display();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_MODEL__ELEMENTS = eINSTANCE.getBlockModel_Elements();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl <em>Display Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelDisplayPlace()
		 * @generated
		 */
		EClass BLOCK_MODEL_DISPLAY_PLACE = eINSTANCE.getBlockModelDisplayPlace();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_DISPLAY_PLACE__ROTATION = eINSTANCE.getBlockModelDisplayPlace_Rotation();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION = eINSTANCE.getBlockModelDisplayPlace_Translation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_DISPLAY_PLACE__SCALE = eINSTANCE.getBlockModelDisplayPlace_Scale();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_DISPLAY_PLACE__POSITION = eINSTANCE.getBlockModelDisplayPlace_Position();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElement()
		 * @generated
		 */
		EClass BLOCK_MODEL_ELEMENT = eINSTANCE.getBlockModelElement();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT__FROM = eINSTANCE.getBlockModelElement_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT__TO = eINSTANCE.getBlockModelElement_To();

		/**
		 * The meta object literal for the '<em><b>Shade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT__SHADE = eINSTANCE.getBlockModelElement_Shade();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_MODEL_ELEMENT__ROTATION = eINSTANCE.getBlockModelElement_Rotation();

		/**
		 * The meta object literal for the '<em><b>Faces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_MODEL_ELEMENT__FACES = eINSTANCE.getBlockModelElement_Faces();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementRotationImpl <em>Element Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementRotationImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementRotation()
		 * @generated
		 */
		EClass BLOCK_MODEL_ELEMENT_ROTATION = eINSTANCE.getBlockModelElementRotation();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN = eINSTANCE.getBlockModelElementRotation_Origin();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_ROTATION__ANGLE = eINSTANCE.getBlockModelElementRotation_Angle();

		/**
		 * The meta object literal for the '<em><b>Rescale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_ROTATION__RESCALE = eINSTANCE.getBlockModelElementRotation_Rescale();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_ROTATION__AXIS = eINSTANCE.getBlockModelElementRotation_Axis();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementFaceImpl <em>Element Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelElementFaceImpl
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementFace()
		 * @generated
		 */
		EClass BLOCK_MODEL_ELEMENT_FACE = eINSTANCE.getBlockModelElementFace();

		/**
		 * The meta object literal for the '<em><b>Uv</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_FACE__UV = eINSTANCE.getBlockModelElementFace_Uv();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_FACE__TEXTURE = eINSTANCE.getBlockModelElementFace_Texture();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_FACE__ROTATION = eINSTANCE.getBlockModelElementFace_Rotation();

		/**
		 * The meta object literal for the '<em><b>Tintindex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_FACE__TINTINDEX = eINSTANCE.getBlockModelElementFace_Tintindex();

		/**
		 * The meta object literal for the '<em><b>Cullface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_MODEL_ELEMENT_FACE__CULLFACE = eINSTANCE.getBlockModelElementFace_Cullface();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition <em>Display Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getDisplayPosition()
		 * @generated
		 */
		EEnum DISPLAY_POSITION = eINSTANCE.getDisplayPosition();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.Axis
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface <em>Element Cullface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementCullface
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementCullface()
		 * @generated
		 */
		EEnum BLOCK_MODEL_ELEMENT_CULLFACE = eINSTANCE.getBlockModelElementCullface();

		/**
		 * The meta object literal for the '{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum <em>Element Face Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElementFaceEnum
		 * @see net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelPackageImpl#getBlockModelElementFaceEnum()
		 * @generated
		 */
		EEnum BLOCK_MODEL_ELEMENT_FACE_ENUM = eINSTANCE.getBlockModelElementFaceEnum();

	}

} //BlockModelPackage
