/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getControltype <em>Controltype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getPromt <em>Promt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getHelp <em>Help</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getHide <em>Hide</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getDuplicate <em>Duplicate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getValuetype <em>Valuetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getParamtype <em>Paramtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Parameter#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Controltype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ParameterControlType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controltype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controltype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterControlType
   * @see #setControltype(ParameterControlType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Controltype()
   * @model
   * @generated
   */
  ParameterControlType getControltype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getControltype <em>Controltype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controltype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterControlType
   * @see #getControltype()
   * @generated
   */
  void setControltype(ParameterControlType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Promt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promt</em>' attribute.
   * @see #setPromt(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Promt()
   * @model
   * @generated
   */
  String getPromt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getPromt <em>Promt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Promt</em>' attribute.
   * @see #getPromt()
   * @generated
   */
  void setPromt(String value);

  /**
   * Returns the value of the '<em><b>Help</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help</em>' attribute.
   * @see #setHelp(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Help()
   * @model
   * @generated
   */
  String getHelp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getHelp <em>Help</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Help</em>' attribute.
   * @see #getHelp()
   * @generated
   */
  void setHelp(String value);

  /**
   * Returns the value of the '<em><b>Hide</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide</em>' containment reference.
   * @see #setHide(BooleanLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Hide()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getHide();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getHide <em>Hide</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide</em>' containment reference.
   * @see #getHide()
   * @generated
   */
  void setHide(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' containment reference.
   * @see #setRequired(BooleanLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Required()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getRequired();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getRequired <em>Required</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' containment reference.
   * @see #getRequired()
   * @generated
   */
  void setRequired(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Duplicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duplicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duplicate</em>' containment reference.
   * @see #setDuplicate(BooleanLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Duplicate()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getDuplicate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getDuplicate <em>Duplicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duplicate</em>' containment reference.
   * @see #getDuplicate()
   * @generated
   */
  void setDuplicate(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Valuetype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ParameterValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuetype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuetype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterValueType
   * @see #setValuetype(ParameterValueType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Valuetype()
   * @model
   * @generated
   */
  ParameterValueType getValuetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getValuetype <em>Valuetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuetype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterValueType
   * @see #getValuetype()
   * @generated
   */
  void setValuetype(ParameterValueType value);

  /**
   * Returns the value of the '<em><b>Paramtype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramtype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramtype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterType
   * @see #setParamtype(ParameterType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Paramtype()
   * @model
   * @generated
   */
  ParameterType getParamtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getParamtype <em>Paramtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramtype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ParameterType
   * @see #getParamtype()
   * @generated
   */
  void setParamtype(ParameterType value);

  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @see #setDatatype(DataType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Datatype()
   * @model
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(ParameterValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameter_Values()
   * @model containment="true"
   * @generated
   */
  ParameterValue getValues();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Parameter#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(ParameterValue value);

} // Parameter
