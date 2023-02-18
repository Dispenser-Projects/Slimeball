/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.util;

import java.util.Map;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage
 * @generated
 */
public class BlockModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BlockModelPackage.KEY_VALUE_PAIR: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> keyValuePair = (Map.Entry<String, String>)theEObject;
				T result = caseKeyValuePair(keyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.FACE_PAIR: {
				@SuppressWarnings("unchecked") Map.Entry<BlockModelElementFaceEnum, BlockModelElementFace> facePair = (Map.Entry<BlockModelElementFaceEnum, BlockModelElementFace>)theEObject;
				T result = caseFacePair(facePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL: {
				BlockModel blockModel = (BlockModel)theEObject;
				T result = caseBlockModel(blockModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL_TEXTURES: {
				BlockModelTextures blockModelTextures = (BlockModelTextures)theEObject;
				T result = caseBlockModelTextures(blockModelTextures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE: {
				BlockModelDisplayPlace blockModelDisplayPlace = (BlockModelDisplayPlace)theEObject;
				T result = caseBlockModelDisplayPlace(blockModelDisplayPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL_ELEMENT: {
				BlockModelElement blockModelElement = (BlockModelElement)theEObject;
				T result = caseBlockModelElement(blockModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION: {
				BlockModelElementRotation blockModelElementRotation = (BlockModelElementRotation)theEObject;
				T result = caseBlockModelElementRotation(blockModelElementRotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE: {
				BlockModelElementFace blockModelElementFace = (BlockModelElementFace)theEObject;
				T result = caseBlockModelElementFace(blockModelElementFace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacePair(Map.Entry<BlockModelElementFaceEnum, BlockModelElementFace> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModel(BlockModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModelTextures(BlockModelTextures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModelDisplayPlace(BlockModelDisplayPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModelElement(BlockModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModelElementRotation(BlockModelElementRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Face</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Face</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockModelElementFace(BlockModelElementFace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlockModelSwitch
