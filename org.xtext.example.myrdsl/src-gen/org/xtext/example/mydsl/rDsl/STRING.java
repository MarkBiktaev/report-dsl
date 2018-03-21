/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>STRING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSTRING()
 * @model
 * @generated
 */
public enum STRING implements Enumerator
{
  /**
   * The '<em><b>Bar</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BAR_VALUE
   * @generated
   * @ordered
   */
  BAR(0, "bar", "bar"),

  /**
   * The '<em><b>Line</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_VALUE
   * @generated
   * @ordered
   */
  LINE(1, "line", "line"),

  /**
   * The '<em><b>Area</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AREA_VALUE
   * @generated
   * @ordered
   */
  AREA(2, "area", "area"),

  /**
   * The '<em><b>Pie</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PIE_VALUE
   * @generated
   * @ordered
   */
  PIE(3, "pie", "pie");

  /**
   * The '<em><b>Bar</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bar</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BAR
   * @model name="bar"
   * @generated
   * @ordered
   */
  public static final int BAR_VALUE = 0;

  /**
   * The '<em><b>Line</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE
   * @model name="line"
   * @generated
   * @ordered
   */
  public static final int LINE_VALUE = 1;

  /**
   * The '<em><b>Area</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Area</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AREA
   * @model name="area"
   * @generated
   * @ordered
   */
  public static final int AREA_VALUE = 2;

  /**
   * The '<em><b>Pie</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pie</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PIE
   * @model name="pie"
   * @generated
   * @ordered
   */
  public static final int PIE_VALUE = 3;

  /**
   * An array of all the '<em><b>STRING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final STRING[] VALUES_ARRAY =
    new STRING[]
    {
      BAR,
      LINE,
      AREA,
      PIE,
    };

  /**
   * A public read-only list of all the '<em><b>STRING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<STRING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>STRING</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static STRING get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      STRING result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>STRING</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static STRING getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      STRING result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>STRING</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static STRING get(int value)
  {
    switch (value)
    {
      case BAR_VALUE: return BAR;
      case LINE_VALUE: return LINE;
      case AREA_VALUE: return AREA;
      case PIE_VALUE: return PIE;
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
  private STRING(int value, String name, String literal)
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
  
} //STRING
