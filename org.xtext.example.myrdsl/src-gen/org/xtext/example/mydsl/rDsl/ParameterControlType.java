/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getParameterControlType()
 * @model
 * @generated
 */
public enum ParameterControlType implements Enumerator
{
  /**
   * The '<em><b>Chb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHB_VALUE
   * @generated
   * @ordered
   */
  CHB(0, "chb", "check-box"),

  /**
   * The '<em><b>Tb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TB_VALUE
   * @generated
   * @ordered
   */
  TB(1, "tb", "text-box"),

  /**
   * The '<em><b>Lb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LB_VALUE
   * @generated
   * @ordered
   */
  LB(2, "lb", "list-box"),

  /**
   * The '<em><b>Rb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RB_VALUE
   * @generated
   * @ordered
   */
  RB(3, "rb", "radio-button"),

  /**
   * The '<em><b>Cb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CB_VALUE
   * @generated
   * @ordered
   */
  CB(4, "cb", "combo-box");

  /**
   * The '<em><b>Chb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Chb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHB
   * @model name="chb" literal="check-box"
   * @generated
   * @ordered
   */
  public static final int CHB_VALUE = 0;

  /**
   * The '<em><b>Tb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TB
   * @model name="tb" literal="text-box"
   * @generated
   * @ordered
   */
  public static final int TB_VALUE = 1;

  /**
   * The '<em><b>Lb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LB
   * @model name="lb" literal="list-box"
   * @generated
   * @ordered
   */
  public static final int LB_VALUE = 2;

  /**
   * The '<em><b>Rb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RB
   * @model name="rb" literal="radio-button"
   * @generated
   * @ordered
   */
  public static final int RB_VALUE = 3;

  /**
   * The '<em><b>Cb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CB
   * @model name="cb" literal="combo-box"
   * @generated
   * @ordered
   */
  public static final int CB_VALUE = 4;

  /**
   * An array of all the '<em><b>Parameter Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ParameterControlType[] VALUES_ARRAY =
    new ParameterControlType[]
    {
      CHB,
      TB,
      LB,
      RB,
      CB,
    };

  /**
   * A public read-only list of all the '<em><b>Parameter Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ParameterControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Parameter Control Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ParameterControlType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ParameterControlType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Parameter Control Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ParameterControlType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ParameterControlType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Parameter Control Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ParameterControlType get(int value)
  {
    switch (value)
    {
      case CHB_VALUE: return CHB;
      case TB_VALUE: return TB;
      case LB_VALUE: return LB;
      case RB_VALUE: return RB;
      case CB_VALUE: return CB;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ParameterControlType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ParameterControlType
