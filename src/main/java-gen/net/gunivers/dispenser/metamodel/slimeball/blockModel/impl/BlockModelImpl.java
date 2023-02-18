/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import java.util.Collection;
import java.util.Objects;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelDisplayPlace;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelElement;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#get_name <em>name</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#getAmbientOcclusion <em>Ambient Occlusion</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#getTextures <em>Textures</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelImpl extends MinimalEObjectImpl.Container implements BlockModel {
	/**
	 * The default value of the '{@link #get_name() <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_name()
	 * @generated
	 * @ordered
	 */
	protected static final String _NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_name() <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_name()
	 * @generated
	 * @ordered
	 */
	protected String _name = _NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BlockModel parent;

	/**
	 * The default value of the '{@link #getAmbientOcclusion() <em>Ambient Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientOcclusion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AMBIENT_OCCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbientOcclusion() <em>Ambient Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientOcclusion()
	 * @generated
	 * @ordered
	 */
	protected Boolean ambientOcclusion = AMBIENT_OCCLUSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextures() <em>Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextures()
	 * @generated
	 * @ordered
	 */
	protected BlockModelTextures textures;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected BlockModelDisplayPlace display;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockModelElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_name(String new_name) {
		String old_name = _name;
		_name = new_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__NAME, old_name, _name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModel getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (BlockModel)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockModelPackage.BLOCK_MODEL__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModel basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BlockModel newParent) {
		BlockModel oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAmbientOcclusion() {
		return ambientOcclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientOcclusion(Boolean newAmbientOcclusion) {
		Boolean oldAmbientOcclusion = ambientOcclusion;
		ambientOcclusion = newAmbientOcclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__AMBIENT_OCCLUSION, oldAmbientOcclusion, ambientOcclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelTextures getTextures() {
		return textures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextures(BlockModelTextures newTextures, NotificationChain msgs) {
		BlockModelTextures oldTextures = textures;
		textures = newTextures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__TEXTURES, oldTextures, newTextures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextures(BlockModelTextures newTextures) {
		if (newTextures != textures) {
			NotificationChain msgs = null;
			if (textures != null)
				msgs = ((InternalEObject)textures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL__TEXTURES, null, msgs);
			if (newTextures != null)
				msgs = ((InternalEObject)newTextures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL__TEXTURES, null, msgs);
			msgs = basicSetTextures(newTextures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__TEXTURES, newTextures, newTextures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelDisplayPlace getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(BlockModelDisplayPlace newDisplay, NotificationChain msgs) {
		BlockModelDisplayPlace oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(BlockModelDisplayPlace newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockModelPackage.BLOCK_MODEL__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<BlockModelElement>(BlockModelElement.class, this, BlockModelPackage.BLOCK_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				return basicSetTextures(null, msgs);
			case BlockModelPackage.BLOCK_MODEL__DISPLAY:
				return basicSetDisplay(null, msgs);
			case BlockModelPackage.BLOCK_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case BlockModelPackage.BLOCK_MODEL__NAME:
				return get_name();
			case BlockModelPackage.BLOCK_MODEL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BlockModelPackage.BLOCK_MODEL__AMBIENT_OCCLUSION:
				return getAmbientOcclusion();
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				return getTextures();
			case BlockModelPackage.BLOCK_MODEL__DISPLAY:
				return getDisplay();
			case BlockModelPackage.BLOCK_MODEL__ELEMENTS:
				return getElements();
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
			case BlockModelPackage.BLOCK_MODEL__NAME:
				set_name((String)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__PARENT:
				setParent((BlockModel)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__AMBIENT_OCCLUSION:
				setAmbientOcclusion((Boolean)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				setTextures((BlockModelTextures)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__DISPLAY:
				setDisplay((BlockModelDisplayPlace)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends BlockModelElement>)newValue);
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
			case BlockModelPackage.BLOCK_MODEL__NAME:
				set_name(_NAME_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL__PARENT:
				setParent(null);
				return;
			case BlockModelPackage.BLOCK_MODEL__AMBIENT_OCCLUSION:
				setAmbientOcclusion(AMBIENT_OCCLUSION_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				setTextures(null);
				return;
			case BlockModelPackage.BLOCK_MODEL__DISPLAY:
				setDisplay(null);
				return;
			case BlockModelPackage.BLOCK_MODEL__ELEMENTS:
				getElements().clear();
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
			case BlockModelPackage.BLOCK_MODEL__NAME:
				return !Objects.equals(_NAME_EDEFAULT, _name);
			case BlockModelPackage.BLOCK_MODEL__PARENT:
				return parent != null;
			case BlockModelPackage.BLOCK_MODEL__AMBIENT_OCCLUSION:
				return !Objects.equals(AMBIENT_OCCLUSION_EDEFAULT, ambientOcclusion);
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				return textures != null;
			case BlockModelPackage.BLOCK_MODEL__DISPLAY:
				return display != null;
			case BlockModelPackage.BLOCK_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
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

		String result = super.toString() + " (_name: " +
				_name +
				", ambientOcclusion: " +
				ambientOcclusion +
				')';
		return result;
	}

} //BlockModelImpl
