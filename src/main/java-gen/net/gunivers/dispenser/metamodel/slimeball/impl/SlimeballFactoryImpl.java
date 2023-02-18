/**
 */
package net.gunivers.dispenser.metamodel.slimeball.impl;

import net.gunivers.dispenser.metamodel.slimeball.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlimeballFactoryImpl extends EFactoryImpl implements SlimeballFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SlimeballFactory init() {
		try {
			SlimeballFactory theSlimeballFactory = (SlimeballFactory)EPackage.Registry.INSTANCE.getEFactory(SlimeballPackage.eNS_URI);
			if (theSlimeballFactory != null) {
				return theSlimeballFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SlimeballFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlimeballFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		if (eClass.getClassifierID() == SlimeballPackage.SLIMEBALL) {
			return createSlimeball();
		}
		throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slimeball createSlimeball() {
		SlimeballImpl slimeball = new SlimeballImpl();
		return slimeball;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlimeballPackage getSlimeballPackage() {
		return (SlimeballPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SlimeballPackage getPackage() {
		return SlimeballPackage.eINSTANCE;
	}

} //SlimeballFactoryImpl
