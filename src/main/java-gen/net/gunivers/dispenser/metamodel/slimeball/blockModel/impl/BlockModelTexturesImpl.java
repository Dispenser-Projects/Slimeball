/**
 */
package net.gunivers.dispenser.metamodel.slimeball.blockModel.impl;

import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage;
import net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelTextures;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelTexturesImpl#getParticle <em>Particle</em>}</li>
 *   <li>{@link net.gunivers.dispenser.metamodel.slimeball.blockModel.impl.BlockModelTexturesImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockModelTexturesImpl extends MinimalEObjectImpl.Container implements BlockModelTextures {
	/**
	 * The default value of the '{@link #getParticle() <em>Particle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticle()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTICLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParticle() <em>Particle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticle()
	 * @generated
	 * @ordered
	 */
	protected String particle = PARTICLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelTexturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelPackage.Literals.BLOCK_MODEL_TEXTURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParticle() {
		return particle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticle(String newParticle) {
		String oldParticle = particle;
		particle = newParticle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelPackage.BLOCK_MODEL_TEXTURES__PARTICLE, oldParticle, particle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getVariables() {
		if (variables == null) {
			variables = new EcoreEMap<String,String>(BlockModelPackage.Literals.KEY_VALUE_PAIR, KeyValuePairImpl.class, this, BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		if (featureID == BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES) {
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__PARTICLE:
				return getParticle();
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES:
				if (coreType) return getVariables();
				else return getVariables().map();
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
		switch (featureID) {
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__PARTICLE:
				setParticle((String)newValue);
				return;
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES:
				((EStructuralFeature.Setting)getVariables()).set(newValue);
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
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__PARTICLE:
				setParticle(PARTICLE_EDEFAULT);
				return;
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES:
				getVariables().clear();
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
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__PARTICLE:
				return !Objects.equals(PARTICLE_EDEFAULT, particle);
			case BlockModelPackage.BLOCK_MODEL_TEXTURES__VARIABLES:
				return variables != null && !variables.isEmpty();
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

		String result = super.toString() + " (particle: " +
				particle +
				')';
		return result;
	}

} //BlockModelTexturesImpl
