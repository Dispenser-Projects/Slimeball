/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel.impl;

import java.util.Collection;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.DisplayPosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelDisplayPlaceImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelDisplayPlaceImpl extends MinimalEObjectImpl.Container implements BlockModelDisplayPlace {
	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> rotation;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> translation;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> scale;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayPosition POSITION_EDEFAULT = DisplayPosition.THIRDPERSON_RIGHTHAND;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected DisplayPosition position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelDisplayPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL_DISPLAY_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getRotation() {
		if (rotation == null) {
			rotation = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__ROTATION);
		}
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getTranslation() {
		if (translation == null) {
			translation = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION);
		}
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getScale() {
		if (scale == null) {
			scale = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__SCALE);
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayPosition getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(DisplayPosition newPosition) {
		DisplayPosition oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__ROTATION:
				return getRotation();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION:
				return getTranslation();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__SCALE:
				return getScale();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__POSITION:
				return getPosition();
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
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__ROTATION:
				getRotation().clear();
				getRotation().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__SCALE:
				getScale().clear();
				getScale().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__POSITION:
				setPosition((DisplayPosition)newValue);
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
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__ROTATION:
				getRotation().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION:
				getTranslation().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__SCALE:
				getScale().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__ROTATION:
				return rotation != null && !rotation.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__SCALE:
				return scale != null && !scale.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_DISPLAY_PLACE__POSITION:
				return position != POSITION_EDEFAULT;
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

		String result = super.toString() + " (rotation: " +
				rotation +
				", translation: " +
				translation +
				", scale: " +
				scale +
				", position: " +
				position +
				')';
		return result;
	}

} //BlockModelDisplayPlaceImpl
