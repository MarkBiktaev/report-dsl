/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Datasources#getDatasource <em>Datasource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasources()
 * @model
 * @generated
 */
public interface Datasources extends EObject
{
  /**
   * Returns the value of the '<em><b>Datasource</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Datasource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasource</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasource</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasources_Datasource()
   * @model containment="true"
   * @generated
   */
  EList<Datasource> getDatasource();

} // Datasources
