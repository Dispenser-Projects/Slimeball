/**
 */
package net.gunivers.dispenser.metamodel.minecraft.impl;

import net.gunivers.dispenser.metamodel.minecraft.Minecraft;
import net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minecraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftImpl#getBlockModel <em>Block Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinecraftImpl extends MinimalEObjectImpl.Container implements Minecraft {
	/**
	 * The cached value of the '{@link #getBlockModel() <em>Block Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockModel()
	 * @generated
	 * @ordered
	 */
	protected BlockModel blockModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinecraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinecraftPackage.Literals.MINECRAFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModel getBlockModel() {
		if (blockModel != null && blockModel.eIsProxy()) {
			InternalEObject oldBlockModel = (InternalEObject)blockModel;
			blockModel = (BlockModel)eResolveProxy(oldBlockModel);
			if (blockModel != oldBlockModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinecraftPackage.MINECRAFT__BLOCK_MODEL, oldBlockModel, blockModel));
			}
		}
		return blockModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModel basicGetBlockModel() {
		return blockModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockModel(BlockModel newBlockModel) {
		BlockModel oldBlockModel = blockModel;
		blockModel = newBlockModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinecraftPackage.MINECRAFT__BLOCK_MODEL, oldBlockModel, blockModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		if (featureID == MinecraftPackage.MINECRAFT__BLOCK_MODEL) {
			if (resolve) return getBlockModel();
			return basicGetBlockModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		if (featureID == MinecraftPackage.MINECRAFT__BLOCK_MODEL) {
			setBlockModel((BlockModel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		if (featureID == MinecraftPackage.MINECRAFT__BLOCK_MODEL) {
			setBlockModel(null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		if (featureID == MinecraftPackage.MINECRAFT__BLOCK_MODEL) {
			return blockModel != null;
		}
		return super.eIsSet(featureID);
	}

} //MinecraftImpl
