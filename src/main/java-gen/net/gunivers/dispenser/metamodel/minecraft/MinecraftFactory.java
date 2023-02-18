/**
 */
package net.gunivers.dispenser.metamodel.minecraft;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage
 * @generated
 */
public interface MinecraftFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinecraftFactory eINSTANCE = net.gunivers.dispenser.metamodel.minecraft.impl.MinecraftFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Minecraft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minecraft</em>'.
	 * @generated
	 */
	Minecraft createMinecraft();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MinecraftPackage getMinecraftPackage();

} //MinecraftFactory
