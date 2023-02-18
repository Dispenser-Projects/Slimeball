/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.util;

import java.util.Map;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage
 * @generated
 */
public class BlockModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BlockModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelSwitch<Adapter> modelSwitch =
		new BlockModelSwitch<Adapter>() {
			@Override
			public Adapter caseKeyValuePair(Map.Entry<String, String> object) {
				return createKeyValuePairAdapter();
			}
			@Override
			public Adapter caseFacePair(Map.Entry<BlockModelElementFaceEnum, BlockModelElementFace> object) {
				return createFacePairAdapter();
			}
			@Override
			public Adapter caseBlockModel(BlockModel object) {
				return createBlockModelAdapter();
			}
			@Override
			public Adapter caseBlockModelTextures(BlockModelTextures object) {
				return createBlockModelTexturesAdapter();
			}
			@Override
			public Adapter caseBlockModelDisplayPlace(BlockModelDisplayPlace object) {
				return createBlockModelDisplayPlaceAdapter();
			}
			@Override
			public Adapter caseBlockModelElement(BlockModelElement object) {
				return createBlockModelElementAdapter();
			}
			@Override
			public Adapter caseBlockModelElementRotation(BlockModelElementRotation object) {
				return createBlockModelElementRotationAdapter();
			}
			@Override
			public Adapter caseBlockModelElementFace(BlockModelElementFace object) {
				return createBlockModelElementFaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Face Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createFacePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel <em>Block Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel
	 * @generated
	 */
	public Adapter createBlockModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures <em>Textures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures
	 * @generated
	 */
	public Adapter createBlockModelTexturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace <em>Display Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace
	 * @generated
	 */
	public Adapter createBlockModelDisplayPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement
	 * @generated
	 */
	public Adapter createBlockModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementRotation <em>Element Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementRotation
	 * @generated
	 */
	public Adapter createBlockModelElementRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace <em>Element Face</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace
	 * @generated
	 */
	public Adapter createBlockModelElementFaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BlockModelAdapterFactory
