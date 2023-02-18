/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import java.util.Map;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockModelFactoryImpl extends EFactoryImpl implements BlockModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockModelFactory init() {
		try {
			BlockModelFactory theBlockModelFactory = (BlockModelFactory)EPackage.Registry.INSTANCE.getEFactory(BlockModelPackage.eNS_URI);
			if (theBlockModelFactory != null) {
				return theBlockModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BlockModelPackage.KEY_VALUE_PAIR: return (EObject)createKeyValuePair();
			case BlockModelPackage.FACE_PAIR: return (EObject)createFacePair();
			case BlockModelPackage.BLOCK_MODEL: return createBlockModel();
			case BlockModelPackage.BLOCK_MODEL_TEXTURES: return createBlockModelTextures();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE: return createBlockModelDisplayPlace();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT: return createBlockModelElement();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION: return createBlockModelElementRotation();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE: return createBlockModelElementFace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BlockModelPackage.DISPLAY_POSITION:
				return createDisplayPositionFromString(eDataType, initialValue);
			case BlockModelPackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_CULLFACE:
				return createBlockModelElementCullfaceFromString(eDataType, initialValue);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE_ENUM:
				return createBlockModelElementFaceEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BlockModelPackage.DISPLAY_POSITION:
				return convertDisplayPositionToString(eDataType, instanceValue);
			case BlockModelPackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_CULLFACE:
				return convertBlockModelElementCullfaceToString(eDataType, instanceValue);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE_ENUM:
				return convertBlockModelElementFaceEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<BlockModelElementFaceEnum, BlockModelElementFace> createFacePair() {
		FacePairImpl facePair = new FacePairImpl();
		return facePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModel createBlockModel() {
		BlockModelImpl blockModel = new BlockModelImpl();
		return blockModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelTextures createBlockModelTextures() {
		BlockModelTexturesImpl blockModelTextures = new BlockModelTexturesImpl();
		return blockModelTextures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelDisplayPlace createBlockModelDisplayPlace() {
		BlockModelDisplayPlaceImpl blockModelDisplayPlace = new BlockModelDisplayPlaceImpl();
		return blockModelDisplayPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElement createBlockModelElement() {
		BlockModelElementImpl blockModelElement = new BlockModelElementImpl();
		return blockModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementRotation createBlockModelElementRotation() {
		BlockModelElementRotationImpl blockModelElementRotation = new BlockModelElementRotationImpl();
		return blockModelElementRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementFace createBlockModelElementFace() {
		BlockModelElementFaceImpl blockModelElementFace = new BlockModelElementFaceImpl();
		return blockModelElementFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayPosition createDisplayPositionFromString(EDataType eDataType, String initialValue) {
		DisplayPosition result = DisplayPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxisFromString(EDataType eDataType, String initialValue) {
		Axis result = Axis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementCullface createBlockModelElementCullfaceFromString(EDataType eDataType, String initialValue) {
		BlockModelElementCullface result = BlockModelElementCullface.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlockModelElementCullfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementFaceEnum createBlockModelElementFaceEnumFromString(EDataType eDataType, String initialValue) {
		BlockModelElementFaceEnum result = BlockModelElementFaceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlockModelElementFaceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelPackage getBlockModelPackage() {
		return (BlockModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockModelPackage getPackage() {
		return BlockModelPackage.eINSTANCE;
	}

} //BlockModelFactoryImpl
