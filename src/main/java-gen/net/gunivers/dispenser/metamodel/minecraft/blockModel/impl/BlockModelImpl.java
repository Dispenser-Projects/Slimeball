/**
 */
package net.gunivers.dispenser.metamodel.minecraft.blockModel.impl;

import java.util.Collection;
import java.util.Objects;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelDisplayPlace;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelElement;
import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#get_name <em>name</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#getAmbientocclusion <em>Ambientocclusion</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#getTextures <em>Textures</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.blockModel.impl.BlockModelImpl#getElements <em>Elements</em>}</li>
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
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbientocclusion() <em>Ambientocclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientocclusion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AMBIENTOCCLUSION_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAmbientocclusion() <em>Ambientocclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientocclusion()
	 * @generated
	 * @ordered
	 */
	protected Boolean ambientocclusion = AMBIENTOCCLUSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextures() <em>Textures</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextures()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> textures;

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
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAmbientocclusion() {
		return ambientocclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientocclusion(Boolean newAmbientocclusion) {
		Boolean oldAmbientocclusion = ambientocclusion;
		ambientocclusion = newAmbientocclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL__AMBIENTOCCLUSION, oldAmbientocclusion, ambientocclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getTextures() {
		if (textures == null) {
			textures = new EcoreEMap<String,String>(BlockModelPackage.Literals.KEY_VALUE_PAIR, KeyValuePairImpl.class, this, BlockModelPackage.BLOCK_MODEL__TEXTURES);
		}
		return textures;
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
				return ((InternalEList<?>)getTextures()).basicRemove(otherEnd, msgs);
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
				return getParent();
			case BlockModelPackage.BLOCK_MODEL__AMBIENTOCCLUSION:
				return getAmbientocclusion();
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				if (coreType) return getTextures();
				else return getTextures().map();
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
				setParent((String)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__AMBIENTOCCLUSION:
				setAmbientocclusion((Boolean)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				((EStructuralFeature.Setting)getTextures()).set(newValue);
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
				setParent(PARENT_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL__AMBIENTOCCLUSION:
				setAmbientocclusion(AMBIENTOCCLUSION_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				getTextures().clear();
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
				return !Objects.equals(PARENT_EDEFAULT, parent);
			case BlockModelPackage.BLOCK_MODEL__AMBIENTOCCLUSION:
				return !Objects.equals(AMBIENTOCCLUSION_EDEFAULT, ambientocclusion);
			case BlockModelPackage.BLOCK_MODEL__TEXTURES:
				return textures != null && !textures.isEmpty();
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
				", parent: " +
				parent +
				", ambientocclusion: " +
				ambientocclusion +
				')';
		return result;
	}

} //BlockModelImpl
