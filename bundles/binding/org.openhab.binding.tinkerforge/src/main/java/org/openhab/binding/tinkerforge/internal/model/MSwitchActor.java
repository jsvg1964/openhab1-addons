/**
 * 
 *  openHAB, the open Home Automation Bus.
 *  Copyright (C) 2010-2013, openHAB.org <admin@openhab.org>
 * 
 *  See the contributors.txt file in the distribution for a
 *  full listing of individual contributors.
 * 
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as
 *  published by the Free Software Foundation; either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, see <http://www.gnu.org/licenses>.
 * 
 *  Additional permission under GNU GPL version 3 section 7
 * 
 *  If you modify this Program, or any covered work, by linking or
 *  combining it with Eclipse (or a modified version of that library),
 *  containing parts covered by the terms of the Eclipse Public License
 *  (EPL), the licensors of this Program grant you additional permission
 *  to convey the resulting work.
 * 
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSwitch Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor#getSwitchState <em>Switch State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMSwitchActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MSwitchActor extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch State</b></em>' attribute.
   * The literals are from the enumeration {@link org.openhab.binding.tinkerforge.internal.model.SwitchState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch State</em>' attribute.
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchState
   * @see #setSwitchState(SwitchState)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMSwitchActor_SwitchState()
   * @model unique="false"
   * @generated
   */
  SwitchState getSwitchState();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor#getSwitchState <em>Switch State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch State</em>' attribute.
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchState
   * @see #getSwitchState()
   * @generated
   */
  void setSwitchState(SwitchState value);

} // MSwitchActor
