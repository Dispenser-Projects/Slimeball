/**
 */
package net.gunivers.dispenser.metamodel.minecraft.impl;

import net.gunivers.dispenser.metamodel.minecraft.*;

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
public class MinecraftFactoryImpl extends EFactoryImpl implements MinecraftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinecraftFactory init() {
		try {
			MinecraftFactory theMinecraftFactory = (MinecraftFactory)EPackage.Registry.INSTANCE.getEFactory(MinecraftPackage.eNS_URI);
			if (theMinecraftFactory != null) {
				return theMinecraftFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinecraftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinecraftFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		if (eClass.getClassifierID() == MinecraftPackage.MINECRAFT) {
			return createMinecraft();
		}
		throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minecraft createMinecraft() {
		MinecraftImpl minecraft = new MinecraftImpl();
		return minecraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinecraftPackage getMinecraftPackage() {
		return (MinecraftPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinecraftPackage getPackage() {
		return MinecraftPackage.eINSTANCE;
	}

} //MinecraftFactoryImpl
