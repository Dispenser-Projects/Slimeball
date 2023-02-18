/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import java.util.Collection;
import java.util.Objects;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFace;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementFaceEnum;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElementRotation;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementImpl#getFrom <em>From</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementImpl#getTo <em>To</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementImpl#getShade <em>Shade</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelElementImpl#getFaces <em>Faces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelElementImpl extends MinimalEObjectImpl.Container implements BlockModelElement {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> to;

	/**
	 * The default value of the '{@link #getShade() <em>Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShade()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShade() <em>Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShade()
	 * @generated
	 * @ordered
	 */
	protected Boolean shade = SHADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected BlockModelElementRotation rotation;

	/**
	 * The cached value of the '{@link #getFaces() <em>Faces</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaces()
	 * @generated
	 * @ordered
	 */
	protected EMap<BlockModelElementFaceEnum, BlockModelElementFace> faces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getFrom() {
		if (from == null) {
			from = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_ELEMENT__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getTo() {
		if (to == null) {
			to = new EDataTypeEList<Float>(Float.class, this, BlockModelPackage.BLOCK_MODEL_ELEMENT__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShade() {
		return shade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShade(Boolean newShade) {
		Boolean oldShade = shade;
		shade = newShade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT__SHADE, oldShade, shade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelElementRotation getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(BlockModelElementRotation newRotation, NotificationChain msgs) {
		BlockModelElementRotation oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION, oldRotation, newRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(BlockModelElementRotation newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<BlockModelElementFaceEnum, BlockModelElementFace> getFaces() {
		if (faces == null) {
			faces = new EcoreEMap<BlockModelElementFaceEnum,BlockModelElementFace>(BlockModelPackage.Literals.FACE_PAIR, FacePairImpl.class, this, BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES);
		}
		return faces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION:
				return basicSetRotation(null, msgs);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES:
				return ((InternalEList<?>)getFaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FROM:
				return getFrom();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__TO:
				return getTo();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__SHADE:
				return getShade();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION:
				return getRotation();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES:
				if (coreType) return getFaces();
				else return getFaces().map();
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends Float>)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__SHADE:
				setShade((Boolean)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION:
				setRotation((BlockModelElementRotation)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES:
				((EStructuralFeature.Setting)getFaces()).set(newValue);
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FROM:
				getFrom().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__TO:
				getTo().clear();
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__SHADE:
				setShade(SHADE_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION:
				setRotation(null);
				return;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES:
				getFaces().clear();
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
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FROM:
				return from != null && !from.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__TO:
				return to != null && !to.isEmpty();
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__SHADE:
				return !Objects.equals(SHADE_EDEFAULT, shade);
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__ROTATION:
				return rotation != null;
			case BlockModelPackage.BLOCK_MODEL_ELEMENT__FACES:
				return faces != null && !faces.isEmpty();
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

		String result = super.toString() + " (from: " +
				from +
				", to: " +
				to +
				", shade: " +
				shade +
				')';
		return result;
	}

} //BlockModelElementImpl
