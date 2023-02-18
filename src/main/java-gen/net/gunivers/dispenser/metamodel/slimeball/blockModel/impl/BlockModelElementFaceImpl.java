/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import java.util.Collection;
import java.util.Objects;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementCullface;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementFaceImpl#getUv <em>Uv</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementFaceImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementFaceImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementFaceImpl#getTintIndex <em>Tint Index</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementFaceImpl#getCullface <em>Cullface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelElementFaceImpl extends MinimalEObjectImpl.Container implements BlockModelElementFace {
	/**
	 * The cached value of the '{@link #getUv() <em>Uv</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUv()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> uv;

	/**
	 * The default value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected String texture = TEXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Integer rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTintIndex() <em>Tint Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTintIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TINT_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTintIndex() <em>Tint Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTintIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer tintIndex = TINT_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCullface() <em>Cullface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCullface()
	 * @generated
	 * @ordered
	 */
	protected static final BlockModelElementCullface CULLFACE_EDEFAULT = BlockModelElementCullface.DOWN;

	/**
	 * The cached value of the '{@link #getCullface() <em>Cullface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCullface()
	 * @generated
	 * @ordered
	 */
	protected BlockModelElementCullface cullface = CULLFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelElementFaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL_ELEMENT_FACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getUv() {
		if (uv == null) {
			uv = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__UV);
		}
		return uv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(String newTexture) {
		String oldTexture = texture;
		texture = newTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TEXTURE, oldTexture, texture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Integer newRotation) {
		Integer oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTintIndex() {
		return tintIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTintIndex(Integer newTintIndex) {
		Integer oldTintIndex = tintIndex;
		tintIndex = newTintIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TINT_INDEX, oldTintIndex, tintIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementCullface getCullface() {
		return cullface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCullface(BlockModelElementCullface newCullface) {
		BlockModelElementCullface oldCullface = cullface;
		cullface = newCullface == null ? CULLFACE_EDEFAULT : newCullface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__CULLFACE, oldCullface, cullface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__UV:
				return getUv();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TEXTURE:
				return getTexture();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__ROTATION:
				return getRotation();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TINT_INDEX:
				return getTintIndex();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__CULLFACE:
				return getCullface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__UV:
				getUv().clear();
				getUv().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TEXTURE:
				setTexture((String)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__ROTATION:
				setRotation((Integer)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TINT_INDEX:
				setTintIndex((Integer)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__CULLFACE:
				setCullface((BlockModelElementCullface)newValue);
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
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__UV:
				getUv().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TEXTURE:
				setTexture(TEXTURE_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TINT_INDEX:
				setTintIndex(TINT_INDEX_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__CULLFACE:
				setCullface(CULLFACE_EDEFAULT);
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
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__UV:
				return uv != null && !uv.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TEXTURE:
				return !Objects.equals(TEXTURE_EDEFAULT, texture);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__ROTATION:
				return !Objects.equals(ROTATION_EDEFAULT, rotation);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__TINT_INDEX:
				return !Objects.equals(TINT_INDEX_EDEFAULT, tintIndex);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_FACE__CULLFACE:
				return cullface != CULLFACE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		String result = super.toString() + " (uv: " +
				uv +
				", texture: " +
				texture +
				", rotation: " +
				rotation +
				", tintIndex: " +
				tintIndex +
				", cullface: " +
				cullface +
				')';
		return result;
	}

} //BlockModelElementFaceImpl
