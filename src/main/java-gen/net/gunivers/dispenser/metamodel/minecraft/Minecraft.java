/**
 */
package net.gunivers.dispenser.metamodel.minecraft;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minecraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.gunivers.dispenser.metamodel.minecraft.Minecraft#getBlockModel <em>Block Model</em>}</li>
 * </ul>
 *
 * @see net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage#getMinecraft()
 * @model
 * @generated
 */
public interface Minecraft extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Model</em>' reference.
	 * @see #setBlockModel(BlockModel)
	 * @see net.gunivers.dispenser.metamodel.minecraft.MinecraftPackage#getMinecraft_BlockModel()
	 * @model
	 * @generated
	 */
	BlockModel getBlockModel();

	/**
	 * Sets the value of the '{@link net.gunivers.dispenser.metamodel.minecraft.Minecraft#getBlockModel <em>Block Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Model</em>' reference.
	 * @see #getBlockModel()
	 * @generated
	 */
	void setBlockModel(BlockModel value);

} // Minecraft
