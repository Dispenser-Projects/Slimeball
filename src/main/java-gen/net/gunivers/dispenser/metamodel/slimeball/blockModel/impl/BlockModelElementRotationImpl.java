/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import java.util.Collection;
import java.util.Objects;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.Axis;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementRotation;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementRotationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementRotationImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementRotationImpl#getRescale <em>Rescale</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementRotationImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelElementRotationImpl extends MinimalEObjectImpl.Container implements BlockModelElementRotation {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> origin;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Float ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Float angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRescale() <em>Rescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescale()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRescale() <em>Rescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescale()
	 * @generated
	 * @ordered
	 */
	protected Boolean rescale = RESCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Axis AXIS_EDEFAULT = Axis.X;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis axis = AXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelElementRotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL_ELEMENT_ROTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getOrigin() {
		if (origin == null) {
			origin = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Float newAngle) {
		Float oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRescale() {
		return rescale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRescale(Boolean newRescale) {
		Boolean oldRescale = rescale;
		rescale = newRescale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__RESCALE, oldRescale, rescale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Axis newAxis) {
		Axis oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN:
				return getOrigin();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ANGLE:
				return getAngle();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__RESCALE:
				return getRescale();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__AXIS:
				return getAxis();
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ANGLE:
				setAngle((Float)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__RESCALE:
				setRescale((Boolean)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__AXIS:
				setAxis((Axis)newValue);
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN:
				getOrigin().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__RESCALE:
				setRescale(RESCALE_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__AXIS:
				setAxis(AXIS_EDEFAULT);
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ORIGIN:
				return origin != null && !origin.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__ANGLE:
				return !Objects.equals(ANGLE_EDEFAULT, angle);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__RESCALE:
				return !Objects.equals(RESCALE_EDEFAULT, rescale);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT_ROTATION__AXIS:
				return axis != AXIS_EDEFAULT;
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

		String result = super.toString() + " (origin: " +
				origin +
				", angle: " +
				angle +
				", rescale: " +
				rescale +
				", axis: " +
				axis +
				')';
		return result;
	}

} //BlockModelElementRotationImpl
